package exemplo.nono;

import javax.swing.JFrame;
import javax.swing.JList;

public class List {
	public static void main(String[] args) {
		
		JFrame janela = new JFrame();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(150,450);
		janela.setLayout(null);
		
		String[] lista = {"1� Op��o","2� Op��o", "3� Op��o","4� Op��o", "5� Op��o" };
		
		JList lInterface = new JList(lista);
		lInterface.setBounds(20,20,100,100);
		
		
		janela.add(lInterface);
		janela.setVisible(true);
		
	}

}
