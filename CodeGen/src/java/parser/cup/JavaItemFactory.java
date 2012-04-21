/*
 * UML ARCHITECT GENCODE (Equipe R. Mogos)
 * Auteur: Thomas Raynal (AL4 Alt)
 * Date:24/03/2012
 * Contact: thomas.raynal2@gmail.com
 */
package uml.java.parser.cup;

import java.lang.reflect.Modifier;
import java.util.Stack;

import java_cup.runtime.Symbol;
import uml.java.modeling.body.ClassOrInterfaceDeclaration;
import uml.java.modeling.body.FieldDeclaration;
import uml.java.modeling.body.MethodDeclaration;
import uml.java.modeling.body.ModifierSet;
import uml.java.modeling.body.Parameter;
import uml.java.modeling.body.Variable;
import uml.java.modeling.compilation.ImportDeclaration;
import uml.java.modeling.compilation.PackageDeclaration;
import uml.java.modeling.interfaces.IMembers;


// TODO: Auto-generated Javadoc
/**
 * A factory for creating JavaItem objects.
 */
public class JavaItemFactory {

	/** The _items. */
	private Stack<JavaSymbol> _items;
	
	/** The _items_backup. */
	private Stack<JavaSymbol> _items_backup;
	
	/** The _members. */
	private Stack<IMembers> _members;
	
	/** The _class implements. */
	private Stack<String> _classImplements;
	
	/** The _class extends. */
	private Stack<String> _classExtends;
	
	/** The pause parse. */
	private boolean pauseParse= false;
	
	/** The class modifiers. */
	private int classModifiers=1;
	
	/** The class access modifiers. */
	private int classAccessModifiers=1;
	
	/**
	 * Sets the pause parse.
	 *
	 * @param pause the new pause parse
	 */
	public void setPauseParse (boolean pause)
	{
		pauseParse = pause;
	}
	
	/**
	 * Instantiates a new java item factory.
	 */
	public JavaItemFactory ()
	{
		_items = new Stack<JavaSymbol>();
		_members = new Stack<IMembers>();
		_classImplements = new Stack<String>();
		_classExtends = new Stack<String>();
	}

	/**
	 * Adds the item.
	 *
	 * @param s the s
	 */
	public void addItem(Symbol s)
	{
		
		if (pauseParse)
			return;
		
		if (s.getClass().equals(JavaSymbol.class))
		{
			if (((JavaSymbol)s).sym==Sym.EXTENDS)
			{
				ConsumeExtends();
				return;
			}
			
			if (((JavaSymbol)s).sym==Sym.IMPLEMENTS)
			{
				ConsumeImplements();
				return;
			}
			
			
			if (classModifiers==1&& ModifierSet.isModifier(s.sym)>0)
			{
				JavaSymbol jvs = (JavaSymbol)s;
				
					if (ModifierSet.isAccessModifier(ModifierSet.isModifier(jvs.sym)))
					{
						if (classAccessModifiers==1)
						{
							classAccessModifiers=0;
							jvs.setTag(1);
							_items.add(jvs);
							return;
						}
					}
					else
					{
						classAccessModifiers=0;
						jvs.setTag(1);
						_items.add(jvs);
						return;
					}
				}
			
			_items.add((JavaSymbol)s);
			}
	}
	
	/**
	 * Consume extends.
	 */
	private void ConsumeExtends()
	{	Symbol item;
		
		while (_items.size()>0 &&(item=_items.pop())!= null)
		{
			if (item.sym!= Sym.IDENTIFIER)
			{
				_items.push((JavaSymbol) item);
				break;
			}
				
			this._classExtends.push(item.value.toString());
		}
		
		
	}
	
	/**
	 * Consume implements.
	 */
	private void ConsumeImplements()
	{
		Symbol item;
		while (_items.size()>0 &&(item=_items.pop())!= null)
		{
			if (item.sym!= Sym.IDENTIFIER)
			{
				_items.push((JavaSymbol) item);
				break;
			}
			this._classImplements.push(item.value.toString());
		}
	}
	
	/**
	 * Adds the member.
	 *
	 * @param member the member
	 */
	public void addMember(IMembers member)
	{
		_members.add(member);
	}
	
