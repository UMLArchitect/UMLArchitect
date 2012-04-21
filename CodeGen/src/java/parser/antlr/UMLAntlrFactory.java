/*
 * UML ARCHITECT GENCODE (Equipe R. Mogos)
 * Auteur: Thomas Raynal (AL4 Alt)
 * Date:24/03/2012
 * Contact: thomas.raynal2@gmail.com
 */
package uml.java.parser.antlr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import uml.entities.classes.UMLClass;
import uml.entities.classes.UMLEnum;
import uml.entities.classes.UMLField;
import uml.entities.classes.UMLMethod;
import uml.entities.classes.UMLPackage;
import uml.entities.interfaces.IUMLObject;
import uml.java.lexer.JavaLexerAntlr;
import antlr.ASTFactory;
import antlr.CommonAST;
import antlr.RecognitionException;
import antlr.TokenStreamException;
import antlr.collections.AST;

/**
 * Generic Exception to handle tree parsing errors
 */
class TreeParsingException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public TreeParsingException (String msg)
	{
		super(msg);
	}	
}

/**
 * A factory for creating UML objects from an ANTLR AST.
 */
public class UMLAntlrFactory implements JavaTokenTypes {

    
    /** The _ast. */
    private AST _ast;
    
    /** The _set ast. */
    private AST _setAst;
    
    /** The _file. */
    private String _file;
    
    /**
     * The Enum CONTAINER_TYPE.
     */
    private enum CONTAINER_TYPE
    {
    	
	    /** The CLAS s_ o r_ interface. */
	    CLASS_OR_INTERFACE,
    	
	    /** The ENUM. */
	    ENUM
    }
	
	/**
	 * Instantiates a new uML antlr factory.
	 *
	 * @param fileName the file name
	 */
	public UMLAntlrFactory (String fileName)
	{
		super();
		_file = fileName;
	}
	
 
	
	/**
	 * Creates the AST and prepare it for a parsing work.
	 */
	private void createAst () 
	{
		ASTFactory f = new ASTFactory();
	     _setAst = f.create(0, "AST ROOT");
	     _setAst.setFirstChild(_ast);
	}
	
	
	/**
	 * Checks if is literal.
	 *
	 * @param node the node
	 * @return true, if is literal
	 */
	private boolean isLiteral(AST node)
	{
		return 
			(node.getType()>77 &&  node.getType()<86)||
			(node.getType()>87 &&  node.getType()<96)||
			(node.getType()>37 &&  node.getType()<41)||
			(node.getType()>155 &&  node.getType()<159)||
			node.getType()==65
			;
	}

	/**
	 * Checks if is value.
	 *
	 * @param node the node
	 * @return true, if is value
	 */
	private boolean isValue(AST node)
	{
		return 	(node.getType()>159 &&  node.getType()<166);
	}

	/**
	 * Handle a source code file parsing 
	 */
	private void prepare () 
	{
		if (null==_ast)
		{
			
         File file = new File(_file);
         String fileName = file.getName();
         
         BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
         JavaLexerAntlr lexer = new JavaLexerAntlr(reader);
         lexer.setFilename(fileName);
         
         JavaRecognizer parser = new JavaRecognizer(lexer);
         parser.setFilename(fileName);
         try {
			parser.compilationUnit();
		} catch (RecognitionException e) {
			e.printStackTrace();
		} catch (TokenStreamException e) {
			e.printStackTrace();
		}
         
         _ast = parser.getAST();
         CommonAST.setVerboseStringConversion(true, parser.getTokenNames());
		}

	}
	
