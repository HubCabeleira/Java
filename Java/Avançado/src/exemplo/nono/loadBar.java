package exemplo.nono;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class loadBar {
	public static void main(String Args[]){
		
		JFrame janela = new JFrame("Barra de seleção");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400,300);
		janela.setLayout(null);
		
		JProgressBar Campo = new JProgressBar(JProgressBar.HORIZONTAL, 1, 100);
		Campo.setValue(50);
		Campo.setBounds(20,130,360,15);
		
		janela.add(Campo);
		janela.setVisible(true);
	}

}
