package esgi.al.plugin.platform.model.relation;

import esgi.al.plugin.platform.interfaces.IClass;
import esgi.al.plugin.platform.interfaces.IEndPoint;
import esgi.al.plugin.platform.interfaces.IAssociation.AssociationKind;
import esgi.al.plugin.platform.interfaces.IAssociation.AssociationMultiplicity;

public class EndPoint implements IEndPoint {
	
	private IClass _entity;
	
	private AssociationKind _kind;
	
	private AssociationMultiplicity _multiplicity;

	private String _name;
	
	public EndPoint(IClass _entity, AssociationKind _kind, AssociationMultiplicity _multiplicity, String _name) {
		this._entity = _entity;
		this._kind = _kind;
		this._multiplicity = _multiplicity;
		this._name = _name;
	}

	@Override
	public IClass getEntity() {
		return _entity;
	}

	@Override
	public AssociationKind getKind() {
		return _kind;
	}

	@Override
	public AssociationMultiplicity getMultiplicity() {
		return _multiplicity;
	}
	
	public String getName() {
		return _name;
	}
}
