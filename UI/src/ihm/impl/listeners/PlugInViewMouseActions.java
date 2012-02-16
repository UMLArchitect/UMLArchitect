package ihm.impl.listeners;

import java.awt.Component;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

public class PlugInViewMouseActions implements MouseListener, MouseMotionListener {
	Frame currentFrame;
	Component c;
	
	public PlugInViewMouseActions(Frame globalFrame)
	{
		super();
		this.currentFrame = globalFrame;
		globalFrame.addMouseListener(this);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		 if (SwingUtilities.isRightMouseButton(e)) {
		     JPopupMenu menu = new JPopupMenu();
		     menu.add(new JMenuItem("Add uml component")).addActionListener(new RightClickPopupMenuListener(currentFrame,e));
		     menu.show(currentFrame,e.getX(), e.getY());
		 }	
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
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
