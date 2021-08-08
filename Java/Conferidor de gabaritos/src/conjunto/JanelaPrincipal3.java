package conjunto;

import java.awt.*;
import javax.swing.*;

public class JanelaPrincipal3 {

	private static JFrame janela;
	private JPanel centralP; 
	private JRadioButton btnCadastro;
	private JRadioButton btnEntrada;
	private JButton btnRecarrega;
	private JButton btnEnvia;
	private JPasswordField senha;
	private JTextField nome;	 
	private JMenuBar menuP;
	private static JMenuItem sair;


	public void Janela() {

		janela = new JFrame("Validate of anwsers ");
		janela.setLayout(new BorderLayout());
		janela.setSize(350, 300);
		janela.setLocation(450, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
		centralP = new JPanel();
		centralP.setLayout(null);
		centralP.setVisible(true);
		janela.add("Center", centralP);

	}

	public void menus() {

		menuP = new JMenuBar();

		JMenu menuConta = new JMenu("Acount");
		sair = new JMenuItem();
		sair.setText("Exit");
		menuConta.add(sair);

		JMenu menuRegistros = new JMenu("Register");
		JMenuItem visualizar = new JMenuItem("Visible");
		menuRegistros.add(visualizar);
		JMenuItem apagar = new JMenuItem("Delete");
		menuRegistros.add(apagar);

		menuP.add(menuRegistros);
		menuP.add(menuConta);

		janela.add("North", menuP);

	}

	
	 public void entrada() { JOptionPane.showMessageDialog(null,
	 "Welcam our program!", "Validate of anwsers ",
	 JOptionPane.INFORMATION_MESSAGE); 
	 }
	
	 public void menuEventos(JMenuItem sair) {
		sair.addActionListener(e -> {
			System.exit(0);
		});

	}

	 public void logEventos() { 
	
		JPasswordField senha2 = new JPasswordField();
		JPasswordField senha1 = new JPasswordField();
	 
		btnCadastro.addActionListener(e -> {
	  
		JTextField nome = new JTextField(); nome.setText("Here nickname");
		nome.setBounds(100,50,150,30); 
		nome.setVisible(true);
		nome.getSelectedText(); 
		centralP.add(nome);
	 	 
		senha1.setText("       "); 
		senha1.setBounds(100,100,150,30);
		senha1.setVisible(true); 
		senha1.getSelectedText(); 
		centralP.add(senha1);
	 
	 	senha2.setText("       "); 
	 	senha2.setBounds(100,150,150,30);
	 	senha2.setVisible(true); 
	 	senha2.getSelectedText(); 
	 	centralP.add(senha2);
	 	
		JLabel texto2 = new JLabel();
		texto2.setText("Name");
		texto2.setBounds(20, 50, 100, 20);;
		texto2.setVisible(true);
		centralP.add(texto2);
		
		JLabel texto3 = new JLabel();
		texto3.setText("Password");
		texto3.setBounds(20, 100, 100, 20);;
		texto3.setVisible(true);
		centralP.add(texto3);
		
		
	 
	 });
	  
	  btnEntrada.addActionListener(e -> { 
		  nome = new JTextField();
		  nome.setText("Here nickname"); 
		  nome.setBounds(100,50,150,30);
		  nome.setVisible(true); 
		  centralP.add(nome); 
		  senha = new JPasswordField();
		  senha.setText("       "); 
		  senha.setBounds(100,100,150,30);
		  senha.setVisible(true); 
		  centralP.add(senha);
	  
	  });
	 
	  btnRecarrega.addActionListener(e -> {
	  
	  });
	  
	  btnEnvia.addActionListener(e -> { 
		  nome.getSelectedText();
		  senha1.getSelectedText(); 
		  senha2.getSelectedText(); 
		  if(senha1 != senha2) {
			  var aviso = JOptionPane.showConfirmDialog(null, "Password Invalue", "Erro",
					  JOptionPane.CANCEL_OPTION ,JOptionPane.ERROR_MESSAGE); 
		  }else{ 
			senha = senha1;
	  }
	  
	  });
	
	 }
	 
	public void logComponentes() {
		
		JLabel texto1 = new JLabel();
		texto1.setText("Select Option");
		texto1.setBounds(20, 10, 100, 20);;
		texto1.setVisible(true);
		centralP.add(texto1);
		
		JLabel texto2 = new JLabel();
		texto2.setText("Name");
		texto2.setBounds(20, 50, 100, 20);;
		texto2.setVisible(true);
		centralP.add(texto2);
		
		JLabel texto3 = new JLabel();
		texto3.setText("Password");
		texto3.setBounds(20, 100, 100, 20);;
		texto3.setVisible(true);
		centralP.add(texto3);
	

		btnCadastro = new JRadioButton();
		btnCadastro.setText("Sig In");
		btnCadastro.setBounds(130, 10, 70, 20);		
		btnCadastro.setVisible(true);
		centralP.add(btnCadastro);
		
		btnEntrada = new JRadioButton();
		btnEntrada.setText("Log In ");
		btnEntrada.setBounds(200, 10, 80, 20);
		btnEntrada.setVisible(true);
		centralP.add(btnEntrada);
		
		btnRecarrega = new JButton("Reload");
		btnRecarrega.setBounds(140, 190, 90, 25);
		centralP.add(btnRecarrega);	
		
		btnEnvia = new JButton("Send");
		btnEnvia.setBounds( 240, 190, 90, 25);
		centralP.add(btnEnvia);
		
		
	}

	public static void main(String[] args) {
		JanelaPrincipal3 Jp = new JanelaPrincipal3();
		Jp.Janela();
		Jp.menus();
		Jp.menuEventos(sair);
		Jp.logComponentes();
		Jp.logEventos();
		Jp.entrada();
		
	}

}
