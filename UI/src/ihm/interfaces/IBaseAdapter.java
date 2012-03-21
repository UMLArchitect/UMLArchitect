package ihm.interfaces;

import ihm.abstracts.AbstractBasePanel;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * This interface is the base for every adapter needed to handle the mouse events.
 * @author Henri DESOBRY
 * @version 1.0
 */
public interface IBaseAdapter {
	
	
	/**
	 * This method is called when the mouse is clicked
	 * @param all : List of all the panel in the view
	 * @param c : Panel on which the event is raised
	 * @param e : Mouse Event
	 */
	public void mouseClicked(ArrayList<AbstractBasePanel> all,AbstractBasePanel c,MouseEvent e);
	
	/**
	 * This method is called when the mouse is entered
	 * @param all : List of all the panel in the view
	 * @param c : Panel on which the event is raised
	 * @param e : Mouse Event
	 */
	public void mouseEntered(ArrayList<AbstractBasePanel> all,AbstractBasePanel c,MouseEvent e);
	
	/**
	 * This method is called when the mouse is exited
	 * @param all : List of all the panel in the view
	 * @param c : Panel on which the event is raised
	 * @param e : Mouse Event
	 */
	public void mouseExited(ArrayList<AbstractBasePanel> all,AbstractBasePanel c,MouseEvent e);
	
	/**
	 * This method is called when the mouse is pressed
	 * @param all : List of all the panel in the view
	 * @param c : Panel on which the event is raised
	 * @param e : Mouse Event
	 */
	public void mousePressed(ArrayList<AbstractBasePanel> all,AbstractBasePanel c,MouseEvent e);
	
	/**
	 * This method is called when the mouse is released
	 * @param all : List of all the panel in the view
	 * @param c : Panel on which the event is raised
	 * @param e : Mouse Event
	 */
	public void mouseReleased(ArrayList<AbstractBasePanel> all,AbstractBasePanel c,MouseEvent e);
	
	/**
	 * This method is called when the mouse is dragged
	 * @param all : List of all the panel in the view
	 * @param c : Panel on which the event is raised
	 * @param e : Mouse Event
	 */
	public void mouseDragged(ArrayList<AbstractBasePanel> all,AbstractBasePanel c,MouseEvent e);
	
	/**
	 * This method is called when the mouse is moved
	 * @param all : List of all the panel in the view
	 * @param c : Panel on which the event is raised
	 * @param e : Mouse Event
	 */
	public void mouseMoved(ArrayList<AbstractBasePanel> all,AbstractBasePanel c,MouseEvent e);
}
