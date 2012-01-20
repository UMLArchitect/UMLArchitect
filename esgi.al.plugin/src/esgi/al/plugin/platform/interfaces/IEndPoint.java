package esgi.al.plugin.platform.interfaces;

import esgi.al.plugin.platform.interfaces.IAssociation.AssociationKind;
import esgi.al.plugin.platform.interfaces.IAssociation.AssociationMultiplicity;

public interface IEndPoint {
	public IClass getEntity();
	
	public AssociationKind getKind();
	
	public AssociationMultiplicity getMultiplicity();
}