	/**
	 * Reset unconsumed tokens.
	 *
	 * @param stack the stack
	 */
	private void resetUnconsumedTokens (Stack<JavaSymbol> stack)
	{
		Symbol item;
		while (stack.size()>0 &&(item=stack.pop())!= null)
		{
			_items.push((JavaSymbol) item);
		}
	}
	
	/**
	 * Convert the method declaration.
	 *
	 * @param isVoid the is void
	 * @return the method declaration
	 */
	public MethodDeclaration toMethodDeclaration(boolean isVoid)
	{
		Symbol item;
		MethodDeclaration method = new MethodDeclaration();
		Stack<JavaSymbol> unconsumedTokens = new Stack<JavaSymbol>();
		int isConsumed =0;
		Parameter parameter=null;
		int consumeModifiers =0;
		int flag=0;
		int consumeParameter=0;
		int t;
		int modifier=0;
		
		classModifiers=0;
		
		if (isVoid)
			method.setType("void");
		
		if (_items.size()==0)
			return null;
		
		method.setName(_items.pop().value.toString());

		while (_items.size()>0 &&(item=_items.pop())!= null)
		{

			isConsumed =0;
			
			if ((t = ModifierSet.isModifier (item.sym))>0 && consumeModifiers==0&&((JavaSymbol)item).getTag()==0)
			{
				flag=1;
				isConsumed =1;
				modifier =ModifierSet.addModifier(modifier, t);
				method.setModifiers(modifier);
				
				if (ModifierSet.isAccessModifier(t))
				{
					consumeModifiers=1;
				}
			}
			
			if (item.sym==Sym.IDENTIFIER)
			{
				if(flag==1)
				{
					consumeModifiers=1;
				}
				
				if(!isVoid)
				{
					method.setType(item.value.toString());
				}
				
				if (consumeParameter==1)
				   {
		
					isConsumed =1;
					parameter.setType(item.value.toString());
					method.setParameters(parameter);
					consumeParameter=0;
				}
				
				else
				{
					
				isConsumed =1;
				parameter = new Parameter();
				parameter.setId(item.value.toString());
				consumeParameter =1;
				}
			}
			
			if (JavaItemFactoryHelper.isPrimitive(item.sym))
			{
				if(flag==1)
				{
					consumeModifiers=1;
				}

				if (consumeParameter>0)
				{
				isConsumed =1;
				parameter.setType(JavaItemFactoryHelper.primitiveToString(item.sym));
				method.setParameters(parameter);
				consumeParameter=0;
				}
				else
				{
					
					method.setType(JavaItemFactoryHelper.primitiveToString(item.sym));
					isConsumed =1;
				}	
			}
			
			if (isConsumed ==0)
			{
				unconsumedTokens.push((JavaSymbol) item);
			}
		}
		
		resetUnconsumedTokens(unconsumedTokens);
		
		if(modifier==0)
			method.setModifiers(ModifierSet.PRIVATE);
		
		return method;
	}
	
	/**
	 * Convert the package declaration.
	 *
	 * @return the package declaration
	 */
	public PackageDeclaration toPackageDeclaration ()
	{
		Symbol item;
		PackageDeclaration pack = new PackageDeclaration();
		
		while (_items.size()>0 &&(item=_items.pop())!= null)
		{
			switch (item.sym)
			{
			case Sym.IDENTIFIER:
				pack.setName(item.value.toString());
				break;
			}
		}
		_items.empty();
		return pack;
	}

	/**
	 * Convert the import declaration.
	 *
	 * @param onDemand the on demand
	 * @return the import declaration
	 */
	public ImportDeclaration toImportDeclaration (boolean onDemand)
	{
		Symbol item;
		ImportDeclaration imp = new ImportDeclaration();
		
		while (_items.size()>0 &&(item=_items.pop())!= null)
		{
			switch (item.sym)
			{
			case Sym.IDENTIFIER:
				imp.setName(item.value.toString());
				break;
			}
		}

		if (onDemand)
			imp.setAsterisk(true);
		
			_items.empty();
		
		return imp;
	}
	
