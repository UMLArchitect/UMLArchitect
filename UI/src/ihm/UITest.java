package ihm;


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
		ui.setLayout(null);
		ClassDiagram_Class panel = new ClassDiagram_Class();
		ClassDiagram_Class panel2 = new ClassDiagram_Class();
		panel.setBounds(100, 100, 100, 100);
		panel2.setBounds(500, 500, 100, 100);

		ui.add(panel);
		ui.add(panel2);
		ui.setSize(800, 800);
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
