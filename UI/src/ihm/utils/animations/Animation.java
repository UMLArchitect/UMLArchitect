package ihm.utils.animations;

import java.awt.Component;
import java.awt.Rectangle;

import javax.swing.Timer;

import ihm.utils.animations.ReturnToOriginAnimation;

public class Animation {
	
	public static void returnToOrigin(Component c,Rectangle rect, int inter, int nb_inter)
	{
		Timer t = new Timer(inter, null);;
		ReturnToOriginAnimation l = new ReturnToOriginAnimation(t, c,rect,nb_inter);
		t.addActionListener(l);
		t.start();

	}

}