	/**
	 * Parses the package.
	 *
	 * @return the uML package
	 */
	public UMLPackage parsePackage()
	{
		prepare();
		createAst();
		
		AST c = _setAst.getFirstChild();
		UMLPackage p = new UMLPackage();
		List<String> imports= new ArrayList<String>();
				
		while (c != null) {
	         int type = c.getType();

	         switch (type) {	 
	         case ENUM_DEF:
	        	p.addClass(parseEnum(c));
	        	 break;
	         case PACKAGE_DEF:
	        	 p.setIdentifier(parseQualifiedName(c));
	             break;
	         case IMPORT:
	        	 imports.add(parseQualifiedName(c));
	             break;
	         case CLASS_DEF:
	        	 p.addClass(parseClassOrInterface(c));
	             break;
	         case INTERFACE_DEF:
	        	 p.addClass(parseClassOrInterface(c));
	        	 break;
	         }

	         c = c.getNextSibling();
	     } 
		
		for (IUMLObject cls: p.getClasses()) {
			if (cls.getType().equals(UMLClass.class))
			{
		    	 ((UMLClass)cls).setPackage(p);
		    	 ((UMLClass)cls).setInclude(imports);
			}
		}
		return p;
	}
	
	/**
	 * Gets the modifiers.
	 *
	 * @param node the node
	 * @return the modifiers
	 */
	private List<String> getModifiers(AST node)
	{
		List<String> l = new ArrayList<String>();
		AST c = node.getFirstChild();
		{
		     while (c != null) {
		         if (isLiteral(c))
		         {
		        	 l.add(c.getText());
		         }
		         c=c.getNextSibling();
		     }
		}
		
		return l;
	}
	
	/**
	 * Parses the enum.
	 *
	 * @param node the node
	 * @return the uML enum
	 */
	private UMLEnum parseEnum(AST node) {
		
	     AST c = node.getFirstChild();
	     UMLEnum e = new UMLEnum();
	     List<IUMLObject> members = new ArrayList<IUMLObject>();
	     
	     while (c != null) {
	         int type = c.getType();
	         
	         if (type == MODIFIERS)
	         {
	        	for (String str: getModifiers(c)) {
	        		 e.setModifiers(str);
				} 
	         }
	         else if (type == IDENT)
	         {
	        	 e.setIdentifier(c.getText());
	         }
	         else if (type == IMPLEMENTS_CLAUSE)
	         {
	        	 e.setImplementsList(c.getText());
	         }
	         else if (type == OBJBLOCK)
	         {
	        	 AST c1 = c.getFirstChild();
	        	  while (c1 != null) {
	        		  if (c1.getType() == ENUM_CONSTANT_DEF)
	        		  {
	        			 for (String str : parseLiterals(c1)) {
	        				 e.setEntries(str);
						} 
	        		  }
	        		  c1 = c1.getNextSibling();
	        	  }
	        	  
	        	 members = parseObjectBlock(c);
	        	 
	        	 try {
					e = (UMLEnum)dispatchMembers(members,e,CONTAINER_TYPE.ENUM);
				} catch (TreeParsingException e1) {
					e1.printStackTrace();
				}
		             break;
	        	  
	        	  
	         }
	         c = c.getNextSibling();
	     }
	     return e;
	}


	/**
	 * Parses the qualified name.
	 *
	 * @param node the node
	 * @return the string
	 */
	private String parseQualifiedName(AST node)
	{
			 String s="";
		     AST c = node.getFirstChild();
		     while (c != null) {
		         int type = c.getType();
		         if (type == DOT)
		             s = parseQualifiedName(c);
		         else if (type == IDENT) {
		             if (!c.getText().equals(""))
		                 s += c.getText() + ".";
		         }
		         c = c.getNextSibling();
		     } 	     
		     return s;
	}
	
