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
 * Represent a java package declaration 
 */
public final class PackageDeclaration  {


    /** The package name */
    private List<String> _name;

    /**
     * Instantiates a new package declaration.
     */
    public PackageDeclaration()
    {
    	_name = new ArrayList<String>();
    }

    /**
     * Instantiates a new package declaration.
     *
     * @param name the name
     */
    public PackageDeclaration( List<String> name) {
       _name = name;
    }

    /**
     * Instantiates a new package declaration.
     *
     * @param name the name
     */
    public PackageDeclaration( String name) {
    	_name.add(name);
     }
    
    /**
     * Gets the name.
     *
     * @return the name
     */
    public List<String> getName() {
        return _name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        _name.add(name);
    }
    
    /**
     * Gets the package.
     *
     * @return the package
     */
    public String getPackage()
    {
    	String r = "";
    	
    	if (_name.size()>0)
    	{
    	for (String l : _name) {
    		r=l+"."+r;
		}
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
    	for (String l : _name) {
    		r=l+"."+r;
		}
    	return "package " + r.substring(0, r.length()-1);
    }

}
