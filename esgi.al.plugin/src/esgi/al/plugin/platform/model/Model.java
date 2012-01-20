package esgi.al.plugin.platform.model;

import java.util.List;
import java.util.Stack;

import esgi.al.plugin.platform.interfaces.IModel;
import esgi.al.plugin.platform.interfaces.IObject;
import esgi.al.plugin.platform.interfaces.IPackage;

public class Model extends Object implements IModel {
	
	private List<IPackage> packages;

	public Model(String key, String name) {
		super(key, name);
		packages = new Stack<IPackage>();
	}

	@Override
	public void add(IObject object) {
		if (object instanceof IPackage) {
			addPackage((IPackage) object);
		}
	}

	@Override
	public boolean addPackage(IPackage ipackage) {
		ipackage.setParent(this);
		return packages.add(ipackage);
	}
}
