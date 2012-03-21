package ihm.impl.listeners;

import ihm.abstracts.AbstractBasePanel;
import ihm.impl.notifications.ObserverManager;
import ihm.interfaces.IObservable;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

/**
 * This class will be the listener which catches the mouse event and then dispatch to the right adapter
 * @author Henri DESOBRY
 * @version 1.0
 */
public class MouseActions implements MouseMotionListener, MouseListener ,IObservable
{	
	/**
	 * this list contains all the components created in the global view
	 */
	private ArrayList<AbstractBasePanel> _all;
	/**
	 * 
	 */
	private ObserverManager _observerManager;
	
	/**
	 * Add a component to the list
	 * @param c : Component which will be add to the list
	 */
	public void add(AbstractBasePanel c){
		_all.add(c);
	}
	
	/**
	 * Class Constructor
	 */
	public MouseActions(){
		_all = new ArrayList<AbstractBasePanel>();
	}
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (SwingUtilities.isRightMouseButton(arg0)) {
		     JPopupMenu menu = new JPopupMenu();
		     menu.add(new JMenuItem("Add uml component")).addActionListener(new RightClickPopupMenuListener(arg0.getComponent(),arg0));
		     menu.show(arg0.getComponent(),arg0.getX(), arg0.getY());
		 }	
		else
			((AbstractBasePanel)arg0.getComponent()).getAdapter().mouseClicked(_all, (AbstractBasePanel)arg0.getComponent(), arg0);

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		((AbstractBasePanel)arg0.getComponent()).getAdapter().mouseEntered(_all, (AbstractBasePanel)arg0.getComponent(), arg0);
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		((AbstractBasePanel)arg0.getComponent()).getAdapter().mouseExited(_all, (AbstractBasePanel)arg0.getComponent(), arg0);
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		((AbstractBasePanel)arg0.getComponent()).getAdapter().mousePressed(_all, (AbstractBasePanel)arg0.getComponent(), arg0);
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		((AbstractBasePanel)arg0.getComponent()).getAdapter().mouseReleased(_all, (AbstractBasePanel)arg0.getComponent(), arg0);
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		((AbstractBasePanel)arg0.getComponent()).getAdapter().mouseDragged(_all, (AbstractBasePanel)arg0.getComponent(), arg0);
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		((AbstractBasePanel)arg0.getComponent()).getAdapter().mouseMoved(_all, (AbstractBasePanel)arg0.getComponent(), arg0);
	}

	@Override
	public void setObserverManager(
			ihm.interfaces.IObserverManager observerManager) {
		this.set_observerManager((ObserverManager) observerManager);
	}
	
	/**
	 * get the observer manager
	 * @return the observer manager
	 */
	public ObserverManager get_observerManager() {
		return _observerManager;
	}
	
	/**
	 * set the observer manager
	 * @param _observerManager
	 */
	public void set_observerManager(ObserverManager _observerManager) {
		this._observerManager = _observerManager;
	}
	
	
	

}