package esgi.al.plugin.platform.interfaces;

import esgi.al.plugin.platform.interfaces.IAssociation.AssociationKind;
import esgi.al.plugin.platform.interfaces.IAssociation.AssociationMultiplicity;

public interface IAssociationPoint {
	/**
	 * Gets the association kind from an end point
	 * @return IAssociation.AssociationKind enum value
	 */
	public AssociationKind getKind();
	
	public AssociationMultiplicity getMultiplicity();
}
