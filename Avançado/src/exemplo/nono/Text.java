package exemplo.nono;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Text {
	public static void main (String[] args){
		
		JFrame frame = new JFrame("My Frame");
		frame.setSize(200,175);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Hi user!", JLabel.CENTER);
		label.setBounds(10,65,120,40);
		
		frame.add(label);
		frame.setVisible(true);
	}

}
