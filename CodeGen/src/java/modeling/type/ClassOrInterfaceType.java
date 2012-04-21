/*
 * UML ARCHITECT GENCODE (Equipe R. Mogos)
 * Auteur: Thomas Raynal (AL4 Alt)
 * Date:24/03/2012
 * Contact: thomas.raynal2@gmail.com
 */
package uml.java.modeling.type;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * Represent a Class or an Interface Type (BNF template)
 */
public final class ClassOrInterfaceType  {

    /** The scope. */
    private ClassOrInterfaceType scope;

    /** The name. */
    private String name;

    /** The type args. */
    private List<String> typeArgs;

    /**
     * Instantiates a new class or interface type.
     */
    public ClassOrInterfaceType() {
    }

    /**
     * Instantiates a new class or interface type.
     *
     * @param name the name
     */
    public ClassOrInterfaceType(String name) {
        this.name = name;
    }

    /**
     * Instantiates a new class or interface type.
     *
     * @param scope the scope
     * @param name the name
     */
    public ClassOrInterfaceType(ClassOrInterfaceType scope, String name) {
        this.scope = scope;
        this.name = name;
    }

    /**
     * Instantiates a new class or interface type.
     *
     * @param scope the scope
     * @param name the name
     * @param typeArgs the type args
     */
    public ClassOrInterfaceType(ClassOrInterfaceType scope, String name, List<String> typeArgs) {
        super();
        this.scope = scope;
        this.name = name;
        this.typeArgs = typeArgs;
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
     * Gets the scope.
     *
     * @return the scope
     */
    public ClassOrInterfaceType getScope() {
        return scope;
    }

    /**
     * Gets the type args.
     *
     * @return the type args
     */
    public List<String> getTypeArgs() {
        return typeArgs;
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
     * Sets the scope.
     *
     * @param scope the new scope
     */
    public void setScope(ClassOrInterfaceType scope) {
        this.scope = scope;
    }

    /**
     * Sets the type args.
     *
     * @param typeArgs the new type args
     */
    public void setTypeArgs(List<String> typeArgs) {
        this.typeArgs = typeArgs;
    }
}
