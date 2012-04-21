/*
 * UML ARCHITECT GENCODE (Equipe R. Mogos)
 * Auteur: Thomas Raynal (AL4 Alt)
 * Date:24/03/2012
 * Contact: thomas.raynal2@gmail.com
 */
package uml.java.ast;

 // TODO: Auto-generated Javadoc
/**
 * Unused.
 * Template for an implementation of the visitor pattern on the java object data structure
 */
 public interface ASTNode {
	  
	 /**
 	 * Accept.
 	 *
 	 * @param <R> the generic type
 	 * @param v the v
 	 * @return the r
 	 */
 	public abstract <R> R accept(ASTGenericVisitor<R> v);
}
