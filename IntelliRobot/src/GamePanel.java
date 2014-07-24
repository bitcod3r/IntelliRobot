import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;


public class GamePanel extends JPanel implements ActionListener {

	Robot walkingRobot = new Robot();
	
	// Creo 10 obstaculos 
	int[] xCoords = {40,20,120,100,160,220,260,280,360,340};
	int[] yCoords = {60,340,120,300,240,160,40,340,180,320};
	Obstaculo[] obstaculos = new Obstaculo[10];
	
	/*
	List<Integer> myCoords = new ArrayList<Integer>();
	myCoords.add(10);
	myCoords.add(20);
	myCoords.add(30);
	myCoords.add(40);
	myCoords.add(50);
	
	Iterator<Integer> myListIterator = myCoords.iterator(); 
	while (myListIterator.hasNext()) {
	    Integer coord = myListIterator.next();     
	    System.out.print("\r");
	    System.out.print(coord);
	    Thread.sleep(2000);
	}
	*/
	public GamePanel(){

		//Crear Obstaculos
		creaObs();
		
		//Crear Timer para que cada 50 milisegundos anime al robot 
		Timer tim = new Timer(50, this);
		tim.start();
	}
	
	public void creaObs() {
		
		for (int i = 0; i < 10; i++) {
			this.obstaculos[i] = new Obstaculo(xCoords[i], yCoords[i]);
		}
	}

	public void update() {
		walkingRobot.update();
	}
	
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 400, 400);
		
		//Dibujando los obstaculos
		for (int i = 0; i < 10; i++) {
			obstaculos[i].paint(g);
		}
		
		
		walkingRobot.paint(g);
	}	
	
	public void actionPerformed(ActionEvent e) {
		update();
		repaint();
	}

	
}
