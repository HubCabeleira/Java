package exemplo.nono;

import javax.swing.JFrame;
import javax.swing.JList;

public class List {
	public static void main(String[] args) {
		
		JFrame janela = new JFrame();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(150,450);
		janela.setLayout(null);
		
		String[] lista = {"1ª Opção","2ª Opção", "3ª Opção","4ª Opção", "5ª Opção" };
		
		JList lInterface = new JList(lista);
		lInterface.setBounds(20,20,100,100);
		
		
		janela.add(lInterface);
		janela.setVisible(true);
		
	}

}
