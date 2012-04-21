/*
 * UML ARCHITECT GENCODE (Equipe R. Mogos)
 * Auteur: Thomas Raynal (AL4 Alt)
 * Date:24/03/2012
 * Contact: thomas.raynal2@gmail.com
 */
package uml.java.modeling.compilation;

import java.util.List;
import uml.java.modeling.type.ClassOrInterfaceType;


// TODO: Auto-generated Javadoc
/**
 * The Class TypeParameter.
 */
public final class TypeParameter {

    /** The name. */
    private String name;

    /** The type bound. */
    private List<ClassOrInterfaceType> typeBound;

    /**
     * Instantiates a new type parameter.
     */
    public TypeParameter() {
    }

    /**
     * Instantiates a new type parameter.
     *
     * @param name the name
     * @param typeBound the type bound
     */
    public TypeParameter(String name, List<ClassOrInterfaceType> typeBound) {
        super();
        this.name = name;
        this.typeBound = typeBound;
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
     * Gets the type bound.
     *
     * @return the type bound
     */
    public List<ClassOrInterfaceType> getTypeBound() {
        return typeBound;
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
     * Sets the type bound.
     *
     * @param typeBound the new type bound
     */
    public void setTypeBound(List<ClassOrInterfaceType> typeBound) {
        this.typeBound = typeBound;
    }

//	@Override
//	public String print() {
//		return this.toString();
//	}

}
