/*
 * UML ARCHITECT GENCODE (Equipe R. Mogos)
 * Auteur: Thomas Raynal (AL4 Alt)
 * Date:24/03/2012
 * Contact: thomas.raynal2@gmail.com
 */
package uml.java.ast;


import uml.java.modeling.body.ClassOrInterfaceDeclaration;
import uml.java.modeling.body.FieldDeclaration;
import uml.java.modeling.body.MethodDeclaration;
import uml.java.modeling.body.Variable;
import uml.java.modeling.compilation.ImportDeclaration;
import uml.java.modeling.compilation.PackageDeclaration;
import uml.java.modeling.compilation.TypeParameter;
import uml.java.parser.cup.CompilationUnit;

// TODO: Auto-generated Javadoc
/**
 * Unused.
 * Template for an implementation of the visitor pattern on the java object data structure
 */
public interface ASTGenericVisitor<R> {

	    /**
    	 * Visit Compilation unit (i.e all components)
    	 *
    	 * @param n the n
    	 * @return the r
    	 */
    	public R visit(CompilationUnit n);

	    /**
    	 * Visit Package Declarations
    	 *
    	 * @param n the n
    	 * @return the r
    	 */
    	public R visit(PackageDeclaration n);

	    /**
    	 * Visit Import Declarations
    	 *
    	 * @param n the n
    	 * @return the r
    	 */
    	public R visit(ImportDeclaration n);

	    /**
    	 * Visit Parameters
    	 *
    	 * @param n the n
    	 * @return the r
    	 */
    	public R visit(TypeParameter n);

	    /**
    	 * Visit Class or Interface Declarations
    	 *
    	 * @param n the n
    	 * @return the r
    	 */
    	public R visit(ClassOrInterfaceDeclaration n);

	    /**
    	 * Visit Field Declarations
    	 *
    	 * @param n the n
    	 * @return the r
    	 */
    	public R visit(FieldDeclaration n);

	    /**
    	 * Visit Variables
    	 *
    	 * @param n the n
    	 * @return the r
    	 */
    	public R visit(Variable n);

	    /**
    	 * Visit Method Declarations
    	 *
    	 * @param n the n
    	 * @return the r
    	 */
    	public R visit(MethodDeclaration n);

}
