import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

public class Main {
	public static void main(String[] args) throws SQLException {
		String servidor = "jdbc:sqlserver:CABELEIRA-PC\\CABELEIRA-PC\\SQLEXPRESS;databaseName=Concessionaria" ;
		String usuario = "Administrador" ;
		String senha = "0321";
	
		Connection conexao;
		Statement instrucaoSQL;
		ResultSet resultados;
		
		try {
			conexao = DriverManager.getConnection(servidor,usuario, senha);
			instrucaoSQL = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			resultados = instrucaoSQL.executeQuery("SELECT * FROM Carros");
		}finally {}
		
	}

}
