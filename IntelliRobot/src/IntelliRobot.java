import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("unused")
public class IntelliRobot extends JFrame {
 
	public IntelliRobot(){
		
		setSize(400, 500);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new GamePanel());
		setVisible(true);
	}

	public static void main(String[] args) {
	
		new IntelliRobot();
	}
}
