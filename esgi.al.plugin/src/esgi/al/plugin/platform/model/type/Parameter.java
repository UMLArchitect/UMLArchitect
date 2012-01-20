package esgi.al.plugin.platform.model.type;

import esgi.al.plugin.platform.interfaces.IParameter;


public class Parameter extends Variable implements IParameter {

	public Parameter(String key, String name) {
		super(key, name);
	}
	
	public Parameter(String name) {
		super(name);
	}
}
