package exemplo.nono;

import javax.swing.JFrame;
import javax.swing.JComboBox;

public class RotateSelection {
	public static void main(String Agrs[]) {
		JFrame janela = new JFrame("Barra de seleção");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400,300);
		janela.setLayout(null);
		
		String[] opcoes = {"1ª Alternativa","2ª Alternativa", "3ª Alternativa"};
		
		JComboBox BarraGira = new JComboBox(opcoes);
		BarraGira.setBounds(10,25,360,25);
		
		janela.add(BarraGira);
		janela.setVisible(true);
	}
}
