package exemplo.nono;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class ButtonRadio {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(150,450);
		janela.setLayout(null);
		
		JRadioButton giratorio = new JRadioButton("Opção A");
		giratorio.setBounds(30,30,100,100);
		
		janela.add(giratorio);
		janela.setVisible(true);
		
	}

}
