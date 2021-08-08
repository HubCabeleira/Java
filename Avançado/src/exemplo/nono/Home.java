package exemplo.nono;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Home {
	public static void main (String args[]) {
		JFrame janela;
		janela = new JFrame("Select");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(500,360);
		janela.setLayout(null);
		
		
		JMenuBar menu = new JMenuBar();
		JMenu opcoes = new JMenu("Home");
		JMenuItem opcao = new JMenuItem("A");
		
		opcoes.add(opcao);
		menu.add(opcoes);
		
		janela.setJMenuBar(menu);
		janela.setVisible(true);
	}
	
}
