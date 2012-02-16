package ihm.impl.listeners;

import ihm.abstracts.AbstractBaseComponent;
import ihm.impl.notifications.ObserverManager;
import ihm.interfaces.IObservable;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class MouseActions implements MouseMotionListener, MouseListener ,IObservable {
	
	private ArrayList<AbstractBaseComponent> all;
	private ObserverManager _observerManager;
	
	public void add(AbstractBaseComponent c){
		all.add(c);
	}

	public MouseActions(){
		all = new ArrayList<AbstractBaseComponent>();
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		((AbstractBaseComponent)arg0.getComponent()).getAdapter().mouseClicked(all, (AbstractBaseComponent)arg0.getComponent());

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		((AbstractBaseComponent)arg0.getComponent()).getAdapter().mouseEntered(all, (AbstractBaseComponent)arg0.getComponent());
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		((AbstractBaseComponent)arg0.getComponent()).getAdapter().mouseExited(all, (AbstractBaseComponent)arg0.getComponent());
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		((AbstractBaseComponent)arg0.getComponent()).getAdapter().mousePressed(all, (AbstractBaseComponent)arg0.getComponent());
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		((AbstractBaseComponent)arg0.getComponent()).getAdapter().mouseReleased(all, (AbstractBaseComponent)arg0.getComponent());
		
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		((AbstractBaseComponent)arg0.getComponent()).getAdapter().mouseDragged(all, (AbstractBaseComponent)arg0.getComponent());
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		((AbstractBaseComponent)arg0.getComponent()).getAdapter().mouseMoved(all, (AbstractBaseComponent)arg0.getComponent());
		
	}

	@Override
	public void setObserverManager(
			ihm.interfaces.IObserverManager observerManager) {
		this._observerManager = (ObserverManager) observerManager;
		
	}
	
	
	

}