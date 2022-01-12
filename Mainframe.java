import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JLabel;

public class Mainframe extends JFrame {

	public void init() {
		setTitle("Hello world");
		setSize(450, 300);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		JLabel lable = new JLabel("Welcome Coding Ninjas");
	}

}