package animationGame;
import java.awt.Color;

import javax.swing.*;

public class FirstPanel extends JPanel {

//	    int[] xPoints = {40, 50, 40, 80};
//	    int[] yPoints = {50, 65, 80, 65};
//	    int nPoints = xPoints.length;
//	    
//	    int[] x2Points = {80, 120, 110, 120};
//	    int[] y2Points = {65, 80, 65, 50};
//	    int n2Points = xPoints.length;
//	    
//	    int[] x3Points = {65, 80, 95, 80};
//	    int[] y3Points = {25, 65, 25, 35};
//	    int n3Points = xPoints.length;
//	    
//	    int[] x4Points = {65, 80, 95, 80};
//	    int[] y4Points = {105, 65, 105, 95};
//	    int n4Points = xPoints.length;
//	    
//		int[] xPoints = {30, 80, 95, 110, 160, 115, 130, 95, 65, 78};
//	    int[] yPoints = {60, 58, 8, 58, 60, 80, 120, 90, 120, 78};
//	    int nPoints = xPoints.length;
	    
	
	@Override public void paintComponent(java.awt.Graphics g){
//		//g.fillRect(30,50,45,80);
//		//g.fillOval(60, 30, 80, 50);
//		g.drawPolygon(xPoints, yPoints, nPoints);
//		g.drawPolygon(x2Points, y2Points, n2Points);
//		g.drawPolygon(x3Points, y3Points, n3Points);
//		g.drawPolygon(x4Points, y4Points, n4Points);
		
		//g.drawPolygon(xPoints, yPoints, nPoints);
		PaintableStar star = new PaintableStar(50, 60, Color.GREEN);
		star.paintTo(g);
	}
	
	public static void main(String []args){
		JFrame f=new JFrame();
		f.add(new FirstPanel());
		f.setSize(400, 250);
		//f.pack();
		f.setVisible(true);
		
		
	}
}