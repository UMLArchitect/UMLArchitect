package ihm.interfaces;

import ihm.abstracts.AbstractBasePanel;

import java.awt.event.MouseEvent;
import java.util.ArrayList;


public interface IBaseAdapter {

	public void mouseClicked(ArrayList<AbstractBasePanel> all,AbstractBasePanel c,MouseEvent e);
	public void mouseEntered(ArrayList<AbstractBasePanel> all,AbstractBasePanel c,MouseEvent e);
	public void mouseExited(ArrayList<AbstractBasePanel> all,AbstractBasePanel c,MouseEvent e);
	public void mousePressed(ArrayList<AbstractBasePanel> all,AbstractBasePanel c,MouseEvent e);
	public void mouseReleased(ArrayList<AbstractBasePanel> all,AbstractBasePanel c,MouseEvent e);
	public void mouseDragged(ArrayList<AbstractBasePanel> all,AbstractBasePanel c,MouseEvent e);
	public void mouseMoved(ArrayList<AbstractBasePanel> all,AbstractBasePanel c,MouseEvent e);
}
