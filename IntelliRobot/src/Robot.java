import java.awt.Color;
import java.awt.Graphics;


public class Robot {
	
	private int x = 0;
	private int y = 100;
	
	private int xVelocity = 5;
	private int yVelocity = 5;
	
	public void update() {
		x = x + xVelocity;
		y = y + yVelocity;
	}
	
	public void paint(Graphics g) {
		
		g.setColor(Color.BLUE);
		g.fillOval(x, y, 15, 15);
		
	}

}
