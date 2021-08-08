package exercicio;
import javax.swing.* ;
import java.awt.*;

public class ArgentumUI {
	private JFrame janela;

	
	public static void main(String[] arg) {
		ArgentumUI teste = new ArgentumUI();
		teste.montaTela();
	}
	
	private void montaTela() {
		preparaJanela();
		preparaPainelPrincipal();
//		preparaBotaoCarregar(); 
//		preparaBotaoSair(); 
		mostrarJanela();
		selecao();
	}

	
	private void preparaPainelPrincipal() {
		JPanel painelPrincipal = new JPanel();
		janela.add(painelPrincipal);
	}
	
	private void mostrarJanela() {
		janela.pack();
		
		janela.setSize(540, 640);
		janela.setLocation(400, 400);
		janela.setVisible(true);
	}
	
	private void preparaJanela() {
		janela = new JFrame("Argentum");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	private void selecao() {
	JRadioButton permissaoUm = new JRadioButton();
	permissaoUm.setText("Acess file personal");
	janela.add(permissaoUm);
	JRadioButton permissaoDois = new JRadioButton();
	permissaoDois.setText("Acess config system");
	janela.add(permissaoDois);
	JRadioButton permissaoTres = new JRadioButton();
	permissaoTres.setText("Acess remote");
	janela.add(permissaoTres);
	}

//	  private void preparaBotaoCarregar() { JButton botaoCarregar = new
//	  JButton("Carregar XML"); botaoCarregar.addActionListener(new ActionListener()
//	  {
//	  
//	  @Override public void actionPerformed(ActionEvent e) { new
//	  EscolhedorDeXML().escolhe(); } }); painelPrincipal.add(botaoCarregar); }
//	  
//	  private void preparaBotaoSair() { JButton botaoSair = new JButton("Sair");
//	  botaoSair.addActionListener(new ActionListener() {
//	  
//	  @Override public void actionPerformed(ActionEvent e) { System.exit(0); } });
//	  painelPrincipal.add(botaoSair); }
//	 
//	JTable table = new JTable();
//	table.setBorder(new LineBorder(Color.black));
//	table.setGridColor(Color.black);
//	table.setShowGrid(true);
//	
//	JScrollPane scroll = new JScrollPane();
//	scroll.getViewport().setBorder(null);
//	scroll.getViewport().add(table);
//	scroll.setSize(450, 450);

}
