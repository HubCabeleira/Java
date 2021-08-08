/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author cabeleira
 */
public class ComandosDAO {
        
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
 

    
    public List<> getAtividades() throws SQLException{
        String sql = "select * from Atividade";
        Connection conexao = new Conexao().getConnection();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        List<Valores> Valores = new ArrayList<>(); 
        while(rs.next()){
            Valores v = new Valores();
            v.setTitulo(rs.getString("Atividade"));
	    v.setMateria(rs.getString("Materia"));
            v.setTotal(rs.getInt("Questoes"));
            v.setIn
            System.out.println(v.getTitulo());
            
        }
        }
        stmt.close();
        conexao.close();
        return null;
}

}
