package Estrutura;
import java.sql.*;
import java.util.*;

public class Comandos {
    
    private Valores valores;
    
    private final String SqlInserir =  "insert into Usuario (" + "Nome , Senha" + ") values (?, ?);";
    private final String SqlRemover =  "delete from Usuario where Nome = ? ";
//  private final String SqlAtividade = "insert into Atividade (" + "Atividade, Materia, Total, Data, Respostas " + ") values (?, ?, ?, ?, ?);";
//  private final String SqlInvalida = "delete from Atividade where Atividade = ?);    

    public Comandos(Valores valores){
        this.valores = valores;
    }
    
    public void inserirUsuario(){
       
        System.out.print(valores.getSenha());
        try {
                Connection conexao = new Conexao().getConnection();
                PreparedStatement stmt = conexao.prepareStatement(SqlInserir);
                stmt.setString(1, valores.getNome());
                stmt.setString(2, valores.getSenha());
                stmt.execute();
                stmt.close();
                conexao.close();
           } catch (SQLException e) {
                e.printStackTrace();
		} 
       }
    
    public void removeUsuario(){
        try {
            Connection conexao = new Conexao().getConnection();
            PreparedStatement stmt = conexao.prepareStatement(SqlRemover);
            stmt.setString(1, valores.getNome());
            stmt.execute();
	    stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
		}  
            
    }
 
//   public void inserirAtividade(){
//       
//        System.out.print(valores.getSenha());
//        try {
//                Connection conexao = new Conexao().getConnection();
//                PreparedStatement stmt = conexao.prepareStatement(SqlAtividade);
//                stmt.setString(1, valores.getMateria());
//                stmt.setString(2, valores.getData());
//                stmt.setString(3, valores.getAtividade());
//                stmt.setString(4, valores.getQuestoes());
//                stmt.setString(5, valores.getRespostas());
//                stmt.execute();
//                stmt.close();
//                conexao.close();
//           } catch (SQLException e) {
//                e.printStackTrace();
//		} 
//       }
    
//    public void atividadeInvalida(){
//        try {
//            Connection conexao = new Conexao().getConnection();
//            PreparedStatement stmt = conexao.prepareStatement(SqlRemover);
//            stmt.setString(1, valores.getAtividade());
//            stmt.execute();
//	    stmt.close();
//            conexao.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//		}              
//   }
    
    
}