	 /**
 	 * Parses the class or interface.
 	 *
 	 * @param node the node
 	 * @return the uML class
 	 */
 	private UMLClass parseClassOrInterface(AST node) {

		     AST c = node.getFirstChild();
		     UMLClass clsOrInt = new UMLClass();
		     List<IUMLObject> members = new ArrayList<IUMLObject>();
		     
		     while (c != null) {
		         int type = c.getType();
		         switch (type) {
		         case MODIFIERS:
		        	clsOrInt.setModifiers(getModifiers(c));
		        	 break;
		         case IDENT:
		        	 clsOrInt.setIdentifier(c.getText());
		             break;
		         case EXTENDS_CLAUSE:
		        	 for (String str: parseLiterals(c)) {
		        		 clsOrInt.setHeritage(str);
					}
		             break;
		         case IMPLEMENTS_CLAUSE:
		        	 for (String str: parseLiterals(c)) {
		        		 clsOrInt.setImplementations(str);
					}
		         case OBJBLOCK:
		     
		        	 members = parseObjectBlock(c);
		        	 
		        	 try {
		        		 clsOrInt = (UMLClass)dispatchMembers(members,clsOrInt,CONTAINER_TYPE.CLASS_OR_INTERFACE);
					} catch (TreeParsingException e1) {
						e1.printStackTrace();
					}
		             break;
		         }

		         c = c.getNextSibling();

		     } 
		     
		     for (IUMLObject obj :members) {
		       	  if (obj.getType()==UMLMethod.class)
		       	  {
		       		  clsOrInt.addMethod((UMLMethod)obj);
		       	  }
		       	  else if (obj.getType()==UMLField.class)
		       	  {
		       		  clsOrInt.setFields((UMLField)obj);
		       	  }
		       	  else if (obj.getType()==UMLEnum.class)
		       	  {
		       		  clsOrInt.setEnums((UMLEnum)obj);
		       	  }
				 }
		    
		     return clsOrInt;

		 }
	 
	 /**
 	 * Parses the object block.
 	 *
 	 * @param node the node
 	 * @return the list
 	 */
 	private List<IUMLObject> parseObjectBlock( AST node)
	 {
		String[] targetMembers =  {"METHOD_DEF","VARIABLE_DEF","ENUM_DEF"};
		List<IUMLObject> members = new ArrayList<IUMLObject>();
		AST c1 = node.getFirstChild();
     	while (c1 != null) {
	     	 if (Arrays.asList(targetMembers).contains(c1.getText()))
	     	 { 
	     		 IUMLObject m=null;
	     		 if ((m= parseClassMembers(c1))!=null)
	     			 	members.add(m);
	     	 }
	     	 
	     	 c1 = c1.getNextSibling();
     	    }
     	return members;
	 }
	 
	 /**
 	 * Dispatch members.
 	 *
 	 * @param umlObjects the uml objects
 	 * @param container the container
 	 * @param containerType the container type
 	 * @return the iUML object
 	 * @throws TreeParsingException the tree parsing exception
 	 */
 	private IUMLObject dispatchMembers (List<IUMLObject> umlObjects, IUMLObject container, CONTAINER_TYPE containerType ) throws TreeParsingException 
	 {
		 
		 if (containerType==CONTAINER_TYPE.CLASS_OR_INTERFACE)
		 {
		     for (IUMLObject obj :umlObjects) {
		       	  if (obj.getType()==UMLMethod.class)
		       	  {
		       		((UMLClass)container).addMethod((UMLMethod)obj);
		       	  }
		       	  else if (obj.getType()==UMLField.class)
		       	  {
		       		((UMLClass)container).setFields((UMLField)obj);
		       	  }
		       	  else if (obj.getType()==UMLEnum.class)
		       	  {
		       		((UMLClass)container).setEnums((UMLEnum)obj);
		       	  }
				 }
		 }
		 
		 else if (containerType==CONTAINER_TYPE.ENUM)
		 {
			 ((UMLEnum)container).setMembers(umlObjects);
		 }
		 
		 else
		 {
			 throw new TreeParsingException("Method dispatch member: invalid container");
		 }
		 
		 return container;
		 
	 }
	 
	 /**
 	 * Parses the literals.
 	 *
 	 * @param node the node
 	 * @return the list
 	 */
 	private List<String> parseLiterals(AST node) {

		     AST c = node.getFirstChild();
		     List<String> literals = new ArrayList<String>();
		     
		     while (c != null) {
		         int type = c.getType();
		         switch (type) {
		         case IDENT:
		        	 literals.add(c.getText());
		             break;
		         }
		         c = c.getNextSibling();
		     } 
		     return literals;
		 }


