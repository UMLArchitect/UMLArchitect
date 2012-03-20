package ihm.interfaces;



/**
 * 
 * @author Julien SARAZIN
 *
 */
public interface IObserver{

	// Set the observerManager
	public void setObserverManager(IObserverManager observerManager);
	
	// Update the observer from an observable component and a simple string flag.
	public void update(IObservable observable, String simpleFlag);
	
	// Update the observer from an observable component and a complex object flag.
	public void update(IObservable observable, Object complexFlag);
	
	// Registering of an observer
	public void observe(IObservable observable);
}
