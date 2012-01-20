package esgi.al.plugin.platform.model.type;

import esgi.al.plugin.platform.interfaces.IObject;
import esgi.al.plugin.platform.interfaces.IType;
import esgi.al.plugin.platform.model.Object;

public class Variable extends Object implements IType{
	
	private String _name;
	private IType _type;
	private String _min,_max,_default;
	
	public Variable(String key, String name) {
		super(key, name);
	}
	
	public Variable(String key) {
		super(key);
	}


	public String getName() {
		return _name;
	}


	public void setName(String name) {
		this._name = name;
	}


	public IType getType() {
		return _type;
	}


	public void setType(IType type) {
		this._type = type;
	}


	public String getMin() {
		return _min;
	}


	public void setMin(String min) {
		this._min = min;
	}


	public String getMax() {
		return _max;
	}


	public void setMax(String max) {
		this._max = max;
	}


	public String getDef() {
		return _default;
	}


	public void setDef(String def) {
		this._default = def;
	}


	@Override
	public void add(IObject arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	

}
