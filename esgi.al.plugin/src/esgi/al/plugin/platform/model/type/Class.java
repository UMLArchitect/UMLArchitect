package esgi.al.plugin.platform.model.type;

import java.util.List;

import esgi.al.plugin.platform.interfaces.IObject;
import esgi.al.plugin.platform.interfaces.IOperation;
import esgi.al.plugin.platform.interfaces.IProperty;
import esgi.al.plugin.platform.interfaces.IType;

public class Class extends esgi.al.plugin.platform.model.Object implements IType, esgi.al.plugin.platform.interfaces.IFinalizable {
	
	private List<IProperty> _proporties;
	private List<IOperation> _operations;

	public Class(String key, String name) {
		super(key, name);
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public void add(IObject arg0) {
		
	}

	public List<IProperty> getProporties() {
		return _proporties;
	}

	public void setProporties(List<IProperty> proporties) {
		this._proporties = proporties;
	}

	public List<IOperation> getOperations() {
		return _operations;
	}

	public void setOperations(List<IOperation> operations) {
		this._operations = operations;
	}

	@Override
	public boolean isFinal() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	
	

}
