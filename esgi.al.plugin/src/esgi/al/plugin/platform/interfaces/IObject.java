package esgi.al.plugin.platform.interfaces;


public interface IObject {
	
	/**
	 * Gets the current's object parent
	 * @return an instance of implemented IUAObject
	 */
	public IObject getParent();
	
	/**
	 * Defines the current's object parent
	 * @param parent an IUA
	 * @return an instance of implemented IUAObject
	 */
	public IObject setParent(IObject parent);
	
	/**
	 * Realizes a process 
	 * @param object the object to be processed
	 */
	public void add(IObject object);
}
