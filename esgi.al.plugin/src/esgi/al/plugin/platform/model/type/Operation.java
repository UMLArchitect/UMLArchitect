package esgi.al.plugin.platform.model.type;

import java.util.List;

import esgi.al.plugin.platform.interfaces.IFinalizable;
import esgi.al.plugin.platform.interfaces.IObject;
import esgi.al.plugin.platform.interfaces.IOperation;
import esgi.al.plugin.platform.interfaces.IType;

public class Operation extends esgi.al.plugin.platform.model.Object implements IOperation, IFinalizable {
	
	private String _name;
	private IType _return;
	private List<Variable>_params;
	
	public Operation(String key, String name) {
		super(key, name);
	}
	
	public Operation(String name) {
		super(name);
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public List<Variable> getParams() {
		return _params;
	}

	public void setParams(List<Variable> params) {
		this._params = params;
	}

	@Override
	public void add(IObject arg0) {
		
	}

	@Override
	public boolean isFinal() {
		return false;
	}

	public IType getReturn() {
		return _return;
	}

	public void setReturn(IType _return) {
		this._return = _return;
	}
}