	/**
	 * Convert the class declaration.
	 *
	 * @param isInterface the is interface
	 * @return the class or interface declaration
	 */
	public ClassOrInterfaceDeclaration toClassDeclaration(boolean isInterface)
	{
		Symbol item;
		ClassOrInterfaceDeclaration cls = new ClassOrInterfaceDeclaration();
		int modifier=0;
		int t  =0;
		String classElements;
		cls.setInterface(isInterface);
		
		while (_items.size()>0 &&(item=_items.pop())!= null)
		{
			if ((t = ModifierSet.isModifier (item.sym))>0 && ((JavaSymbol)item).getTag()==1)
			{
				modifier =ModifierSet.addModifier(modifier, t);
				
			}
			
			if (item.sym==Sym.IDENTIFIER)
			{
					cls.setName(item.value.toString());
			}
		}
		
		if(modifier==0)
			modifier=ModifierSet.PRIVATE;
		
		cls.setModifiers(modifier);
		
		
		for (IMembers m : _members) {
			cls.setMembersList(m);
		}
		
		_members.clear();
		
		
		while (_classExtends.size()>0&&(classElements =_classExtends.pop())!=null)
		{
			cls.setExtends(classElements);
		}

		while (_classImplements.size()>0 &&(classElements =_classImplements.pop())!=null)
		{
			cls.setImplements(classElements);
		}

		
		return cls;
		
	}

