import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;


public class GamePanel extends JPanel implements ActionListener {

	Robot walkingRobot = new Robot();
	
	public GamePanel(){

		Timer tim = new Timer(1000, this);
		tim.start();
	}
	
	public void update() {
		walkingRobot.update();
	}
	
	public void paintComponent(Graphics g) {
		walkingRobot.paint(g);
	}	
	
	public void actionPerformed(ActionEvent arg0) {
		update();
		repaint();
	}

	
}
