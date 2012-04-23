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
	
	public Frame _myFrame;
	public MouseEvent _ME; // Contains the mouseEvent for the UMLComponent position
	public Component _currentComponent;
	
	public RightClickPopupMenuListener(Component component,MouseEvent e)
	{
		super();
		this._myFrame = new Frame();
		this._currentComponent = component;
		this._ME = e; 
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getActionCommand().toString() == "Add uml component")
		{
			new UmlComponent(_myFrame,_ME.getX(),_ME.getY());
			_myFrame.repaint(); // refresh the view
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
