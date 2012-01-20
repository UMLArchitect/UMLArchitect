package esgi.al.plugin.platform.interfaces;


public interface IAssociation extends IObject {
	enum AssociationKind {
		SIMPLE,
		AGGREGATION,
		COMPOSITION,
		GENERALIZATION,
		REALIZATION
	}
	
	enum AssociationMultiplicity {
		ZERO_TO_ONE,
		ONE_TO_ONE,
		ONE_TO_MANY,
		MANY_TO_MANY
	}
	
	enum AssociationDirection {
		UNIDIRECTIONAL,
		BIDIRECTIONAL
	}
	
	public IAssociation.AssociationDirection getDirection();
}