	 /**
 	 * Parses the class members.
 	 *
 	 * @param node the node
 	 * @return the iUML object
 	 */
 	private IUMLObject parseClassMembers (AST node)
	 { 
		 IUMLObject classMember = null;
		 
		 while (node != null) {
			 
	         if (node.getType()== METHOD_DEF)
	         {
	        	 classMember = parseMethod(node);
	        	 break; 
	         }
	         else if (node.getType()== VARIABLE_DEF)
	         {
	        	 classMember = parseField(node);
	        	 break; 
	         }
	         else if (node.getType()== ENUM_DEF)
	         {
	        	 classMember = parseEnum(node);
	        	 break; 
	         }
	        	 
	         node = node.getNextSibling();
	     } 
		 return classMember;
	 }
	 
	 /**
 	 * Parses the parameter.
 	 *
 	 * @param node the node
 	 * @return the list
 	 */
 	private List<UMLField> parseParameter (AST node)
	 {
		 List <UMLField> f = new ArrayList<UMLField>();
		 AST c = node.getFirstChild();
		 AST c2 =c;
		 
		 while (c != null) {
			 
			 if (c.getType()==PARAMETER_DEF)
			 {
				 c = c.getFirstChild(); 
			 }
			 
			 else if (c.getType()==MODIFIERS)
			 {
				 c = c.getNextSibling();
			 }
			 
			 if (c.getType()==TYPE )
			 {
				 UMLField field = new UMLField();
				 
				 if (c.getFirstChild().getType()==ARRAY_DECLARATOR)
				 {
					field.setIsArray(true);
					field.setType(c.getFirstChild().getFirstChild().getText());
				 }
				 
				 else
				 {
					 field.setType(c.getFirstChild().getText());
				 }
				 
				 field.setIdentifier(c.getNextSibling().getText());
				 
				 f.add(field);
				 c = c2.getNextSibling();
				 c2= c;	 
			 }
		 }
		 
		 return f;
	 }
	 
	 /**
 	 * Parses the method.
 	 *
 	 * @param node the node
 	 * @return the uML method
 	 */
 	private UMLMethod parseMethod(AST node)
	 {
	 		 AST c = node.getFirstChild();
			 UMLMethod m = new UMLMethod();
			 List<UMLField> f = new ArrayList<UMLField>();
	 	     while (c != null) {
	 	         int type = c.getType();

	 	         switch (type) {
	 	         case IDENT:
	 	        	 m.setIdentifier(c.getText());
	 	        	 break;
	 	         case MODIFIERS:
						m.setModifiers(getModifiers(c));
	 	        	 break;
	 	         case PARAMETERS:
	 	        	 for (UMLField umlField : parseParameter(c)) {
	 	        		f.add(umlField);
					}
	 	        	break;
	 	         case TYPE:
	 	        	 m.setReturnType(this.getTypeOf(c,m));
	 	         }
	 	         c = c.getNextSibling();
	 	     }
	 	     
	 	     m.setParameters(f);
	 	     return m; 
	 }
	 

	 
	 /**
 	 * Parses the field.
 	 *
 	 * @param node the node
 	 * @return the uML field
 	 */
 	private UMLField parseField(AST node)
	 {
		 		AST c = node.getFirstChild();
		 		UMLField m = new UMLField();
		 	     while (c != null) {
		 	         int type = c.getType();
		 	         switch (type) {
		 	         case IDENT:
		 	        	 m.setIdentifier(c.getText());
		 	        	 break;
		 	         case MODIFIERS:
		 	        	m.setModifiers(getModifiers(c));
		 	        	 break;
		 	         case TYPE:
		 	        	m.setType(getTypeOf(c,m));
		 	        	break;
		 	         case ARRAY_DECLARATOR:
		 	        	m.setIsArray(true);
		 	        	break;
		 	         case ASSIGN:
		 	        	 AST c1 = c.getFirstChild();
		 	        	 
			 	        	 if (m.isArray())
			 	        	 {
			 	        		m = parseArray(c1, m); 
			 	        		break;
			 	        	 }
				        	while (c1 != null ) {
				        		if (isLiteral (c1))
				        		{
				        			m.setValue(c1.getText());
				        		}
				        		else if (isValue(c1))
				        		{
				        			m.setValue(c1.getText());
				        		}
				        		 	c1 = c1.getFirstChild();
				        	    }
		 	         	break;
		 	         }
		 	         c = c.getNextSibling();

		 	     } 
		return m; 
	 }
	 
