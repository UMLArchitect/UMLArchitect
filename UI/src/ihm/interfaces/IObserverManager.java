package ihm.interfaces;

/**
 * 
 * @author Julien Sarazin
 *
 */
public interface IObserverManager {
	
	public void update(IObservable observable, String flag);
	public void update(IObservable observable, Object complexFlag);
	public void addObserverTo(IObservable observable, IObserver observer);
	public void releaseObserverFrom(IObservable observable, IObserver observer);
	public void releaseAllObserverFrom(IObservable observable);
	public void releaseAll();
	
}
