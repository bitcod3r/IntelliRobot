import java.awt.Color;
import java.awt.Graphics;


public class Robot {
	
	private int x = 0;
	private int y = 0;
	
	private int xVelocity = 10;
	private int yVelocity = 10;
	
	public void update() {
		x = x + xVelocity;
		y = y + yVelocity;
		
		// Movimiento de vuelta en eje x
		if (x < 0){
			xVelocity = 10;
		} else if (x > 400) {
			xVelocity = -10;
		}
		
		// Movimiento de vuelta en eje y
		if (y < 0){
			yVelocity = 10;
		} else if (y > 400) {
			yVelocity = -10;
		}
		
	}
	
	public void paint(Graphics g) {
		
		g.setColor(Color.GREEN);
		g.fillOval(x, y, 10, 10);
		//
	}

}
