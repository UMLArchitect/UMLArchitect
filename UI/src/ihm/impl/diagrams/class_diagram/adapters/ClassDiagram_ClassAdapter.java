package ihm.impl.diagrams.class_diagram.adapters;

import ihm.abstracts.AbstractBasePanel;
import ihm.interfaces.IBaseAdapter;
import ihm.utils.animations.Animation;
import ihm.utils.collision.Collisions;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class ClassDiagram_ClassAdapter implements IBaseAdapter {
	
	private Rectangle rect;

	@Override
	public void mouseClicked(ArrayList<AbstractBasePanel> all,
			AbstractBasePanel c, MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(ArrayList<AbstractBasePanel> all,
			AbstractBasePanel c, MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(ArrayList<AbstractBasePanel> all,
			AbstractBasePanel c, MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(ArrayList<AbstractBasePanel> all,
			AbstractBasePanel c, MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(ArrayList<AbstractBasePanel> all,
			AbstractBasePanel c, MouseEvent e) {
		if(Collisions.isCollision(c, all))
		{
			Animation.returnToOrigin(c, rect, 100, 100);
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(ArrayList<AbstractBasePanel> all,
			AbstractBasePanel c, MouseEvent e) {
		rect = c.getBounds();
		c.setBackground(new Color(255,0,0));
		c.setBounds(c.getX() + e.getX(),c.getY() + e.getY(), c.getWidth(), c.getHeight());
		c.getParent().repaint();
		
	}

	@Override
	public void mouseMoved(ArrayList<AbstractBasePanel> all,
			AbstractBasePanel c, MouseEvent e) {
		// TODO Auto-generated method stub
		
	}





	

}
