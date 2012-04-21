/*
 * UML ARCHITECT GENCODE (Equipe R. Mogos)
 * Auteur: Thomas Raynal (AL4 Alt)
 * Date:24/03/2012
 * Contact: thomas.raynal2@gmail.com
 */

package uml.java.modeling.type;

// TODO: Auto-generated Javadoc
/**
 * Helper to handle java primitives
 */
public final class PrimitiveType {

    /**
     * The Enum Primitive.
     */
    public enum Primitive {
        
        /** The Boolean. */
        Boolean, 
 /** The Char. */
 Char, 
 /** The Byte. */
 Byte, 
 /** The Short. */
 Short, 
 /** The Int. */
 Int, 
 /** The Long. */
 Long, 
 /** The Float. */
 Float, 
 /** The Double. */
 Double,
/** The Void. */
Void
    }

    /** The type. */
    private Primitive type;

    /**
     * Instantiates a new primitive type.
     */
    public PrimitiveType() {
    }

    /**
     * Instantiates a new primitive type.
     *
     * @param type the type
     */
    public PrimitiveType(Primitive type) {
        super();
        this.type = type;
    }

    /**
     * Gets the type.
     *
     * @return the type
     */
    public Primitive getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type the new type
     */
    public void setType(Primitive type) {
        this.type = type;
    }

}
