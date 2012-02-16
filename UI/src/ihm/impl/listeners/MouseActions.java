package ihm.impl.listeners;

import ihm.abstracts.AbstractBasePanel;
import ihm.impl.notifications.ObserverManager;
import ihm.interfaces.IObservable;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class MouseActions implements MouseMotionListener, MouseListener ,IObservable {
	
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
		this._observerManager = (ObserverManager) observerManager;
		
	}
	
	
	

}