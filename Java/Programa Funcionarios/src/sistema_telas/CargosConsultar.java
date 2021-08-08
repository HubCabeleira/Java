package sistema_telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import sistema.Navegador;
import sistema.telas.CargosInserir;
import telas.BancoDeDados;
import telas.entidade.Cargo;

public class CargosConsultar extends JPanel {
	
	Cargo cargoAtual;
	JLabel labelTitulo, labelCargo;
	JTextField campoCargo;
	JButton botaoPesquisar, botaoEditar, botaoExcluir;
	DefaultListModel<Cargo> ListaCargosModelo = new DefaultListModel();
	JList<Cargo> listaCargos;
	
	public CargosConsultar(){
		criaComponente();
		criaEventos();
	}
	
	private void criaComponente() {
		setLayout(null);
	
		labelTitulo = new JLabel("Consulta de Cargos", JLabel.CENTER);
		labelTitulo.setFont(new Font(labelTitulo.getFont().getName(), Font.PLAIN, 20));
		labelCargo = new JLabel("Cadastro de Cargo", JLabel.LEFT);
		campoCargo = new JTextField();
		botaoPesquisar = new JButton("Pesquisar de Cargo");
		botaoEditar = new JButton("Editar de Cargo");
		botaoEditar.setEnabled(false);
		botaoExcluir = new JButton("Excluir de Cargo");
		botaoExcluir.setEnabled(false);
		listasCargosModelo = new DefaultListModel();
		listaCargos = new JList();
		listaCargos.setModel(listasCargosModelo);
		listaCargos.setSelectionMode(java.swing.ListSelectionModel.SINGLE_SELECTION);
		
		
		labelTitulo.setBounds(20,20,660,40);
		labelCargo.setBounds(150,120,400,20);
		campoCargo.setBounds(150,140,400,40);
		botaoPesquisar.setBounds(560,140,130,40);
		botaoEditar.setBounds(150,360,130,40);
		botaoExcluir.setBounds(560,400,130,40);
		
		add(labelTitulo);
		add(labelCargo);
		add(campoCargo);
		add(listaCargos);
		add(botaoEditar);
		add(botaoPesquisar);
		add(botaoEditar);
		add(botaoExcluir);
		
		setVisible(true);
	}
	
	private void criaEventos() {
		botaoPesquisar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionListener e) {
					sqlPesquisarCargo(campoCargo.getText());
			}
		});
		botaoEditar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e ) {	
				}
		});
		botaoExcluir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e ) {
				sqlDeletarCargo();		
			}
		});
		listaCargos.addActionListener(new actionSelectionListener() {
			@Override
			public void actionPerformed(actionEvent e) {
				sqlDeletarCargo();
			}
		});
		listaCargos.addListeSelectionListener(new actionSelectionListener() {
			cargoAtual = listaCargo.getSelectedValue();
			if(cargoAtual == null) {
				botaoExcluir.setEnabled(false);
				botaoEditar.setEnabled(false);
			}else{
				botaoExcluir.setEnabled(false);
				botaoEditar.setEnabled(false);
			}
		});
	}	
	private void sqlInserirCargo(Cargo novoCargo(){
			if(campoCargo.getText().length() <= 3) {
				JOptionPane.showMessageDialog(null, "Preencher corretamente.");
				return;
	}
	
	Connection conexão;
	
	Statement instrucaoSQL;
	
	ResultSet resultados;
	
	try {
		conexão = DriverManager.getConnection(BancoDeDados.conexao, BancoDeDados.usuario, BancoDeDados.senha);
		instrucaoSQL.executeUpdate("Insert into Cargo (nome) VALUES ('" + novoCargo.getNome()+ "')");
			JOptionPane.showMessageDialog(null, "Cargos adicionado com sucesso!");
	}catch(SQLException ex) {
		JOptionPane.showMessageDialog(null,"Ocorreu Um erro ao adicionar o cargo.");
		Logger.getLogger(InserirCargos.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
private void sqlDeletarCargo() {
        
        int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o Cargo "+cargoAtual.getNome()+"?", "Excluir", JOptionPane.YES_NO_OPTION);
        if(confirmacao == JOptionPane.YES_OPTION){

            // conexÃ£o
            Connection conexao;
            // instrucao SQL
            Statement instrucaoSQL;
            // resultados
            ResultSet resultados;

            try {
                // conectando ao banco de dados
                conexao = DriverManager.getConnection(BancoDeDados.stringDeConexao, BancoDeDados.usuario, BancoDeDados.senha);           

                // criando a instruÃ§Ã£o SQL
                instrucaoSQL = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                instrucaoSQL.executeUpdate("DELETE cargos WHERE id="+cargoAtual.getId()+"");            

                JOptionPane.showMessageDialog(null, "Cargo deletado com sucesso!");
                Navegador.inicio();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o Cargo.");
                Logger.getLogger(CargosInserir.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
}
