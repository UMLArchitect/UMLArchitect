package esgi.al.plugin.platform.model.relation;

import esgi.al.plugin.platform.interfaces.IAssociation;
import esgi.al.plugin.platform.interfaces.IEndPoint;
import esgi.al.plugin.platform.interfaces.IObject;
import esgi.al.plugin.platform.model.Object;

public class Association extends Object implements IAssociation {
	
	private IEndPoint _start;
	private IEndPoint _end;
	private AssociationDirection _direction;
	
	public Association(String name) {
		super(name);
	}
	
	public Association(String key, String name) {
		super(key, name);
	}
	
	public Association initialize(AssociationDirection direction, IEndPoint start, IEndPoint end)
	{
		this._direction = direction;
		this.setStart(start);
		this.setEnd(end);
		
		return this;
	}

	@Override
	public AssociationDirection getDirection() {
		return _direction;
	}

	@Override
	public void add(IObject object) {
		
	}

	public IEndPoint getStart() {
		return _start;
	}

	public void setStart(IEndPoint start) {
		this._start = start;
	}

	public IEndPoint getEnd() {
		return _end;
	}

	public void setEnd(IEndPoint _end) {
		this._end = _end;
	}
	
	
	
	
}
