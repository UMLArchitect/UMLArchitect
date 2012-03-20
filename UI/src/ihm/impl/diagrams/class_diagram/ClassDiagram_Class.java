package ihm.impl.diagrams.class_diagram;

import ihm.abstracts.AbstractBasePanel;
import ihm.impl.diagrams.class_diagram.adapters.ClassDiagram_ClassAdapter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author Kilic FURKAN
 *
 */
public class ClassDiagram_Class extends AbstractBasePanel{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel _internalPanel;
	private JPanel _c ;
	private JPanel _h;
    private JTextField _textField;
    
	  public ClassDiagram_Class(){
		  
		  super();
		  this.setLayout(null);
	      this._internalPanel = new JPanel();
	      this._internalPanel.setLayout(new BorderLayout());
	      setAdapter(new ClassDiagram_ClassAdapter());
	      
		  _h = new JPanel();
		  _c = new JPanel();

        this._textField = new JTextField("Classe");
		  _textField.setBounds(0, 0, getWidth(), getHeight());
		  _h.setLayout(new BorderLayout());
		  _c.setBackground(Color.white);
		  _h.setBackground(Color.white);
		  _c.setBorder(BorderFactory.createLineBorder(Color.black));
		  _h.setBorder(BorderFactory.createLineBorder(Color.black));
		  _h.add(_textField);

		  _h.setBounds(0, 0,(int) getWidth(), (int) getHeight()/5);
		  _c.setBounds(0, (int) getHeight()/5,(int) getWidth(), (int) (4*getHeight()/5));
		  this._internalPanel.add(_c,BorderLayout.CENTER);
		  this._internalPanel.add(_h,BorderLayout.NORTH);
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
			_h.setBounds(0, 0,(int) r.getWidth(), (int) r.getHeight()/5);
	        _c.setBounds(0, (int) r.getHeight()/5,(int) r.getWidth(), (int) (4*r.getHeight()/5));
	        _internalPanel.repaint();
	        this.repaint();
		}
}