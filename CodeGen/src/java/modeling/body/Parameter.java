/*
 * UML ARCHITECT GENCODE (Equipe R. Mogos)
 * Auteur: Thomas Raynal (AL4 Alt)
 * Date:24/03/2012
 * Contact: thomas.raynal2@gmail.com
 */
package uml.java.modeling.body;

import uml.entities.factories.UmlJavaFactory;
import uml.entities.interfaces.IUMLObject;
import uml.java.modeling.interfaces.IModelingObject;


// TODO: Auto-generated Javadoc
/**
 * Represent a parameter (BNF template)
 */
public final class Parameter implements IModelingObject {


    /** The type. */
    private String type;

    /** The id. */
    private String id;

    /**
     * Instantiates a new parameter.
     */
    public Parameter() {
    }

    /**
     * Instantiates a new parameter.
     *
     * @param type the type
     * @param id the id
     */
    public Parameter(String type, String id) {
        this.type = type;
        this.id = id;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId() {
        return id;
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
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the type.
     *
     * @param type the new type
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
    	return type + " "+ id;
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
		return UmlJavaFactory.toUMLParameter(this);
	}

}
