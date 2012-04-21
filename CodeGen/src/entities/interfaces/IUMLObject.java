package uml.entities.interfaces;

import java.lang.reflect.Type;

public interface IUMLObject {
	/**
	 * TODO
	 * @return name
	 */
	public String getIdentifier();
	/**
	 * TODO
	 * @param name
	 */
	public void setIdentifier(String identifier);
	
	public Type getType();
	
}
