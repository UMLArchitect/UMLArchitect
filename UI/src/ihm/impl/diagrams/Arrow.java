package ihm.impl.diagrams;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Stroke;

import javax.swing.JPanel;

/**
 * 
 * @author Kilic FURKAN
 *
 */
public class Arrow extends JPanel
{
    private JPanel src;
    private JPanel dest;
    public static int style=0;

    private int xsrc, ysrc, xdest, ydest;
    
    Stroke drawingStroke = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);

    public Arrow(JPanel src, JPanel dest)
    {
        this.src = src;
        this.dest = dest;
        this.setOpaque(false);
//        ((FlyingCase) this.src).getArrowsSource().addObject(this);
//        ((FlyingCase) this.dest).getArrowsDest().addObject(this);
    }
    public Arrow(JPanel src, JPanel dest,int style)
    {
        this.src = src;
        this.dest = dest;
        this.setOpaque(false);
        this.style=style;
//        ((FlyingCase) this.src).getArrowsSource().addObject(this);
//        ((FlyingCase) this.dest).getArrowsDest().addObject(this);
    }

    public JPanel getSource() { return this.src; }
    public JPanel getDest() { return this.dest; }

    public int[] getPoints() { int[] i={xsrc, ysrc, xdest, ydest};return i; }
    
    private boolean inix=false;
    private boolean iniy=false;
    
    public void requestRedraw()
    {
        Rectangle r1 = this.src.getBounds();
        Rectangle r2 = this.dest.getBounds();
        int x=0 , y=0, width=0, height=0;
        if((r1.x<(r2.x+r2.width))&&((r1.x+r1.width)>r2.x)){
        	inix=true;
        	 if(r1.x < r2.x)
               {
                   x = r1.x;
                   width = r2.x+r2.width/2-r1.x+r1.width/2;
                   xsrc = r1.width/2;
                   xdest = width - r1.width/2;
               }
               else
               {
                   x = r2.x;
                   width = r1.x+r1.width/2-r2.x+r2.width/2;
                   xsrc = width - r2.width/2;
                   xdest = r2.width/2;
               }
        }
        else{
        	inix=false;
	        if(r1.x < r2.x)
	        {
	            x = r1.x;
	            width = r2.x-r1.x+r1.width;
	            xsrc = r1.width;
	            xdest = width - r1.width;
	        }
	        else
	        {
	            x = r2.x;
	            width = r1.x-r2.x+r1.width;
	            xsrc = width - r1.width;
	            xdest = r2.width;
	        }
        }
        if((r1.y<(r2.y+r2.height))&&((r1.y+r1.height)>r2.y)){
        	iniy=true;
	        if(r1.y < r2.y)
	        {
	            y = r1.y;
	            height = r2.y+r2.height/2-r1.y+r1.height/2;
	            ysrc = r1.height/2;
	            ydest = height - r1.height/2;
	        }
	        else
	        {
	            y = r2.y;
	            height = r1.y+r1.height/2-r2.y+r2.height/2;
	            ysrc = height - r2.height/2;
	            ydest = r2.height/2;
	        }
        }
        else
        {    
        	iniy=false;
        	if(r1.y < r2.y)
	        {
	            y = r1.y;
	            height = r2.y-r1.y+r1.height;
	            ysrc = r1.height;
	            ydest = height - r1.height;
	        }
	        else
	        {
	            y = r2.y;
	            height = r1.y-r2.y+r1.height;
	            ysrc = height - r1.height;
	            ydest = r2.height;
	        }
        }
        this.setBounds(x,y,width, height);
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        this.drawArrow(g2, xsrc, ysrc, xdest, ydest);

    }
    
    private void drawArrow( Graphics2D g, int x, int y, int xx, int yy )
    {
        float arrowWidth = 10.0f;
        float theta = 0.423f;
        int[] xPoints = new int[4];
        int[] yPoints = new int[4];
        float[] vecLine = new float[2];
        float[] vecLeft = new float[2];
        float fLength;
        float th;
        float ta;
        float baseX=xx, baseY=yy;

        if (!(this.dest instanceof PointNoir) && (style==2||style==3||style==4||style==5||style==6||style==7||style==8||style==9)){
        xPoints[0] = xx;
        yPoints[0] = yy;
        vecLine[0] = (float)xPoints[0]-x;
        vecLine[1] = (float)yPoints[0]-y;

        vecLeft[0] = -vecLine[1];
        vecLeft[1] = vecLine[0];

        fLength = (float)Math.sqrt(vecLine[0]*vecLine[0]+vecLine[1]*vecLine[1]);
        th = arrowWidth / (2.0f*fLength);
        ta = arrowWidth / (2.0f*((float)Math.tan(theta)/2.0f)*fLength);
        baseX = ((float)xPoints[0]-ta*vecLine[0]);
        baseY = ((float)yPoints[0]-ta*vecLine[1]);

        xPoints[1] = (int)(baseX+th*vecLeft[0]);
        yPoints[1] = (int)(baseY+th*vecLeft[1]);
        xPoints[2] = (int)(baseX-th*vecLeft[0]);
        yPoints[2] = (int)(baseY-th*vecLeft[1]);
        if (style==6||style==7||style==8||style==9){
            xPoints[3] = (int)(baseX-th*vecLeft[0]);
            yPoints[3] = (int)(baseY-th*vecLeft[1]);
        	baseX = ((float)xPoints[0]-2*ta*vecLine[0]);
            baseY = ((float)yPoints[0]-2*ta*vecLine[1]);
        	xPoints[2] = (int)(baseX);
  	        yPoints[2] = (int)(baseY);
        }
        }

        
        if (style==1||style==3||style==5||style==7||style==9)
    	g.setStroke(drawingStroke);
//        if(!inix&&!iniy){
//            g.drawLine(x,y,(int)baseX,y);
//            g.drawLine((int)baseX,y,(int)baseX,(int)baseY);
//        }
//        else
        	g.drawLine(x,y,(int)baseX,(int)baseY);
        	if(!(this.dest instanceof PointNoir)){
		        if (style==2||style==3)
		        	g.fillPolygon(xPoints,yPoints,3);
		        if (style==4||style==5)
		        	g.drawPolygon(xPoints,yPoints,3);
		        if (style==6||style==7)
		        	g.fillPolygon(xPoints,yPoints,4);
		        if (style==8||style==9)
		        	g.drawPolygon(xPoints,yPoints,4);
        	}
    
        
    }
}
