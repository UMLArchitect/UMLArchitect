package ihm;


import ihm.abstracts.AbstractBasePanel;
import ihm.impl.diagrams.class_diagram.ClassDiagram_Class;
import ihm.impl.listeners.MouseActions;

import javax.swing.JFrame;

public class UITest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args){
		
		JFrame ui = new UITest();
		ui.setBounds(10, 10, 10000, 10000);
		ui.setLayout(null);
		AbstractBasePanel panel = new ClassDiagram_Class();
		AbstractBasePanel panel2 = new ClassDiagram_Class();
		panel.setBounds(100, 100, 100, 100);
		panel2.setBounds(500, 500, 100, 100);

		ui.add(panel);
		ui.add(panel2);
		ui.setSize(500, 300);
		ui.setVisible(true);
		
		MouseActions ma = new MouseActions();		
		panel.addMouseMotionListener(ma);
		panel.addMouseListener(ma);
		panel2.addMouseMotionListener(ma);
		panel2.addMouseListener(ma);
		ma.add(panel);
		ma.add(panel2);
		
		
		
	}
	

}
