package ihm.utils.animations;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class ReturnToOriginAnimation implements ActionListener {

	Component c;
	int nb_inter;
	int nb_event = 0;
	Timer t;
	int inter_X;
	int inter_Y;
	
	public ReturnToOriginAnimation(Timer t, Component c, Rectangle rect, int nb)
	{
		this.t = t;
		this.c=c;
		this.nb_inter = nb;
		inter_X = (int)(rect.x -c.getX())/nb_inter;
		inter_Y = (int)(rect.y -c.getY())/nb_inter;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		nb_event++;
		if (nb_event == nb_inter)
		{
			t.stop();
		}
		c.setBounds(c.getX()+inter_X, c.getY() + inter_Y,c.getWidth(),c.getHeight());
		c.getParent().repaint();
	}

}
