import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextPane;

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
