/*
 * UML ARCHITECT GENCODE (Equipe R. Mogos)
 * Auteur: Thomas Raynal (AL4 Alt)
 * Date:24/03/2012
 * Contact: thomas.raynal2@gmail.com
 */

package uml.java.modeling.body;



// TODO: Auto-generated Javadoc
/**
 * Represent a java Variable
 */
public final class Variable  {

    /** The name. */
    private String name;
    
    /** The array index */
    private int arrayCount;

    /**
     * Instantiates a new variable.
     */
    public Variable() {
    }

    /**
     * Instantiates a new variable.
     *
     * @param name the name
     */
    public Variable(String name) {
        this.name = name;
        arrayCount=-1;
    }

    /**
     * Instantiates a new variable.
     *
     * @param name the name
     * @param arrayCount the array count
     */
    public Variable(String name, int arrayCount) {
        super();
        this.name = name;
        this.arrayCount = arrayCount;
    }
    
    /**
     * Checks if is array.
     *
     * @return true, if is array
     */
    public boolean isArray()
    {
    	return (arrayCount>=0? true:false);
    }

    /**
     * Gets the array index count.
     *
     * @return the array count
     */
    public int getArrayCount() {
        return arrayCount;
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
     * Sets the array index count.
     *
     * @param arrayCount the new array count
     */
    public void setArrayCount(int arrayCount) {
        this.arrayCount = arrayCount;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }


    
    

}
