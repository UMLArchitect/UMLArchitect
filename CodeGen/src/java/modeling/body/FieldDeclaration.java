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

import uml.entities.factories.UmlJavaFactory;
import uml.entities.interfaces.IUMLObject;
import uml.java.modeling.interfaces.IMembers;
import uml.java.modeling.interfaces.IModelingObject;
// TODO: Auto-generated Javadoc

/**
 * Represent a java property (BNF template).
 */
public final class FieldDeclaration  implements IModelingObject, IMembers {

    /** The modifiers. */
    private int modifiers;

    /** The type. */
    private String type;

    /** The variables ([1,N], depending on the way variables have been declared). */
    private List<Variable> _variables;
    
    /** The _value. */
    private String _value;

    /**
     * Instantiates a new field declaration.
     */
    public FieldDeclaration() {
    	_variables = new ArrayList<Variable>();
    	//modifiers =Sym.PRIVATE;
    }

    /**
     * Instantiates a new field declaration.
     *
     * @param modifiers the modifiers
     * @param type the type
     * @param variable the variable
     */
    public FieldDeclaration(int modifiers, String type, Variable variable) {
        this.modifiers = modifiers;
        this.type = type;
        _variables = new ArrayList<Variable>();
        _variables.add(variable);
    }

    /**
     * Instantiates a new field declaration.
     *
     * @param modifiers the modifiers
     * @param type the type
     * @param variables the variables
     */
    public FieldDeclaration(int modifiers, String type, List<Variable> variables) {
        this.modifiers = modifiers;
        this.type = type;
        _variables = variables;
    }

    /**
     * Gets the modifiers.
     *
     * @return the modifiers
     */
    public int getModifiers() {
        return modifiers;
    }

    /**
     * Gets the type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Gets the variables.
     *
     * @return the variables
     */
    public List<Variable> getVariables() {
        return _variables;
    }

    /**
     * Sets the modifiers.
     *
     * @param modifiers the new modifiers
     */
    public void setModifiers(int modifiers) {
        this.modifiers = modifiers;
    }

    /**
     * Sets the type.
     *
     * @param type the new type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets the variables.
     *
     * @param variables the new variables
     */
    public void setVariables(Variable variables) {
        _variables.add(variables);
    }
    
    /**
     * Sets the value.
     *
     * @param value the new value
     */
    public void setValue (String value)
    {
    	_value = value;
    }
    
    /**
     * Gets the value.
     *
     * @return the value
     */
    public String getValue ()
    {
    	return _value;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
    	StringBuffer b = new StringBuffer();
		for (Variable var : _variables) {
			b.append(ModifierSet.modifierToString(modifiers)+ " ");
			b.append(type+ " ");
			if (var.isArray())
			{
				if (var.getArrayCount()>0)
					b.append("["+ var.getArrayCount()+"]");
				else b.append("[]");
			}
			b.append(var.getName());
			if (null!=_value)
				b.append("="+_value);

			b.append(";");
		}
    	
		return b.toString();
    	
    }
    
	/* (non-Javadoc)
	 * @see uml.java.modeling.interfaces.IMembers#getMemberClass()
	 */
	@Override
	public Type getMemberClass() {
		return FieldDeclaration.class;
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
		return UmlJavaFactory.toUMLField(this).get(0);
	}
    
}
