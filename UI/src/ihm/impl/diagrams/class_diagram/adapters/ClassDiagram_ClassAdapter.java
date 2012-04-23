package ihm.impl.diagrams.class_diagram.adapters;

import ihm.abstracts.AbstractBasePanel;
import ihm.interfaces.IBaseAdapter;
import ihm.utils.animations.Animation;
import ihm.utils.collision.Collisions;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * this class is the adapter attached to every ClassDiagram_Class
 * @author Henri DESOBRY hdesobry@gmail.com
 * @version 1.0
 * @created at 16/02/2012
 */
public class ClassDiagram_ClassAdapter implements IBaseAdapter {
	
	private Rectangle _rect;
	private int _MouseX;
	private int _MouseY;
	private Point _p =new Point();

	@Override
	public void mouseClicked(ArrayList<AbstractBasePanel> all,AbstractBasePanel c, MouseEvent e) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(ArrayList<AbstractBasePanel> all,AbstractBasePanel c, MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(ArrayList<AbstractBasePanel> all,AbstractBasePanel c, MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(ArrayList<AbstractBasePanel> all,AbstractBasePanel c, MouseEvent e) {
		_rect = c.getBounds();
		_MouseX = e.getComponent().getMousePosition().x;
		_MouseY = e.getComponent().getMousePosition().y;
		//System.out.println("rectX "+_rect.x +" rectY "+_rect.y+" MouseX "+ _MouseX + " MouseY "+_MouseY);
		_rect.x+=_MouseX;
		_rect.y+=_MouseY;
		
			
	}

	@Override
	public void mouseReleased(ArrayList<AbstractBasePanel> all, AbstractBasePanel c, MouseEvent e) {
		//System.out.println("rectX "+c.getBounds().x +" rectY "+c.getBounds().y+" MouseX "+e.getComponent().getMousePosition().x + " MouseY "+e.getComponent().getMousePosition().y);
		_p.setLocation(_MouseX+e.getComponent().getParent().getX(),_MouseY+e.getComponent().getParent().getY());
		if(Collisions.isCollision(c, all))
		{
			Animation.returnToOrigin(c, _rect, 100, 100, _p);
		}
		
	}

	@Override
	public void mouseDragged(ArrayList<AbstractBasePanel> all,AbstractBasePanel c, MouseEvent e) {
		
		c.setBackground(new Color(255,0,0));
		c.setBounds(c.getX() + e.getX() - _MouseX,c.getY() + e.getY() - _MouseY, c.getWidth(), c.getHeight());
		c.getParent().repaint();
		
	}

	@Override
	public void mouseMoved(ArrayList<AbstractBasePanel> all,AbstractBasePanel c, MouseEvent e) {
		// TODO Auto-generated method stub
		
	}





	

}
