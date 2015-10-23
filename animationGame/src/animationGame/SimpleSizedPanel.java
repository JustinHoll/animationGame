package animationGame;
import java.awt.Color;

import javax.swing.*;

public class SimpleSizedPanel extends SizedPanel {
	public void paintComponent(java.awt.Graphics g){
		g.fillRect(30, 50, 45, 80);
		g.setColor(new Color(176,89,42));
		
		g.fillOval(100, 100, 130, 50);
		
	}

	public static void main(String[] args) {
		ShowInFrame.show(new SimpleSizedPanel());
	}

}
