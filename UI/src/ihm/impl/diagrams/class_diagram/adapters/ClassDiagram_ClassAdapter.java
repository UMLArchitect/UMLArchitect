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
 * 
 * @author Henri DESOBRY
 *
 */
public class ClassDiagram_ClassAdapter implements IBaseAdapter {
	
	private Rectangle rect;
	private int MouseX;
	private int MouseY;
	private Point p =new Point();

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
		rect = c.getBounds();
		MouseX = e.getComponent().getMousePosition().x;
		MouseY = e.getComponent().getMousePosition().y;
		System.out.println("rectX "+rect.x +" rectY "+rect.y+" MouseX "+ MouseX + " MouseY "+MouseY);
		rect.x+=MouseX;
		rect.y+=MouseY;
		
			
	}

	@Override
	public void mouseReleased(ArrayList<AbstractBasePanel> all,
			AbstractBasePanel c, MouseEvent e) {
		System.out.println("rectX "+c.getBounds().x +" rectY "+c.getBounds().y+" MouseX "+e.getComponent().getMousePosition().x + " MouseY "+e.getComponent().getMousePosition().y);
		p.setLocation(MouseX+e.getComponent().getParent().getX(),MouseY+e.getComponent().getParent().getY());
		if(Collisions.isCollision(c, all))
		{
			Animation.returnToOrigin(c, rect, 10, 100, p);
		}
		
	}

	@Override
	public void mouseDragged(ArrayList<AbstractBasePanel> all,
			AbstractBasePanel c, MouseEvent e) {
		
		c.setBackground(new Color(255,0,0));
		c.setBounds(c.getX() + e.getX() - MouseX,c.getY() + e.getY() - MouseY, c.getWidth(), c.getHeight());
		c.getParent().repaint();
		
	}

	@Override
	public void mouseMoved(ArrayList<AbstractBasePanel> all,
			AbstractBasePanel c, MouseEvent e) {
		// TODO Auto-generated method stub
		
	}





	

}
