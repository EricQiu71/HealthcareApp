import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frontRegister{
	
	JLabel lname, lage, laddress, lgender, lethnictiy, lemail, lpassword, lillness, loccupation, linsurance, lavailability, lquestions, lanswers;
	
	public frontRegister() {
		JFrame registerFrame = new JFrame();
		registerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		registerFrame.setTitle("Registration Form");
		registerFrame.setSize(600,800);
		registerFrame.setLocationRelativeTo(null);
		
		String[] ethnicity = {"Caucasian/White", "African-American/Black", "Hispanic",
				"Asian or Pacific Islander", "Middle Eastern"
		};
		
		lname = new JLabel("Name: ");
		
		
		registerFrame.setVisible(true);
	}

}
