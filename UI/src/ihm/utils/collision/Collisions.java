package ihm.utils.collision;

import ihm.abstracts.AbstractBasePanel;
import ihm.impl.diagrams.arrows.Arrow;
import ihm.impl.diagrams.utils.PointNoir;


import java.awt.Component;
import java.util.List;
/**
 * This class provide the detection of collision between two items
 * @author Henri DESOBRY hdesobry@gmail.com
 * @version 1.0
 * @created at 16/02/2012
 */

public class Collisions 
{	
	/**
	 * this static method is used to detect the collisions between a component and all the others components provides in the list
	 * @param comp Component on which the test is performed
	 * @param all List of component to test the collision
	 * @return true if collision detected, false else
	 */
	public static boolean isCollision(Component comp,List<AbstractBasePanel> all){
		for (Component t : all)
		{
			if((t instanceof Arrow) ||(t instanceof PointNoir))
				return false;
			if(isIntersect(comp,t))
			{
				return true;
			}
			
		}
		return false;
	}
	
	/**
	 * this method detects the collision between two components.
	 * @param a : the first component
	 * @param b : the second component
	 * @return false if no collision detected or the two component are the same, true if collision
	 */
	private static boolean isIntersect(Component a, Component b)
	{
		if(a.equals(b))
				return false;
		return a.getBounds().intersects(b.getBounds());
	}
}
