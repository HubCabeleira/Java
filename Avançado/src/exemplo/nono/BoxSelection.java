package exemplo.nono;
import javax.swing.JFrame;
import javax.swing.JCheckBox;

public class BoxSelection {
	public static void main(String args[]) {
	JFrame janela = new JFrame("Selection Box");
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.setSize(150, 450);
	janela.setLayout(null);
	
	JCheckBox Selecionavel = new JCheckBox("Verification");
	Selecionavel.setBounds(30,30,100,10);
	
	janela.add(Selecionavel);
	janela.setVisible(true);
	}
}
