package exemplo.nono;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Insert {
	public static void main(String[] args) {
			
			JFrame frame = new JFrame("My Frame");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(500,360);
			frame.setLayout(null);
			
			JTextField textField = new JTextField();
			textField.setBounds(24,156,432,48);
			
			frame.add(textField);
			frame.setVisible(true);
		
	}
}