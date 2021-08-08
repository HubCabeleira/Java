package sistema_telas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import telas.Inicial;

public class Sistema {
	
	public static JFrame frame;
	public static JPanel tela;	
	
	public static void main(String[] args){
		criandoComponente();
	} 
	
	private static void criandoComponente(){
		frame = new JFrame("My Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,360);
		frame.setLayout(null);
		
		tela = new Inicial();
		tela.setVisible(true);
		frame.add(tela);
		
		frame.setVisible(true);
	}

}