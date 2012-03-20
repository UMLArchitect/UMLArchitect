package ihm.impl.listeners;

import ihm.impl.diagrams.UmlComponent;

import java.awt.Component;
import java.awt.Frame;
import java.awt.event.*;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

/**
 * 
 * @author Kossi SODATONOU
 *
 */
public class RightClickPopupMenuListener implements ActionListener, PopupMenuListener{
	public Frame myFrame;
	public MouseEvent ME; // Contains the mouseEvent for the UMLComponent position
	
	public RightClickPopupMenuListener(Component component,MouseEvent e)
	{
		super();
		this.myFrame = (Frame)component;
		this.ME = e; 
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getActionCommand().toString() == "Add uml component")
		{
			new UmlComponent(myFrame,ME.getX(),ME.getY());
			myFrame.repaint(); // refresh the view
		}
	}

	@Override
	public void popupMenuCanceled(PopupMenuEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
		// TODO Auto-generated method stub
		
	}

}
