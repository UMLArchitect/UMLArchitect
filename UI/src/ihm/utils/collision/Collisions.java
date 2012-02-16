package ihm.utils.collision;

import ihm.abstracts.AbstractBaseComponent;


import java.awt.Component;
import java.util.List;

public class Collisions {
	
	public static boolean isCollision(Component toto,List<AbstractBaseComponent> all){
		for (Component t : all)
		{
			if(isIntersect(toto,t))
			{
				return true;
			}
		}
		return false;
	}
	
	private static boolean isIntersect(Component a, Component b){
		return a.getBounds().intersects(b.getBounds());
	}
	

}
