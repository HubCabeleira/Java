package exemplo.nono;

import javax.swing.JFrame;
import javax.swing.JScrollBar;

public class BarNumber {
public static void main(String Agrs[]) {
		
		JFrame janela = new JFrame("Barra de seleção");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(250,300);
		janela.setLayout(null);
		
		JScrollBar Campo = new JScrollBar(JScrollBar.VERTICAL ,50,1,0,100);
		Campo.setBounds(10,25,30,200);
		
		janela.add(Campo);
		janela.setVisible(true);
	}
}
