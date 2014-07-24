import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.Timer;


public class GamePanel extends JPanel implements ActionListener {

	Robot walkingRobot = new Robot();
	
	// Creo 10 obstaculos 
	int[] xCoords = {40,20,120,100,160,220,260,280,360,340};
	int[] yCoords = {60,340,120,300,240,160,40,340,180,320};
	Obstaculo[] obstaculos = new Obstaculo[10];
	
	Timer tim;
	
	public GamePanel(){

		//Crear Obstaculos
		creaObs();
		
		//Crear Timer para que cada 50 milisegundos anime al robot 
		tim = new Timer(100, this);
				
		//Agregar el boton PLAY
		JButton btnPlay = new JButton("PLAY");
		btnPlay.setBounds(200, 421, 70, 23);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startGame();
			}
		});
		
		//Agregar el boton STOP
		JButton btnStop = new JButton("STOP");
		btnStop.setBounds(280, 421, 70, 23);
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopGame();
			}
		});
		
		JTextPane txtEtiqueta = new JTextPane();
		txtEtiqueta.setEditable(false);
		txtEtiqueta.setText("UNIANDES\r\nInteligencia Artificial\r\nJuan Guillermo Garc\u00EDa");
		txtEtiqueta.setBounds(10, 404, 138, 57);
		
		add(txtEtiqueta);
		add(btnPlay);
		add(btnStop);
		setLayout(null);
	}
	
	public void startGame() {
		tim.start();
	}
	
	public void stopGame() {
		tim.stop();
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
