package esgi.al.plugin.platform.model.type.modifier;

import esgi.al.plugin.platform.interfaces.IFinalizable;
import esgi.al.plugin.platform.interfaces.IStatic;
import esgi.al.plugin.platform.model.type.Property;

public class StaticProperty extends Property implements IStatic, IFinalizable {

	public StaticProperty(String key, String name) {
		super(key, name);
	}
	
	public StaticProperty(String name) {
		super(name);
	}
}
