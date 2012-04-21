/*
 * UML ARCHITECT GENCODE (Equipe R. Mogos)
 * Auteur: Thomas Raynal (AL4 Alt)
 * Date:24/03/2012
 * Contact: thomas.raynal2@gmail.com
 */

package uml.java.modeling.body;

import uml.java.modeling.interfaces.IModelingObject;

// TODO: Auto-generated Javadoc
/**
 * Represent a java type (BNF template)
 */
public abstract class TypeDeclaration implements IModelingObject  {

    /** The name. */
    private String name;

    /** The modifiers. */
    private int modifiers;

    /**
     * Instantiates a new type declaration.
     */
    public TypeDeclaration() {
    	
    }

    /**
     * Instantiates a new type declaration.
     *
     * @param modifiers the modifiers
     * @param name the name
     */
    public TypeDeclaration(int modifiers, String name) {
        super();
        this.name = name;
        this.modifiers = modifiers;
    }


    /**
     * Gets the modifiers.
     *
     * @return the modifiers
     */
    public final int getModifiers() {
        return modifiers;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public final String getName() {
        return name;
    }

    /**
     * Sets the modifiers.
     *
     * @param modifiers the new modifiers
     */
    public final void setModifiers(int modifiers) {
        this.modifiers = modifiers;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public final void setName(String name) {
        this.name = name;
    }
}
