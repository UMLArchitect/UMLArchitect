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
import uml.java.modeling.compilation.TypeParameter;
import uml.java.modeling.interfaces.IMembers;
import uml.java.modeling.interfaces.IModelingObject;

// TODO: Auto-generated Javadoc
/**
 * Represent a java method (BNF template).
 */
public final class MethodDeclaration  implements IModelingObject, IMembers{

    /** The modifiers. */
    private int modifiers;

    /** The type parameters. */
    private List<TypeParameter> typeParameters;

    /** The type. */
    private String type;

    /** The name. */
    private String name;

    /** The parameters. */
    private List<Parameter> parameters;

    /**
     * Instantiates a new method declaration.
     */
    public MethodDeclaration() {
    	typeParameters = new ArrayList<TypeParameter>();
    	parameters = new ArrayList<Parameter>();
    }

    /**
     * Instantiates a new method declaration.
     *
     * @param modifiers the modifiers
     * @param type the type
     * @param name the name
     */
    public MethodDeclaration(int modifiers, String type, String name) {
        this.modifiers = modifiers;
        this.type = type;
        this.name = name;
    }

    /**
     * Instantiates a new method declaration.
     *
     * @param modifiers the modifiers
     * @param type the type
     * @param name the name
     * @param parameters the parameters
     */
    public MethodDeclaration(int modifiers, String type, String name, List<Parameter> parameters) {
        this.modifiers = modifiers;
        this.type = type;
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * Instantiates a new method declaration.
     *
     * @param modifiers the modifiers
     * @param typeParameters the type parameters
     * @param type the type
     * @param name the name
     * @param parameters the parameters
     */
    public MethodDeclaration(int modifiers, List<TypeParameter> typeParameters, String type, String name, List<Parameter> parameters) {
        super();
        this.modifiers = modifiers;
        this.typeParameters = typeParameters;
        this.type = type;
        this.name = name;
        this.parameters = parameters;
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
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the parameters.
     *
     * @return the parameters
     */
    public List<Parameter> getParameters() {
        return parameters;
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
     * Gets the type parameters.
     *
     * @return the type parameters
     */
    public List<TypeParameter> getTypeParameters() {
        return typeParameters;
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
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the parameters.
     *
     * @param parameters the new parameters
     */
    public void setParameters(Parameter parameters) {
        this.parameters.add(parameters);
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
     * Sets the type parameters.
     *
     * @param typeParameters the new type parameters
     */
    public void setTypeParameters(List<TypeParameter> typeParameters) {
        this.typeParameters = typeParameters;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
    	StringBuffer b = new StringBuffer();
    	
    	//if (modifiers>=0){
    			b.append(ModifierSet.modifierToString(modifiers)+ " ");
    		//}
    	//else
    	//	b.append(ModifierSet.modifierToString(Sym.PRIVATE)+ " ");

    	b.append(type+ " ");
    	b.append(name+ " ");
    	b.append("(");
    	
    	for (Parameter p : parameters) {
			b.append(p.toString());
			b.append(",");
		}

    	b.append(");");

    	return b.toString();
    }
    
	/* (non-Javadoc)
	 * @see uml.java.modeling.interfaces.IMembers#getMemberClass()
	 */
	@Override
	public Type getMemberClass() {
		return MethodDeclaration.class;
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
		return UmlJavaFactory.toUMLMethod(this);
	}
    
}
