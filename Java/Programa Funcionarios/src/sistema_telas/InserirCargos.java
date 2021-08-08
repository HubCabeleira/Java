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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import telas.BancoDeDados;
//import telas.entidade.Cargo;

public class InserirCargos extends JPanel {
	
	JLabel labelTitulo, labelCargo;
	JTextField campoCargo;
	JButton botaoGravar;
	
	public InserirCargos(){
		criaComponente();
		criaEventos();
	}
	
	private void criaComponente() {
		
		labelTitulo.setLayout(null);
		labelTitulo = new JLabel("Cadastro de Cargo", JLabel.CENTER);
		labelTitulo.setFont(new Font(labelTitulo.getFont().getName(), Font.PLAIN, 20));
		
		labelCargo = new JLabel("Cadastro de Cargo", JLabel.LEFT);
		
		campoCargo = new JTextField();
		botaoGravar = new JButton("Cadastro de Cargo");

		
		labelTitulo.setBounds(10,10,250,40);
		labelCargo.setBounds(10,10,250,40);
		campoCargo.setBounds(10,10,250,40);
		botaoGravar.setBounds(10,10,250,40);

		
		add(labelTitulo);
		add(labelCargo);
		add(campoCargo);
		add(botaoGravar);
		
		setVisible(true);
	}
	
private void criaEventos() {
	botaoGravar.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionListener e) {
			Cargo novoCargo = new Cargo();
			novoCargo.setNome(campoCargo.getText());
			
			sqlInserirCargo(novoCargo);
		}
		
	});
	
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
	
}
