package esgi.al.plugin.platform.model;

import java.util.Hashtable;

import esgi.al.plugin.platform.interfaces.IObject;

public abstract class Object implements IObject {
	
	private static int counter = 0;
	private static Hashtable<String, esgi.al.plugin.platform.model.Object> createdObjects = new Hashtable<String, Object>();
	
	private String key = null;
	private IObject parent = null;
	private String name = "";
	
	public Object(String name) {
		
		this.key = counter+"";
		this.name = name;
		
		counter++;
		
		createdObjects.put(key, this);
	}
	
	public Object(String key, String name)
	{
		this.key = key;
		this.name = name;			
	
		createdObjects.put(key, this);
		
		counter++;
	}

	@Override
	public IObject getParent() {
		return parent;
	}

	@Override
	public IObject setParent(IObject parent) {
		this.parent = parent;
		
		return this;
	}
	
	public String getKey()
	{
		return key;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public static IObject get(String key)
	{
		return createdObjects.get(key);
	}
}
