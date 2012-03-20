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

/**
 * 
 * @author Kilic FURKAN
 *
 */
public class SequenceDiagram_Personnage extends JPanel{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel _internalPanel;
	private JPanel _c ;
    private JTextField _textField;
    
	  public SequenceDiagram_Personnage(){
		  super();
		  this.setLayout(null);
	      this._internalPanel = new JPanel();
	      this._internalPanel.setLayout(new BorderLayout());
	      
		  _c = new JPanel();

		  this._textField = new JTextField("Usr");
		  _textField.setBounds(0, 0, getWidth(), getHeight());
		  this._internalPanel.add(_textField,BorderLayout.NORTH);
		  _c.setBackground(Color.white);
		  _c.setBorder(BorderFactory.createLineBorder(Color.black));
		  _c.setBounds(0, (int) getHeight()/5,(int) getWidth(), (int) (4*getHeight()/5));
		  _c.add(new LoadImageApp());
		  this._internalPanel.add(_c,BorderLayout.CENTER);
		  _internalPanel.setBackground(Color.white);
		  this.add(this._internalPanel);
		  
	  }
	  
	    public void setBounds(int x, int y, int width, int height)
	    {
	        super.setBounds(x, y, width, height);
	        this.internalBounds();
	    }

		private void internalBounds() {
			 Rectangle r = this.getBounds();
	        this._internalPanel.setBounds(0, 0, (int) r.getWidth(), (int) r.getHeight());
	        _c.setBounds(0, (int) r.getHeight()/5,(int) r.getWidth(), (int) (4*r.getHeight()/5));
	        _internalPanel.repaint();
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