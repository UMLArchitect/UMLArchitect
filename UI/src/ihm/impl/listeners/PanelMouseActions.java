package ihm.impl.listeners;

import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.Console;

import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

import ihm.impl.diagrams.UmlComponent;

public class PanelMouseActions implements MouseListener, MouseMotionListener{

	Frame myFrame;
	Component elementUnderMouse;
	
	public PanelMouseActions(Frame myFrame){
		super();
		this.myFrame = myFrame;	
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (SwingUtilities.isLeftMouseButton(e)) {
			leftClickAction(e);
		} else {
			rightClickAction(e);
		}
	}

	private void rightClickAction(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("* The right mouse button have been pushed into a Panel *");
		
	}

	private void leftClickAction(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("* The left mouse button have been pushed into a Panel *");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(getComponentUnderMouse(e) != null)
			if (SwingUtilities.isRightMouseButton(e)) {
			     JPopupMenu menu = new JPopupMenu();
			     menu.add(new JMenuItem("Delete uml component")).addActionListener(new RightClickPopupMenuListener(myFrame,e));
			     menu.show(elementUnderMouse,e.getX(), e.getY());
			}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if (SwingUtilities.isRightMouseButton(e))
			return; // We don't move if the button clicked is the right button
		getComponentUnderMouse(e);
		int offsetX = e.getX()-elementUnderMouse.getX();
		int offsetY = e.getY()-elementUnderMouse.getY();
		System.out.println(" Valeurs des offsets: X: "+ offsetX +" Y: "+ offsetY);
		offsetX = 0;
		offsetY = 0;
		
		elementUnderMouse.setBounds(elementUnderMouse.getX()+e.getX()-offsetX,elementUnderMouse.getY() + e.getY()-offsetY,elementUnderMouse.getWidth(),elementUnderMouse.getHeight());
		elementUnderMouse.getParent().repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public Component getComponentUnderMouse(MouseEvent e)
	{
		this.elementUnderMouse = null;
		return this.elementUnderMouse = e.getComponent();
		
	}
}