	//refactor
	/**
	 * Convert the field declaration_reference.
	 *
	 * @return the field declaration
	 */
	@SuppressWarnings("unchecked")
	public FieldDeclaration toFieldDeclaration_reference()
	{
		if (pauseParse)
			return null;
		
		Symbol item;
		Stack<String> identifiers = new Stack<String>();
		Stack<String> values = new Stack<String>();
		Stack<JavaSymbol> unconsumedTokens = new Stack<JavaSymbol>();
		int isConsumed =0;
		int modifier = 0;
		int consumeModifiers =0;
		int consumeIdentifier =0;
		int consumeType =0;
		int isArray=0;
		int t=0;
		int consumeInitializer=0;
		FieldDeclaration f = new FieldDeclaration();
		
		_items_backup = (Stack<JavaSymbol>) _items.clone();
		
		classModifiers=0;
		
		if (_items.size()>0&&_items.peek().value==null)
			return null;
		
		while (_items.size()>0 &&(item=_items.pop())!= null)
		{
			
			isConsumed =0;
			if (item.sym==Sym.NEW)
			{
				consumeInitializer=1;
				isConsumed =1;
			}
			
			if (item.sym==Sym.ARRAY)
			{
				isArray =1;
				isConsumed =1;
			}
			
			if (item.sym==Sym.IDENTIFIER && consumeIdentifier==0)
			{
				if (consumeInitializer>0)
				{
					consumeInitializer=0;
					isConsumed =1;
				}
				else
				{
					identifiers.add(item.value.toString());
					isConsumed =1;
				}
			}
			
			else if (item.sym==Sym.IDENTIFIER && consumeIdentifier==1&&consumeType==0)
			{
				f.setType(item.value.toString());
				isConsumed =1;
				consumeType=1;
			}
			
			if (JavaItemFactoryHelper.isLiteral(item.sym))
			{
				values.add(item.value.toString());
				isConsumed =1;
			}
			
			if (JavaItemFactoryHelper.isPrimitive(item.sym))
			{
				
				f.setType(JavaItemFactoryHelper.primitiveToString(item.sym));
				
				String var;
				String value;
				while (identifiers.size()>0 && (var=identifiers.pop())!= null)
				{
					
					if (isArray==1)
					{
						f.setVariables(new Variable(var,0));
					}
					else
						f.setVariables(new Variable(var));
					
					if (values.size()>0)
					{
						value = values.pop();
						f.setValue(value);
					}
				}
			
				while (_items.size()>0 &&(item=_items.pop())!= null)
				{
					
					if ( ModifierSet.isModifier (item.sym)<=0)
					{
						unconsumedTokens.push((JavaSymbol) item);
						break;
					}
					
					if ((t = ModifierSet.isModifier (item.sym))>0 && consumeModifiers==0&&((JavaSymbol)item).getTag()==0)
						{
							modifier =ModifierSet.addModifier(modifier, t);
							f.setModifiers(modifier);
						}
					
					else
					{
						unconsumedTokens.push((JavaSymbol) item);
					}
				}
				
				
				
				if (f.getModifiers()==0)
					f.setModifiers(Modifier.PRIVATE);
				
				resetUnconsumedTokens(unconsumedTokens);
				
				return f;
			}
			
			if (isConsumed ==0)
			{
				unconsumedTokens.push((JavaSymbol) item);
			}
			
		}
		
		
		String lit="";
		
		if (identifiers.size()>0)
		{
		
			while (_items.size()>0 &&(item=_items.pop())!= null)
			{
				if ( ModifierSet.isModifier (item.sym)<=0)
				{
					unconsumedTokens.push((JavaSymbol) item);
					break;
				}

				if ((t = ModifierSet.isModifier (item.sym))>0 && consumeModifiers==0&&((JavaSymbol)item).getTag()==0)
					{
						modifier =ModifierSet.addModifier(modifier, t);
						f.setModifiers(modifier);
					}
				
				else
				{
					unconsumedTokens.push((JavaSymbol) item);
				}
			}
		boolean flag=false;
		while (identifiers.size()>0 &&(lit=identifiers.pop())!= null)
			{
				if (f.getType()==null&&flag==false)
				{
					f.setType(lit);
					flag = true;
				}
				else
					f.setVariables(new Variable(lit));
			}
		

		
		
		if (f.getModifiers()==0)
			f.setModifiers(Modifier.PRIVATE);

		
		resetUnconsumedTokens(unconsumedTokens);
		
		return f;
		}
		
		_items  = (Stack<JavaSymbol>) _items_backup.clone();
		return null;
	}
	
	
	/**
	 * Convert the field declaration_primitive.
	 *
	 * @return the field declaration
	 */
	@SuppressWarnings("unchecked")
	public FieldDeclaration toFieldDeclaration_primitive()
	{
		
		if (pauseParse)
			return null;
		
		Symbol item;
		Stack<String> identifiers = new Stack<String>();
		Stack<String> values = new Stack<String>();
		FieldDeclaration f = new FieldDeclaration();
		Stack<JavaSymbol> unconsumedTokens = new Stack<JavaSymbol>();
		int isConsumed =0;
		int modifier = 0;
		int consumeModifiers =0;
		int t;
		int isArray=0;
		
		classModifiers=0;
		
		if (_items.size()>0&&_items.peek().value==null)
			return null;
		
		_items_backup = (Stack<JavaSymbol>) _items.clone();
		
		while (_items.size()>0 &&(item=_items.pop())!= null)
		{
			isConsumed =0;
			
			if (item.sym==Sym.ARRAY)
			{
				isArray =1;
				isConsumed =1;
			}
			
			if (item.sym==Sym.IDENTIFIER)
			{
				isConsumed =1;
				identifiers.add(item.value.toString());
			}
		
			
			if (JavaItemFactoryHelper.isLiteral(item.sym))
			{
				isConsumed =1;
				values.add(item.value.toString());
			}
			
			if (JavaItemFactoryHelper.isPrimitive(item.sym) && identifiers.size()>0)
			{
				f.setType(JavaItemFactoryHelper.primitiveToString(item.sym));
				
				String var;
				String value;
				while (identifiers.size()>0 && (var=identifiers.pop())!= null)
				{
					Variable v = new Variable(var);
					
					if (isArray==1)
					{
						if (values.size()>0)
						{
							v.setArrayCount(Integer.valueOf(values.pop()));
						}
						else
							v.setArrayCount(0);

						f.setVariables(v);
					}
					else
					{
						f.setVariables(new Variable(var));
						if (values.size()>0)
						{
							value = values.pop();
							f.setValue(value);
						}
					}
				}
				
				while (_items.size()>0 &&(item=_items.pop())!= null)
				{
					if ( ModifierSet.isModifier (item.sym)<=0)
					{
						unconsumedTokens.push((JavaSymbol) item);
						break;
					}
					
					if ((t = ModifierSet.isModifier (item.sym))>0 && consumeModifiers==0&&((JavaSymbol)item).getTag()==0)
						{
							modifier =ModifierSet.addModifier(modifier, t);
							f.setModifiers(modifier);
						}
					
					else
					{
						unconsumedTokens.push((JavaSymbol) item);
					}
				}
				
				
				if (f.getModifiers()==0)
					f.setModifiers(Modifier.PRIVATE);
				
				resetUnconsumedTokens(unconsumedTokens);
				
				return f;
			}
			
			if (isConsumed ==0)
			{
				unconsumedTokens.push((JavaSymbol) item);
			}
			
		}
		
		_items = (Stack<JavaSymbol>) _items_backup.clone();
		return null;
	}
	
	
	
}
