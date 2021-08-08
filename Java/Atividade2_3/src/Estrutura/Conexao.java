package Estrutura;
import java.sql.*;
import java.util.*;

public class Conexao{
    
	public Connection getConnection(){
        String url = "jdbc:sqlite:/home/cabeleira/Downloads/Repositorio.db";
        try{
                return DriverManager.getConnection(url);
	}catch (SQLException e){
                throw new RuntimeException(e);
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

