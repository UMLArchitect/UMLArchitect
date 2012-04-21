/*
 * UML ARCHITECT GENCODE (Equipe R. Mogos)
 * Auteur: Thomas Raynal (AL4 Alt)
 * Date:24/03/2012
 * Contact: thomas.raynal2@gmail.com
 */
package uml.java.modeling.interfaces;

import uml.entities.interfaces.IUMLObject;

// TODO: Auto-generated Javadoc
//import uml.entities.interfaces.IUMLObject;

/**
 * Represent a java object
 */
public interface IModelingObject {

	/**
	 * A string representation of the object
	 *
	 * @return the string
	 */
	String print();
	
	/**
	 * Map the object to an UML Object
	 *
	 * @return the iUML object
	 */
	IUMLObject map();

}
