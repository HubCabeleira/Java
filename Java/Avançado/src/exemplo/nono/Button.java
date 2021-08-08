package exemplo.nono;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Button {
	public static void main(String Args[]) {
	
		JFrame frame = new JFrame("My Button");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(150, 480);
		frame.setLayout(null);
		frame.setVisible(true);
		
		JButton clicavel;
		clicavel = new JButton("Opção1");
		clicavel.setBounds(10, 10, 80, 40);

		frame.add(clicavel);
		
	}

}
