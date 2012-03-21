package ihm.utils.animations;

import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.Timer;

import ihm.utils.animations.ReturnToOriginAnimation;

/**
 * This class will contain a static method for each animation we need to implement
 * @author Henri DESOBRY hdesobry@gmail.com
 * @version 1.0
 * @created at 16/02/2012
 *
 */
public class Animation 
{	
	
	/**
	 * This static method provide an animation : the component goes from its position to its original position.
	 * @param c : the component
	 * @param rect : Original position
	 * @param inter : time between every intermediate position
	 * @param nb_inter : number of intermediate position
	 * @param p : Position of the mouse
	 */
	public static void returnToOrigin(Component c,Rectangle rect, int inter, int nb_inter, Point p)
	{
		Timer t = new Timer(inter, null);
		ReturnToOriginAnimation l = new ReturnToOriginAnimation(t, c,rect,nb_inter,p);
		t.addActionListener(l);
		t.start();

	}

}