	 /**
 	 * Parses the array.
 	 *
 	 * @param node the node
 	 * @param f the f
 	 * @return the uML field
 	 */
 	private UMLField parseArray(AST node, UMLField f)
	 {
		 AST c1 = node;
		 
    		while (c1 != null ) {
    			
    			if (null!=c1 && c1.getType()==ARRAY_DECLARATOR)
    			{
    				c1 = c1.getFirstChild().getFirstChild();
    				f.setArrayCount(Integer.valueOf(c1.getText()));
    			}
    			
    			else if (null!=c1 && c1.getType()==LITERAL_new)
    			{
    				f.setArrayCount(Integer.valueOf(c1.getFirstChild().getNextSibling().getFirstChild().getFirstChild().getText()));
    				break;
    			}
    			
    			else if (c1.getType()== ARRAY_INIT)
    			{
    				AST c2= c1.getFirstChild();
    				while (null !=c2)
    				{
    				if (null!=c2 && c2.getType()== EXPR)
	    				{
	    					f.arrayValues.add(c2.getFirstChild().getText());
	    				}
    					c2= c2.getNextSibling();
    				}
    				break;
    			}

    			else if (null!=c1 && c1.getType()== EXPR)
    			{
    				AST c2= c1;
    				
    				while (c2 != null ) {
    					
    					if (null!=  c2.getFirstChild() && isValue(c2.getFirstChild()))
    					{
    						f.arrayValues.add(c2.getText());						
    					}
    					
    					else if (null!=c2 && c2.getType()== LITERAL_new)
    					{
    						int val = Integer.valueOf(c2.getFirstChild().getNextSibling().getFirstChild().getFirstChild().getText());
    						f.setArrayCount(val) ;
    					}
    					
    					c2 = c2.getFirstChild();
    				}
    				break;
    			}
    			
    			else if (null!=c1 && isValue(c1))
    			{
    				AST c2= c1;
    				while (c2 != null ) {
    					
    					if (isValue(c2))
    					{
    						f.arrayValues.add(c2.getText());						
    					}
    					c2 = c2.getNextSibling();
    				}
       			}

    			else if (null!=c1 && isLiteral(c1))
    			{
    				AST c2= c1;
    				while (c2 != null ) {
    					
    					if (isValue(c2))
    					{
    						f.arrayValues.add(c2.getText());						
    					}
    					
    					else if (c2.getType()==ARRAY_DECLARATOR)
    					{
    						c2 = c2.getFirstChild();
    					}
    					
    					else if (c2.getType()==EXPR)
    					{
    						c2 = c2.getFirstChild();						
    					}
    					
    					c2 = c2.getNextSibling();
    				}
    			}
    			
    		if (null!=c1)
    			c1 = c1.getFirstChild();
    		}
    		return f;
   
	 }
	 


	 /**
 	 * Gets the type of.
 	 *
 	 * @param n the n
 	 * @param o the o
 	 * @return the type of
 	 */
 	private String getTypeOf (AST n, IUMLObject o)
	 {
		 AST c = n.getFirstChild();
		 String type_="";
		 
	     while (n != null) {
	         int type = c.getType();	        
	         if (type== ARRAY_DECLARATOR)
	         {
	        	if (o.getType()==UMLField.class)
	        	{
	        		((UMLField)o).setIsArray(true);
	        	}
	        	type_= c.getFirstChild().getText();
	        	break;
	         }
	         else if (isLiteral(c)||c.getType()==IDENT)
	         {
	        	 type_= c.getText();
	        	 break;
	         }
	         
	         else if (c.getType()==DOT)
	         {	 
	        	 type_ = parseQualifiedName(c);
	        	 break;
	         }
	         
	         n = n.getNextSibling();
	       }
	     
	     return type_;
		 
	 }
	 
	 
	
	
}
