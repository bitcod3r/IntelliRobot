import java.awt.Color;
import java.awt.Graphics;


public class Obstaculo {
	
	private int xPos;
	private int yPos;
	private int size = 20;
	
	public Obstaculo(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void paint(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(xPos, yPos, size, size);
		//
	}
}
