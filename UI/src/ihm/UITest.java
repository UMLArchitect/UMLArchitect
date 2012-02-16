package ihm;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JWindow;

public class UITest extends JWindow {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void showOnFrame(JComponent component, String frameName) {
		JFrame frame = new JFrame(frameName);
		WindowAdapter wa = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		frame.addWindowListener(wa);
		frame.getContentPane().add(component);
		frame.setUndecorated(true);
		frame.setBounds(500, 300, 300, 300);
		frame.pack();
		frame.setVisible(true);
	}
	

}
