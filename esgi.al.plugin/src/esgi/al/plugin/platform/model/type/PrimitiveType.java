package esgi.al.plugin.platform.model.type;

import esgi.al.plugin.platform.interfaces.IObject;
import esgi.al.plugin.platform.interfaces.IType;

public class PrimitiveType implements IType {

	private String _name;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return _name;
	}
	
	public void setName(String name){
		_name = name;
	}
	
	@Override
	public void add(IObject arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IObject getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IObject setParent(IObject arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
