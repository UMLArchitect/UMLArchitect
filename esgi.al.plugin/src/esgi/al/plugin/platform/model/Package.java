package esgi.al.plugin.platform.model;

import java.util.LinkedList;

import esgi.al.plugin.platform.interfaces.IClass;
import esgi.al.plugin.platform.interfaces.IObject;
import esgi.al.plugin.platform.interfaces.IPackage;


public class Package extends Object implements IPackage {
	
	private LinkedList<IClass> classes = new LinkedList<IClass>();

	public Package(String key, String name) {
		super(key, name);
	}

	public Package(String name) {
		super(name);
	}

	@Override
	public void add(IObject object) {
		if (object instanceof IClass) {
			addClass((IClass) object);
		}
	}

	@Override
	public boolean addClass(IClass iclass) {
		return classes.add(iclass);
	}
}
