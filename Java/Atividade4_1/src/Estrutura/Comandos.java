package Estrutura;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Comandos{
    
    private Valores valores;
    
    private final String SqlInserirU =  "INSERT INTO Usuarios(Nome, Senha) VALUES (?, ?)";
    private final String SqlRemoverU =  "DELETE FROM Usuarios WHERE Nome =?";
    private final String SqlVerificaU = "SELECT Senha FROM Usuarios WHERE Nome =?";
    private final String SqlVerificaA = "SELECT *FROM Atividades WHERE Atividade =?";
    private final String SqlInserirA = "INSERT INTO Atividades (Atividade, Materia, Data, Respostas, Questoes) VALUES (?, ?, ?, ?, ?)";
    private final String SqlRemoverA = "DELETE FROM Atividades WHERE Atividade =?";    
    private final String SqlAtualizaA = "UPDATE Atividades SET Materia=?, Data=?, Respostas=?, Questoes=? WHERE Atividade=?";
    private final String SqlListaA = "SELECT * FROM Atividades";
    
    public Comandos(Valores valores){
        this.valores = valores;
    }
    
    public void inserirUsuario() throws ClassNotFoundException{
       
        try {
                Connection conexao = new Conexao().getConnection();
                PreparedStatement stmt = conexao.prepareStatement(SqlInserirU);
                stmt.setString(1, valores.getNome());
                stmt.setString(2, valores.getSenha());
                stmt.execute();
                stmt.close();
                conexao.close();
           } catch (SQLException e) {
                System.out.println("Exception SQL in insert.");
		} 
       }
    
    public void removeUsuario() throws ClassNotFoundException{
        try {
            Connection conexao = new Conexao().getConnection();
            PreparedStatement stmt = conexao.prepareStatement(SqlRemoverU);
            stmt.setString(1, valores.getNome());
            stmt.execute();
	    stmt.close();
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Exception SQL in remove.");
		}  
    }
    
   
   public void inserirAtividade() throws ClassNotFoundException{
        try {
                Connection conexao = new Conexao().getConnection();
                PreparedStatement stmt = conexao.prepareStatement(SqlInserirA);
                stmt.setString(1, valores.getAtividade());
                stmt.setString(2, valores.getMateria());
                stmt.setString(3, valores.getData());
                stmt.setString(4, valores.getRespostas());
                stmt.setString(5, valores.getQuestoes());
                stmt.execute();
                stmt.close();
                conexao.close();
           } catch (SQLException e) {
                System.out.println("Exception SQL in insert.");
		} 
       }
    
    public void removeAtividade() throws ClassNotFoundException{
        try {
            Connection conexao = new Conexao().getConnection();
            PreparedStatement stmt = conexao.prepareStatement(SqlRemoverA);
            stmt.setString(1, valores.getAtividade());
            stmt.execute();
	    stmt.close();
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Exception SQL in remove.");
		}              
   }
    
    public void verificaUsuario(String Cadastrado) throws ClassNotFoundException{
        try{
            Connection conexao = new Conexao().getConnection();
            PreparedStatement stmt = conexao.prepareStatement(SqlVerificaU);
            stmt.setString(1, Cadastrado);
            ResultSet rs = null;
            rs = stmt.executeQuery();
            valores.setSenha(rs.getString("Senha"));
            Conexao.fechaConexao(conexao, stmt, rs);
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Error search user " + e.getMessage());
            }
        
    }
    
    public void verificaAtividade(String Cadastrada) throws ClassNotFoundException{
        try{
            Connection conexao = new Conexao().getConnection();
            PreparedStatement stmt = conexao.prepareStatement(SqlVerificaA);
            stmt.setString(1, Cadastrada);
            ResultSet rs = null;
            rs = stmt.executeQuery();
            valores.setAtividade(rs.getString("Atividade"));
            Conexao.fechaConexao(conexao, stmt, rs);
	} catch (Exception e) {
            System.out.println("Exception when verifily activity.");
	  }

    }    
        
    public List<Valores> getValor() throws SQLException, ClassNotFoundException {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		ArrayList<Valores> valores = new ArrayList<Valores>();
		try {
			conn = new Conexao().getConnection();
			pstm = conn.prepareStatement(SqlListaA);
			rs = pstm.executeQuery();
			while (rs.next()) {
				Valores valor = new Valores();
                                valor.setAtividade(rs.getString("Atividade"));
				valor.setMateria(rs.getString("Materia"));
                                valor.setData(rs.getString("Data"));
				valor.setRespostas(rs.getString("Respostas"));
                                valor.setQuestoes(rs.getString("Questoes"));
				valores.add(valor);
			}
			Conexao.fechaConexao(conn, pstm, rs);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error in list Activity" + e.getMessage());
		}
		return valores;
	}

    public void AlteraAtividade(){
		if (valores != null) {
			Connection conn = null;
			try{ 
                                conn = new Conexao().getConnection();
				PreparedStatement stms = conn.prepareStatement(SqlAtualizaA);
                                stms.setString(1, valores.getMateria());
                                stms.setString(2, valores.getData());                                
                                stms.setString(3, valores.getRespostas());
                                stms.setString(4, valores.getQuestoes());
				stms.setString(5, valores.getAtividade());                                                                                                
                                stms.execute();
				JOptionPane.showMessageDialog(null, "Alter with sussefull!");
				Conexao.fechaConexao(conn);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error update ativity in data "
						+ "base " + e.getMessage());
			}
		} else {
			JOptionPane.showMessageDialog(null, "O contate send for parameter is null!");
		}
	}
        
}
