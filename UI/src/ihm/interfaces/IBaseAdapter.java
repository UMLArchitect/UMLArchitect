package ihm.interfaces;

import ihm.abstracts.AbstractBaseComponent;

import java.util.ArrayList;


public interface IBaseAdapter {

	public void mouseClicked(ArrayList<AbstractBaseComponent> all,AbstractBaseComponent c);
	public void mouseEntered(ArrayList<AbstractBaseComponent> all,AbstractBaseComponent c);
	public void mouseExited(ArrayList<AbstractBaseComponent> all,AbstractBaseComponent c);
	public void mousePressed(ArrayList<AbstractBaseComponent> all,AbstractBaseComponent c);
	public void mouseReleased(ArrayList<AbstractBaseComponent> all,AbstractBaseComponent c);
	public void mouseDragged(ArrayList<AbstractBaseComponent> all,AbstractBaseComponent c);
	public void mouseMoved(ArrayList<AbstractBaseComponent> all,AbstractBaseComponent c);
}
