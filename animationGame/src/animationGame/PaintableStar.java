package animationGame;

public class PaintableStar extends SimpleStar implements Paintable{
	
	public PaintableStar(double innerRadius, double outerRadius, double x, double y, int jags) { //jags = Zacken
		super(innerRadius,outerRadius,x,y,jags);
	}

	public void paintTo(java.awt.Graphics g){
		//g.setColor(color);
		g.fillRect((int)pos.x, (int)pos.y, (int)width, (int)height);
	}
}
