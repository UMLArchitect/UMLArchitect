package ihm;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class UITest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args){
		
		JFrame ui = new UITest();	
		JPanel panel = new JPanel();
		ui.add(panel);		
		ui.setSize(500, 300);
		ui.setVisible(true);
		
	}
	

}
