package ihm.impl.diagrams;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;
import ihm.utils.Dictionary;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ihm.utils.Array;

/**
 * 
 * @author Kilic FURKAN
 *
 */
public class FlyingCase extends JPanel
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final Color kNormalColor = Color.LIGHT_GRAY;
    public static final Color kSelectedColor = Color.RED;
    public static final String kFrameKey = "frame";
    public static final String kValueKey = "value";
    
    private Array<Arrow> _arrowsSource;
    private Array<Arrow> _arrowsDest;

    private JTextField _textField;
    private JPanel _internalPanel;
    private Color _savedColor;

    public FlyingCase(String title)
    {
        this.setLayout(null);
        this._internalPanel = new JPanel();
        this._internalPanel.setLayout(new BorderLayout());
        this._textField = new JTextField(title);
        //this.internalPanel.add(this.textField);
        this.add(this._internalPanel);
        this._arrowsSource = new Array<Arrow>();
        this._arrowsDest = new Array<Arrow>();
        this.setBackground( (this._savedColor = FlyingCase.kNormalColor) );
    }

    public Array<Arrow> getArrowsSource() { return this._arrowsSource; }
    public Array<Arrow> getArrowsDest() { return this._arrowsDest; }
    public String getText() { return this._textField.getText(); }

    @Override
    public void setBounds(Rectangle r)
    {
        super.setBounds(r);
        this.internalBounds();
    }
    
    @Override
    public void setBounds(int x, int y, int width, int height)
    {
        super.setBounds(x, y, width, height);
        this.internalBounds();
    }

    public void setSavedBackgroundColor(Color c) { this._savedColor = c; }
    public Color getSavedBackgroundColor() { return this._savedColor; }
    public void restoreSavedBackgroundColor() { this.setBackground(this._savedColor); }

    private void internalBounds()
    {
        Rectangle r = this.getBounds();
        this._internalPanel.setBounds(15, 15, r.width-30, r.height-30);
        this.repaint();
    }

    public Dictionary getDictionary()
    {
        Dictionary d = new Dictionary();
        Rectangle r = this.getBounds();
        Array<String> frame = new Array<String>();
        frame.addObject(Integer.toString(r.x));
        frame.addObject(Integer.toString(r.y));
        frame.addObject(Integer.toString(r.width));
        frame.addObject(Integer.toString(r.height));
        d.setObjectForKey(frame, FlyingCase.kFrameKey);
        d.setObjectForKey(this._textField.getText(), FlyingCase.kValueKey);
        return d;
    }

    @Override
    public boolean equals(Object o)
    {
        if(o instanceof FlyingCase)
        {
            FlyingCase fc = (FlyingCase)o;
            Rectangle r = this.getBounds();
            Rectangle r2 = fc.getBounds();
            if(r.equals(r2))
                if(this._textField.equals(fc._textField))
                    return true;
        }
        return false;
    }
}
