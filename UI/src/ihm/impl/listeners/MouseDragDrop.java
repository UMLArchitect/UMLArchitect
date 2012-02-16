package ihm.impl.listeners;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseDragDrop extends MouseMotionAdapter
{
	Component c;
	private Color[] color={Color.WHITE,Color.BLACK,Color.BLUE,Color.CYAN,Color.GRAY,Color.GREEN};
	private int numcolor;
	
	public MouseDragDrop()
	{
		
	}
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		super.mouseDragged(arg0);
		c=arg0.getComponent();
		c.setBackground(new Color(255,0,0));
		c.setBounds(c.getX() + arg0.getX(),c.getY() + arg0.getY(), c.getWidth(), c.getHeight());
		c.getParent().repaint();	
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		super.mouseMoved(arg0);
	}
	
	
	
}
