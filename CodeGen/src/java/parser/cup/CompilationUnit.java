/*
 * UML ARCHITECT GENCODE (Equipe R. Mogos)
 * Auteur: Thomas Raynal (AL4 Alt)
 * Date:24/03/2012
 * Contact: thomas.raynal2@gmail.com
 */

package uml.java.parser.cup;

import uml.java.modeling.compilation.*;
import uml.java.modeling.interfaces.*;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class CompilationUnit.
 */
public final class CompilationUnit{

    /** The _pakage. */
    private PackageDeclaration _pakage;

    /** The _imports. */
    private List<ImportDeclaration> _imports;

    /** The _types. */
    private List<IMembers> _types;

    /**
     * Instantiates a new compilation unit.
     */
    public CompilationUnit() {
    	_pakage = new PackageDeclaration();
    	_imports = new ArrayList<ImportDeclaration>();
    	_types = new ArrayList<IMembers>();
    }

    /**
     * Instantiates a new compilation unit.
     *
     * @param pakage the pakage
     * @param imports the imports
     */
    public CompilationUnit(PackageDeclaration pakage, List<ImportDeclaration> imports) {
    	_pakage= pakage;
        _imports = imports;
    }

    /**
     * Instantiates a new compilation unit.
     *
     * @param beginLine the begin line
     * @param beginColumn the begin column
     * @param endLine the end line
     * @param endColumn the end column
     * @param pakage the pakage
     * @param imports the imports
     */
    public CompilationUnit(int beginLine, int beginColumn, int endLine, int endColumn, PackageDeclaration pakage, List<ImportDeclaration> imports) {
        _pakage = pakage;
        _imports = imports;
    }

    /**
     * Gets the imports.
     *
     * @return the imports
     */
    public List<ImportDeclaration> getImports() {
    	return _imports;
    }

    /**
     * Gets the package.
     *
     * @return the package
     */
    public PackageDeclaration getPackage() {
        return _pakage;
    }

    /**
     * Gets the types.
     *
     * @return the types
     */
    public List<IMembers> getTypes() {
        return _types;
    }
    
//    public void addMember (IMembers member)
//    {
//    	if (_types.size()>0)
//    	{
//        	_types.get(_types.size()-1)
//    	}
//    }

    /**
 * Sets the imports.
 *
 * @param imports the new imports
 */
public void setImports(ImportDeclaration imports) {
    	_imports.add(imports);
    }

    /**
     * Sets the package.
     *
     * @param pakage the new package
     */
    public void setPackage(PackageDeclaration pakage) {
    	_pakage = pakage;
    }

    /**
     * Sets the types.
     *
     * @param types the new types
     */
    public void setTypes(IMembers types) {
    	_types.add(types);
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
    	StringBuffer r = new StringBuffer();
    	
		r.append(_pakage.toString()+'\n');
		
    	for (ImportDeclaration l : _imports) {
			r.append(l.toString()+'\n');
		}
    	for (IMembers l : _types) {
    		
    		if (null != l)    			
    			r.append(l.toString()+'\n');
		}
    	
    	return r.toString();
    }

}
