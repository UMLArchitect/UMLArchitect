package ihm.impl.diagrams.sequence_diagram;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SequenceDiagram_Personnage extends JPanel{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel internalPanel;
	JPanel c ;
    private JTextField textField;
    
	  public SequenceDiagram_Personnage(){
		  super();
		  this.setLayout(null);
	      this.internalPanel = new JPanel();
	      this.internalPanel.setLayout(new BorderLayout());
	      
		  c = new JPanel();

		  this.textField = new JTextField("Usr");
		  textField.setBounds(0, 0, getWidth(), getHeight());
		  this.internalPanel.add(textField,BorderLayout.NORTH);
		  c.setBackground(Color.white);
		  c.setBorder(BorderFactory.createLineBorder(Color.black));
		  c.setBounds(0, (int) getHeight()/5,(int) getWidth(), (int) (4*getHeight()/5));
		  c.add(new LoadImageApp());
		  this.internalPanel.add(c,BorderLayout.CENTER);
		  internalPanel.setBackground(Color.white);
		  this.add(this.internalPanel);
		  
	  }
	  
	    public void setBounds(int x, int y, int width, int height)
	    {
	        super.setBounds(x, y, width, height);
	        this.internalBounds();
	    }

		private void internalBounds() {
			 Rectangle r = this.getBounds();
	        this.internalPanel.setBounds(0, 0, (int) r.getWidth(), (int) r.getHeight());
	        c.setBounds(0, (int) r.getHeight()/5,(int) r.getWidth(), (int) (4*r.getHeight()/5));
	        internalPanel.repaint();
	        this.repaint();
		}
		public class LoadImageApp extends Component {
	           
		    /**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			BufferedImage img;
		 
		    public void paint(Graphics g) {
		        g.drawImage(img, 0, 0, null);
		    }
		 
		    public LoadImageApp() {
		       try {
		           img = ImageIO.read(new File("icons\\sample.gif"));
		       } catch (IOException e) {
		       }
		 
		    }
		 
		    public Dimension getPreferredSize() {
		        if (img == null) {
		             return new Dimension(100,100);
		        } else {
		           return new Dimension(img.getWidth(null), img.getHeight(null));
		       }
		    }
		 
		}
}