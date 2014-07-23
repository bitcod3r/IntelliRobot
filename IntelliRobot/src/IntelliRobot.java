import javax.swing.JFrame;
import javax.swing.JPanel;

public class IntelliRobot extends JFrame {
	
	public IntelliRobot(){
		
		setSize(400, 550);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(new GamePanel());
	}

	public static void main(String[] args) {
	
		new IntelliRobot();
	}
}
