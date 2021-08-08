package Estrutura;
import java.sql.*;
import java.util.*;

public class Conexao{	        
	public Connection getConnection(){	
        String url = "jdbc:postgresql://localhost/Atividade2_2";
        Properties propriedades = new Properties();
        propriedades.setProperty("user", "postgres");
	propriedades.setProperty("password", "postgres");
        try{
                return DriverManager.getConnection(url, propriedades);
	}catch (SQLException e){
                throw new RuntimeException(e);
			}	

            }
}

//CREATE DATABASE Repositorio;
//
//CREATE TABLE Usuario (
//	Id integer Serial Primary Key,
//	Nome varchar(20) not null,	
//	Senha varchar(15) not null
//	);
//
//CREATE TABLE Registros (
//	Atividade varchar(30) Primary Key not null,
//      Materia varchar(20),
//      Total int(20),
//	Data date   ,
//      Respostas text()
//          );

