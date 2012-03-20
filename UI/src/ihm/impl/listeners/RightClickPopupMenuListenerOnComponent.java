package ihm.impl.listeners;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

/**
 * 
 * @author Kossi SODATONOU
 *
 */
public class RightClickPopupMenuListenerOnComponent implements ActionListener, PopupMenuListener {

	public Frame _myFrame;
	public MouseEvent _ME; // Contains the mouseEvent for the UMLComponent position
	
	public RightClickPopupMenuListenerOnComponent(Frame myFrame,MouseEvent e)
	{
		super();
		this._myFrame = myFrame;
		this._ME = e; 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().toString() == "Delete uml component")
		{
			System.out.println("** Tentative de suppression **");
			_myFrame.repaint(); // refresh the view
		}
	}
	
	@Override
	public void popupMenuCanceled(PopupMenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void popupMenuWillBecomeInvisible(PopupMenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void popupMenuWillBecomeVisible(PopupMenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}



}
