import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Robot {
	
	private int x = 0;
	private int y = 0;
	
	private int xVelocity = 10;
	private int yVelocity = 10;
	
	//Size of the robot
	private int size = 20;
	
	public void update() {
		x = x + xVelocity;
		y = y + yVelocity;
		
		// Movimiento de vuelta en eje x
		if (x < 0){
			xVelocity = 20;
		} else if (x + size > 400) {
			xVelocity = -10;
		}
		
		// Movimiento de vuelta en eje y
		if (y < 0){
			yVelocity = 10;
		} else if (y + size > 360) {
			yVelocity = -20;
		}		
		
		for (int i = 0; i < array.length; i++) {
			
		}
	}
	
	/**
	 * Trae la imagen desde el top de la aplicacion,  
	 * si que no la encuentra dibuja un circulo verde.
	 * @param g
	 */
	public void paint(Graphics g) {
		
		Image imagen;
		try {
			imagen = ImageIO.read(     new File("robot.jpg")      );
			g.drawImage(imagen, x, y, null);
		} catch (IOException e) {
			//e.printStackTrace();
			g.setColor(Color.GREEN);
			g.fillOval(x, y, size, size);
		}
        
        
	}



}
