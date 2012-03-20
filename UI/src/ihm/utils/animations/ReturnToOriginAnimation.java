package ihm.utils.animations;

import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

/**
 * @author Henri DESOBRY
 *
 */
public class ReturnToOriginAnimation implements ActionListener {

	Component c;
	float nb_inter;
	int nb_event = 0;
	Timer t;
	float inter_X;
	float inter_Y;
	Point p;
	
	/**
	 * 
	 * @param t
	 * @param c
	 * @param rect
	 * @param nb
	 * @param p
	 */
	public ReturnToOriginAnimation(Timer t, Component c, Rectangle rect, int nb, Point p)
	{
		this.t = t;
		this.c=c;
		this.nb_inter = 1;
		this.p = p;
		inter_X = (rect.x -c.getX()-p.x)/nb_inter;
		inter_Y = (rect.y -c.getY()-p.y)/nb_inter;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		nb_event++;
		if (nb_event == nb_inter)
		{
			t.stop();
		}
		c.setBounds((int)(c.getX()+inter_X), (int)(c.getY() + inter_Y),c.getWidth(),c.getHeight());
		c.getParent().repaint();
	}
}
