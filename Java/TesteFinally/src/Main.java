import java.sql.*;

public class Main {
	
	public static void main (String[] args) {

		String connectionURL = "jdbc:sql:sqlserver://localhost:1433;" + "databaseName=Locadora;" ;
		
		try {
			Class.forName("com.microsoft.sql.jdbcSQLServerDriver").newInstance();
			
			Connection conn = DriverManager.getConnection(connectionURL);
			
			System.out.println("Conex�o obtida com sucesso!");
			
		}catch(SQLException ex){
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState:" + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}catch(Exception e) {
			System.out.println("N�o foi poss�vel cenectar ao banco: " + e);
		}
		
	}
	

}


