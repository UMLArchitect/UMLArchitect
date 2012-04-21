/*
 * UML ARCHITECT GENCODE (Equipe R. Mogos)
 * Auteur: Thomas Raynal (AL4 Alt)
 * Date:24/03/2012
 * Contact: thomas.raynal2@gmail.com
 */

package uml.java.modeling.type;

// TODO: Auto-generated Javadoc
/**
 * Helper to handle java reference types
 */
public final class ReferenceType {

    /** The type. */
    private String type;

    /** The array count. */
    private int arrayCount;

    /**
     * Instantiates a new reference type.
     */
    public ReferenceType() {
    }

    /**
     * Instantiates a new reference type.
     *
     * @param type the type
     */
    public ReferenceType(String type) {
        this.type = type;
    }

    /**
     * Instantiates a new reference type.
     *
     * @param type the type
     * @param arrayCount the array count
     */
    public ReferenceType(String type, int arrayCount) {
        this.type = type;
        this.arrayCount = arrayCount;
    }

    /**
     * Gets the array count.
     *
     * @return the array count
     */
    public int getArrayCount() {
        return arrayCount;
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
     * Sets the array count.
     *
     * @param arrayCount the new array count
     */
    public void setArrayCount(int arrayCount) {
        this.arrayCount = arrayCount;
    }

    /**
     * Sets the type.
     *
     * @param type the new type
     */
    public void setType(String type) {
        this.type = type;
    }

}
