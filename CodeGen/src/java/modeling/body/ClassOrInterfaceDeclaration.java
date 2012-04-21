/*
 * UML ARCHITECT GENCODE (Equipe R. Mogos)
 * Auteur: Thomas Raynal (AL4 Alt)
 * Date:24/03/2012
 * Contact: thomas.raynal2@gmail.com
 */
package uml.java.modeling.body;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import uml.java.ast.*;
import uml.entities.factories.UmlJavaFactory;
import uml.entities.interfaces.IUMLObject;
import uml.java.modeling.compilation.TypeParameter;
import uml.java.modeling.interfaces.IMembers;

// TODO: Auto-generated Javadoc
/**
 * Represent a java class or interface (BNF template)
 */
public final class ClassOrInterfaceDeclaration extends TypeDeclaration implements IMembers,ASTNode {

    /** Set to true if the objet is an interface. */
    private boolean _interface;

    /** Optionals parameters*/
    private List<TypeParameter> _typeParameters;

    /** Extends */
    private List<String> _extendsList;

    /** Implements. */
    private List<String> _implementsList;
    
    /** Members (Fields,methods,enums) */
    private List<IMembers> _membersList;
    	
    /**
     * Instantiates a new class or interface declaration.
     */
    public ClassOrInterfaceDeclaration() {
        _extendsList = new ArrayList<String>();
        _implementsList = new ArrayList<String>();
        _membersList = new ArrayList<IMembers>();
        _typeParameters = new ArrayList<TypeParameter>();
    }

    /**
     * Instantiates a new class or interface declaration.
     *
     * @param modifiers the modifiers
     * @param name the name
     */
    public ClassOrInterfaceDeclaration(int modifiers, String name) {
        super(modifiers, name);
        _extendsList = new ArrayList<String>();
        _implementsList = new ArrayList<String>();
        _membersList = new ArrayList<IMembers>();
        _typeParameters = new ArrayList<TypeParameter>();
    }

    /**
     * Instantiates a new class or interface declaration.
     *
     * @param modifiers the modifiers
     * @param isInterface the is interface
     * @param name the name
     * @param typeParameters the type parameters
     * @param extendsList the extends list
     * @param implementsList the implements list
     * @param membersList the members list
     */
    public ClassOrInterfaceDeclaration(int modifiers, boolean isInterface, String name, List<TypeParameter> typeParameters, List<String> extendsList, List<String> implementsList,List<IMembers> membersList) {
        super(modifiers, name);
        _interface = isInterface;
        _typeParameters = typeParameters;
        _extendsList = extendsList;
        _implementsList = implementsList;
        _membersList= membersList;
    }

    /**
     * Gets the extends.
     *
     * @return the extends
     */
    public List<String> getExtends() {
        return _extendsList;
    }

    /**
     * Gets the implements.
     *
     * @return the implements
     */
    public List<String> getImplements() {
        return _implementsList;
    }

    /**
     * Gets the type parameters.
     *
     * @return the type parameters
     */
    public List<TypeParameter> getTypeParameters() {
        return _typeParameters;
    }

    /**
     * Checks if is interface.
     *
     * @return true, if is interface
     */
    public boolean isInterface() {
        return _interface;
    }

    /**
     * Sets the extends.
     *
     * @param extendsList the new extends
     */
    public void setExtends(String extendsList) {
        _extendsList.add(extendsList);
    }

    /**
     * Sets the implements.
     *
     * @param implementsList the new implements
     */
    public void setImplements(String implementsList) {
        _implementsList.add(implementsList);
    }

    /**
     * Sets the interface.
     *
     * @param interface_ the new interface
     */
    public void setInterface(boolean interface_) {
        _interface = interface_;
    }

    /**
     * Sets the type parameters.
     *
     * @param typeParameters the new type parameters
     */
    public void setTypeParameters(TypeParameter typeParameters) {
        _typeParameters.add(typeParameters);
    }

	/**
	 * Sets the members list.
	 *
	 * @param membersList the new members list
	 */
	public void setMembersList(IMembers membersList) {
		if (null!= membersList)
			_membersList.add(membersList);
	}

	/**
	 * Gets the members list.
	 *
	 * @return the members list
	 */
	public List<IMembers> getMembersList() {
		return _membersList;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString ()
	{
		StringBuffer b = new StringBuffer();
		b.append(ModifierSet.modifierToString(super.getModifiers()));
		
		if (isInterface())
		{
			b.append(" interface " + super.getName()+ " ");
		}
		else
		{
			b.append(" class " + super.getName()+ " ");
		}
		
		if (_extendsList.size()>0)
		{
			b.append(" extends ");
			
			for (String s : _extendsList) {
				b.append(s+ " ");
			}
		}
		
		if (_implementsList.size()>0)
		{
			b.append(" implements ");
			
			for (String s : _implementsList) {
				b.append(s+ " ");
			}
		}
		
		b.append("{\n");
		
		for (IMembers m : _membersList) {
			b.append(m.toString()+'\n');
		}
		
		b.append('}');
		
		return b.toString();
		
	}

	/* (non-Javadoc)
	 * @see uml.java.modeling.interfaces.IMembers#getMemberClass()
	 */
	@Override
	public Type getMemberClass() {
		return ClassOrInterfaceDeclaration.class;
	}

	/* (non-Javadoc)
	 * @see uml.java.modeling.interfaces.IModelingObject#print()
	 */
	@Override
	public String print() {
		return this.toString();
	}

	/* (non-Javadoc)
	 * @see uml.java.modeling.interfaces.IModelingObject#map()
	 */
	@Override
	public IUMLObject map() {
		return UmlJavaFactory.toUMLClass(this);
	}

	/* (non-Javadoc)
	 * @see uml.java.ast.ASTNode#accept(uml.java.ast.ASTGenericVisitor)
	 */
	@Override
	public <R> R accept(ASTGenericVisitor<R> v) {
		return v.visit(this);
	}


	
}
