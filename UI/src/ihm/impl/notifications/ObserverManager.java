package ihm.impl.notifications;

import ihm.interfaces.IObservable;
import ihm.interfaces.IObserver;
import ihm.interfaces.IObserverManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class is final cause it shouldn't be able to be inherited.
 * With this keyword we lock this class.
 * @author Julien Sarazin
 *
 */
public final class ObserverManager implements IObserverManager{

	// Indicating that the variable is volatile requires the JVM to refresh its contents each time it is used. (In case of concurrent access)
	private static volatile ObserverManager instance;
	private HashMap<IObservable, List<IObserver>> _dataManager = new HashMap<IObservable, List<IObserver>>();
	
	private ObserverManager(){
		super();
	}
	
	public final static ObserverManager getInstance(){
		//"Double-Checked Singleton", avoids an expensive call to synchronized
		if(ObserverManager.instance == null){
			// Lock the class for concurrent access
			synchronized(ObserverManager.class){
				if(ObserverManager.instance == null)
					ObserverManager.instance = new ObserverManager();
			}
		}
		return ObserverManager.instance;
	}
	
	/**
	 * 
	 */
	public void addObserverTo(IObservable observable, IObserver observer) {
		if(!_dataManager.containsKey(observable))_dataManager.put(observable, new ArrayList<IObserver>());
		_dataManager.get(observable).add(observer);
	}

	/**
	 * 
	 */
	public void update(IObservable observable, String flag) {
		List<IObserver> observers = _dataManager.get(observable);
			for (IObserver observer : observers)
				observer.update(observable, flag);
	}
		
	/**
	 * 
	 */
	public void update(IObservable observable, Object complexFlag) {
		List<IObserver> observers = _dataManager.get(observable);
			for (IObserver observer : observers)
				observer.update(observable, complexFlag);
	}

	/*
	 * (non-Javadoc)
	 * @see umlArchitect.interfaces.IObserverManager#releaseObserverFrom(umlArchitect.interfaces.IObservable, umlArchitect.interfaces.IObserver)
	 */
	public void releaseObserverFrom(IObservable observable, IObserver observer) {
		_dataManager.get(observable).remove(observer);
		
	}

	/**
	 * 
	 */
	public void releaseAllObserverFrom(IObservable observable) {
		_dataManager.get(observable).clear();
		
	}

	/**
	 * 
	 */
	public void releaseAll() {
		_dataManager.clear();
	}
}
