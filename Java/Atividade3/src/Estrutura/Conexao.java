package Estrutura;
import java.sql.*;
import java.util.*;


public class Conexao{
    
	public Connection getConnection() throws SQLException, ClassNotFoundException{
        String url = "jdbc:sqlite:/home/cabeleira/Downloads/Repositorio.db";
        Connection conn = null;
        try{
                conn = DriverManager.getConnection(url);
                return conn;
	}catch (SQLException e){
                throw new SQLException("Erro ao conectar " + "com a base de dados" + e.getMessage());
            }
        }

	public static void fechaConexao(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
				System.out.println("Fechada a conexão com o banco de dados");
			}
		} catch (Exception e) {
			System.out.println("Não foi possível fechar a conexão com o banco de dados " + e.getMessage());
		}
	}

	public static void fechaConexao(Connection conn, PreparedStatement stmt) {
		try {
			if (conn != null) {
				fechaConexao(conn);
			}
			if (stmt != null) {
				stmt.close();
				System.out.println("Statement fechado com sucesso");
			}
		} catch (Exception e) {
			System.out.println("Não foi possível fechar o statement " + e.getMessage());
		}
	}

	public static void fechaConexao(Connection conn, PreparedStatement stmt, ResultSet rs) {
		try {
			if (conn != null || stmt != null) {
				fechaConexao(conn, stmt);
			}
			if (rs != null) {
				rs.close();
				System.out.println("ResultSet fechado com sucesso");
			}
		} catch (Exception e) {
			System.out.println("Não foi possível fechar o ResultSet " + e.getMessage());
		}
	}
}


//CREATE DATABASE Repositorio;
//
//CREATE TABLE "Usuarios" (
//	"Nome"	TEXT NOT NULL,
//	"Senha"	TEXT NOT NULL,
//	PRIMARY KEY("Nome")
//);
//
//CREATE TABLE "Atividades" (
//	"Atividade"	TEXT NOT NULL,
//	"Materia"	TEXT,
//	"Data"	TEXT,
//	"Respostas"	TEXT,
//	"Questoes"	INTEGER,
//	PRIMARY KEY("Atividade")
//);

