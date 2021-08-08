import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

public class DataBase {
	public static void main(String[] args) {
		String servidor = "jdbc:sqlserver://localhost:1433;databaseName=[Departamento RH]";
		String usuario = "";
		String senha = "";
		
	Connection conecte;
	Statement instrução;
	ResultSet resultados;

	try {
		conecte = DriverManager.getConnection(servidor,usuario,senha);
		instrução = conecte.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		resultados = instrução.executeQuery("SELECT * FROM Funcionarios");
		while(resultados.next()) {
			int registro = resultados.getInt("Resgistro");
			String nome = resultados.getString("Nome");
			String sexo = resultados.getString("Sexo") ;
			String setor = resultados.getString("Setor") ;
			System.out.println("Nome" + nome);
			System.out.println("Sexo" + sexo);
			System.out.println("Setor" + setor);	
			}
		}
	catch(SQLException Erro){
		System.out.println(Erro.getMessage());
		
		}
	}
}	
