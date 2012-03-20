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
 * 
 * @author Henri DESOBRY
 *
 */
public class MouseActions implements MouseMotionListener, MouseListener ,IObservable
{	
	private ArrayList<AbstractBasePanel> all;
	private ObserverManager _observerManager;
	
	public void add(AbstractBasePanel c){
		all.add(c);
	}

	public MouseActions(){
		all = new ArrayList<AbstractBasePanel>();
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (SwingUtilities.isRightMouseButton(arg0)) {
		     JPopupMenu menu = new JPopupMenu();
		     menu.add(new JMenuItem("Add uml component")).addActionListener(new RightClickPopupMenuListener(arg0.getComponent(),arg0));
		     menu.show(arg0.getComponent(),arg0.getX(), arg0.getY());
		 }	
		else
			((AbstractBasePanel)arg0.getComponent()).getAdapter().mouseClicked(all, (AbstractBasePanel)arg0.getComponent(), arg0);

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		((AbstractBasePanel)arg0.getComponent()).getAdapter().mouseEntered(all, (AbstractBasePanel)arg0.getComponent(), arg0);
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		((AbstractBasePanel)arg0.getComponent()).getAdapter().mouseExited(all, (AbstractBasePanel)arg0.getComponent(), arg0);
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		((AbstractBasePanel)arg0.getComponent()).getAdapter().mousePressed(all, (AbstractBasePanel)arg0.getComponent(), arg0);
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		((AbstractBasePanel)arg0.getComponent()).getAdapter().mouseReleased(all, (AbstractBasePanel)arg0.getComponent(), arg0);
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		((AbstractBasePanel)arg0.getComponent()).getAdapter().mouseDragged(all, (AbstractBasePanel)arg0.getComponent(), arg0);
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		((AbstractBasePanel)arg0.getComponent()).getAdapter().mouseMoved(all, (AbstractBasePanel)arg0.getComponent(), arg0);
	}

	@Override
	public void setObserverManager(
			ihm.interfaces.IObserverManager observerManager) {
		this.set_observerManager((ObserverManager) observerManager);
	}

	public ObserverManager get_observerManager() {
		return _observerManager;
	}

	public void set_observerManager(ObserverManager _observerManager) {
		this._observerManager = _observerManager;
	}
	
	
	

}