package exemplo.nono;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class Input {
	public static void main (String args[]) {
		
		JFrame janela;
		janela = new JFrame("Insert");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(150,420);
		janela.setLayout(null);
		janela.setVisible(true);
	
		JPasswordField senha;
		senha = new JPasswordField();
		senha.getPassword();
		senha.setBounds(7,178,120,28);
		janela.add(senha);
		
	}
	
	
}
