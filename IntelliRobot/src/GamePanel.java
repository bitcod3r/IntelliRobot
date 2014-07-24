import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;


public class GamePanel extends JPanel implements ActionListener {

	Robot walkingRobot = new Robot();
	
	
	public GamePanel(){

		Timer tim = new Timer(50, this);
		tim.start();
	}
	
	public void update() {
		walkingRobot.update();
	}
	
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 400, 400);
		
		//Dibujando los obstaculos
		
		
		
		walkingRobot.paint(g);
	}	
	
	public void actionPerformed(ActionEvent e) {
		update();
		repaint();
	}

	
}
