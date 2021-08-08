package telas;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Inicial extends JPanel {

	JLabel janela;
	
	public Inicial(){
		criaComponente();
		criaEventos();
	} 	 
		private void criaComponente() {
			janela = new JLabel("Hi user, inset your login and password!", JLabel.CENTER);
			janela.setBounds(10,10,250,40);
			janela.setLayout(null);
			janela.add(janela);
			janela.setVisible(true);
			
		}
		
	private void criaEventos() {
		
	}

}

