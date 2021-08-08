package conjunto;
import java.awt.*;
import javax.swing.* ;

public class JanelaPrincipal {
	private static JFrame janela;
	private JRadioButton btnCadastro;
	private JRadioButton btnEntrada;
	private JLabel titulo1;
	
	public void Janela() {
		janela = new JFrame("Validate of anwsers ");
		janela.setLayout(new FlowLayout());
		janela.setSize(400,300);
		janela.setLocation(450,250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public void entrada() {
		JOptionPane.showMessageDialog(null, "Welcam our program!", "Validate of anwsers ", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void text() {
		JTextArea area = new JTextArea();
		area.setText("Coloque seu texto aqui");
		area.setVisible(true);
		area.setBounds(100,100,150,30);
		janela.add(area);
	}
	
	
	public void logEventos() {
		btnCadastro.addActionListener(e -> {
			JTextField nome = new JTextField();
			nome.setText("Here nickname");
			nome.setBounds(100,50,150,30);
			nome.setVisible(true);
			janela.add(nome);
			JPasswordField senha1 = new JPasswordField();
			senha1.setText("       ");
			senha1.setBounds(100,100,150,30);
			senha1.setVisible(true);
			janela.add(senha1);
	    });
		
		btnEntrada.addActionListener(e -> {
			JTextField nome = new JTextField();
			nome.setText("Here nickname");
			nome.setBounds(100,50,150,30);
			nome.setVisible(true);
			janela.add(nome);
			JPasswordField senha = new JPasswordField();
			senha.setText("       ");
			senha.setBounds(100,100,150,30);
			senha.setVisible(true);
			janela.add(senha);
	    });
	  }

	public void logComponentes() {
		titulo1 = new JLabel("Select Option");
		
	    btnCadastro = new JRadioButton();
	    btnCadastro.setText("Sig In");
	    btnCadastro.setSize(100, 150);
	    btnCadastro.setVisible(true);
	    btnEntrada = new JRadioButton();
	    btnEntrada.setText("Log In ");
	    btnEntrada.setSize(50,100);
	    btnEntrada.setVisible(true);
	    janela.add(titulo1);
	    janela.add(btnCadastro);
	    janela.add(btnEntrada);
	}

	
	public static void main (String[] args){
		 JanelaPrincipal Jp = new JanelaPrincipal();
		 Jp.Janela();
		 Jp.logComponentes();
		 Jp.logEventos();
		 Jp.entrada();
	}
}
