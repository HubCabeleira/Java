package telas;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login{

	public static void main(String[] args) {
		
//		private void criarComponente() {
		JFrame frame = new JFrame("My Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		JMenuBar menu = new JMenuBar();
		JMenu opcoes = new JMenu("Home");
		JMenuItem opcao_0 = new JMenuItem("A");
		JMenuItem opcao_1 = new JMenuItem("B");
		
		JMenu opcoes_2 = new JMenu("Beetwend");
		JMenuItem opcao_00 = new JMenuItem("A");
		JMenuItem opcao_11 = new JMenuItem("B");

		opcoes.add(opcao_0);
		opcoes.add(opcao_1);

		menu.add(opcoes);
		
		opcoes_2.add(opcao_00);
		opcoes_2.add(opcao_11);
		menu.add(opcoes_2);
		
		frame.setJMenuBar(menu);
		frame.setVisible(true);
		
		JLabel label = new JLabel("Hi user, inset your login and password!", JLabel.CENTER);
		label.setBounds(20,60,250,40);
		frame.add(label);
		frame.setVisible(true);
		
		JButton clicavel;
		clicavel = new JButton("Opção1");
		clicavel.setBounds(68,200,130,28);

		frame.add(clicavel);
		
		JTextField textField = new JTextField();
		textField.setBounds(68,126,130,28);
		
		frame.add(textField);
		frame.setVisible(true);

		
		JPasswordField senha;
		senha = new JPasswordField();
		senha.getPassword();
		senha.setBounds(68,158,130,28);
		frame.add(senha);
		

/*  	}	 */		
	}

}
