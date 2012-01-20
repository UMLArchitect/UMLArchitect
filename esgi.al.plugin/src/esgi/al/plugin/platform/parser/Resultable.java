package esgi.al.plugin.platform.parser;

import java.util.Hashtable;

import esgi.al.plugin.platform.interfaces.IObject;

public abstract class Resultable {
	
	/**
	 * Data to be used for the class instanciation
	 */
	protected Hashtable<String, String> attributes = new Hashtable<String, String>();
	
	/**
	 * Instanciates and initializes new IUAObject 
	 * @return the initialized object
	 */
	public abstract IObject run();
	
	/**
	 * Adds a new attribute with its value
	 * @param name the attribute key or name
	 * @param value
	 */
	public void setAttribute(String name, String value)
	{
		attributes.put(name, value);
	}
}
