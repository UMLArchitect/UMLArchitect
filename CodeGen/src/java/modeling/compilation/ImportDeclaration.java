/*
 * UML ARCHITECT GENCODE (Equipe R. Mogos)
 * Auteur: Thomas Raynal (AL4 Alt)
 * Date:24/03/2012
 * Contact: thomas.raynal2@gmail.com
 */
package uml.java.modeling.compilation;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * Represent an import declaration
 */
public final class ImportDeclaration  {

    /** The import names */
    private List<String> name;

    /** If is static import */
    private boolean static_;

    /** If full import */
    private boolean asterisk= false;

    /**
     * Instantiates a new import declaration.
     */
    public ImportDeclaration() {
    	name = new ArrayList<String>();
    }
    
    /**
     * Instantiates a new import declaration.
     *
     * @param name the name
     * @param isStatic the is static
     * @param isAsterisk the is asterisk
     */
    public ImportDeclaration( List<String>  name, boolean isStatic, boolean isAsterisk) {
        this.name = name;
        this.static_ = isStatic;
        this.asterisk = isAsterisk;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public List<String>  getName() {
        return name;
    }

    /**
     * Checks if is asterisk.
     *
     * @return true, if is asterisk
     */
    public boolean isAsterisk() {
        return asterisk;
    }

    /**
     * Checks if is static.
     *
     * @return true, if is static
     */
    public boolean isStatic() {
        return static_;
    }

    /**
     * Sets the asterisk.
     *
     * @param asterisk the new asterisk
     */
    public void setAsterisk(boolean asterisk) {
        this.asterisk = asterisk;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name.add(name);
    }

    /**
     * Sets the static.
     *
     * @param static_ the new static
     */
    public void setStatic(boolean static_) {
        this.static_ = static_;
    }
    
    /**
     * Gets the import.
     *
     * @return the import
     */
    public String getImport()
    {
    	String r = "";
    	if (name.size()>0)
    	{
    	for (String l : name) {
			r=l+"."+r;
		}
    	if (asterisk)
    		return r.substring(0, r.length()-1)+"*";
    	
    	return r.substring(0, r.length()-1);
    	}
    	return r;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
    	String r = "";
    	for (String l : name) {
			r=l+"."+r;
		}
    	if (asterisk)
    		return "import "+r+"*";
    	
    	return "import "+r.substring(0, r.length()-1);
    }


}
