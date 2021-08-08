package exemplo.nono;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class InsertText {
	public static void main(String Agrs[]) {
		
		JFrame janela = new JFrame("Barra de seleção");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400,300);
		janela.setLayout(null);
		
		
		JTextArea Campo = new JTextArea();
		Campo.setBounds(10,25,360,200);
		
		janela.add(Campo);
		janela.setVisible(true);
	}

}
