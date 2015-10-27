package animationGame;

import java.awt.Color;

public class PaintableStar extends SimpleStar implements Paintable{
	
	public PaintableStar(double x, double y, Color color) { 
		super(x,y, color);
	}

	public void paintTo(java.awt.Graphics g){
		//g.setColor(color);
		//g.fillRect((int)pos.x, (int)pos.y, (int)width, (int)height);
		
		//g.drawPolygon(xPoints, yPoints, nPoints);
		g.setColor(color);
		g.fillPolygon(xPoints, yPoints, nPoints);
	}
}
