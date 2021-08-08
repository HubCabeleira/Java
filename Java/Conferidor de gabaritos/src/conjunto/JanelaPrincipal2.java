package conjunto;
import java.awt.*;
import javax.swing.* ;

public class JanelaPrincipal2 {
	
	private static JFrame janela;
	private JRadioButton btnCadastro;
	private JRadioButton btnEntrada;
	private JLabel titulo1;
	private JButton btnRecarrega;
	private JButton btnEnvia;
	private JPasswordField senha;
	private JMenuBar menuP;
	private static JMenuItem sair;
	private JTextField nome;
	
	public void Janela() {

		janela = new JFrame("Validate of anwsers ");
		janela.setLayout(new FlowLayout());
		janela.setSize(350,300);
		janela.setLocation(450,250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
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
		
		janela.add(menuP);
		
	}
	
	public void entrada() {
		JOptionPane.showMessageDialog(null, "Welcam our program!", "Validate of anwsers ", 
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void menuEventos(JMenuItem sair) {
		
		sair.addActionListener(e ->{
			System.exit(0);
		});
		
	}
	
	public void logEventos() {
		JPasswordField senha2 = new JPasswordField();
		JPasswordField senha1 = new JPasswordField();
		
		btnCadastro.addActionListener(e -> {
			
			JTextField nome = new JTextField();
			nome.setText("Here nickname");
			nome.setBounds(100,100,150,30);
			nome.setVisible(true);
			nome.getSelectedText();
			janela.add(nome);
			
			
			senha1.setText("       ");
			senha1.setBounds(100,150,150,30);
			senha1.setVisible(true);
			senha1.getSelectedText();
			janela.add(senha1);
			
			senha2.setText("       ");
			senha2.setBounds(100,200,150,30);
			senha2.setVisible(true);
			senha2.getSelectedText();
			janela.add(senha2);

	    });
		
		btnEntrada.addActionListener(e -> {
			nome = new JTextField();
			nome.setText("Here nickname");
			nome.setBounds(100,100,150,30);
			nome.setVisible(true);
			janela.add(nome);
			senha = new JPasswordField();
			senha.setText("       ");
			senha.setBounds(100,150,150,30);
			senha.setVisible(true);
			janela.add(senha);

	    });
		
		btnRecarrega.addActionListener(e -> {
			
	      });
		
		btnEnvia.addActionListener(e -> {
			nome.getSelectedText();
			senha1.getSelectedText();
			senha2.getSelectedText();
			if(senha1 == senha2) {
				var aviso = JOptionPane.showConfirmDialog(null, "Password Invalue", 
						"Erro", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
			}else{
				senha = senha1;
				}
			
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
	    
	    btnRecarrega = new JButton("Reload");
	    
	    btnEnvia = new JButton("Send");
	    
	    janela.add(btnEnvia);
	    janela.add(btnRecarrega);
	    janela.add(titulo1);
	    janela.add(btnCadastro);
	    janela.add(btnEntrada);
	}

	public static void main (String[] args){
		 JanelaPrincipal2 Jp = new JanelaPrincipal2();
		 Jp.Janela();
		 Jp.menus();
		 Jp.menuEventos(sair);
		 Jp.logComponentes();
		 Jp.logEventos();
		 Jp.entrada();
	}

}
