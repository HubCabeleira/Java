package Arrayandmatriz;
import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] arg) {
		Scanner Imput = new Scanner(System.in);
		System.out.println("|Matriz A|");
		System.out.print("Quantidade de Linhas: ");
		int LinhasA = Imput.nextInt();
		System.out.print("Quantidade de Colunas: ");
		int ColunasA = Imput.nextInt();
		int Linha  = 1;
		int Coluna = 0;
		int [][] MatrizA = new int [LinhasA] [ColunasA];
		for (int Contador = 0; Contador<(LinhasA*ColunasA); Contador++) {
			if(Coluna==ColunasA) {
				Linha ++;
				Coluna = 1 ;
			}
			else {
				Coluna ++ ;
			}
			System.out.print("A [" + Linha +"]" + "[" + Coluna + "]" + "Elemento: ");
			int Elemento = Imput.nextInt();
			MatrizA[(Linha-1)][(Coluna-1)] = Elemento;
		}
		Linha = 1;
		Coluna = 0;
		System.out.println("|Matriz B|");
		System.out.print("Quantidade de Linhas: ");
		int LinhasB = Imput.nextInt();
		System.out.print("Quantidade de Colunas: ");
		int ColunasB = Imput.nextInt();
		int [][] MatrizB = new int [LinhasB] [ColunasB];
		for (int Contador = 0; Contador<(LinhasB*ColunasB); Contador++) {
			if(ColunasB==Coluna){
				Linha ++;
				Coluna = 1;
			}
			else {
				Coluna ++ ;
			}
			System.out.print("B [" + Linha +"]" + "[" + Coluna + "]" + "Elemento: ");
			int Elemento = Imput.nextInt();	
			MatrizB[(Linha-1)][(Coluna-1)] = Elemento;
	}
		
	Linha = 1;
	Coluna = 0;
	int ElementoA = 0;
	int ElementoB = 0;
	int ElementoC = 0;
	int [][] MatrizC = new int [LinhasA] [ColunasA];
	if ((LinhasA==LinhasB)&&(ColunasA==ColunasB)){
		for (int ContadorL = 0; ContadorL<MatrizA.length; ContadorL++) {
			for (int ContadorC = 0; ContadorC<MatrizA[ContadorL].length; ContadorC++) { 
				ElementoA = MatrizA[ContadorL][ContadorC];													
				ElementoB = MatrizB[ContadorL][ContadorC]; 
				ElementoC = ElementoA + ElementoB;
				MatrizC[ContadorL][ContadorC] = ElementoC; 
			} 
		}
		System.out.println("|Matriz Resultante:");
		for(int ContadorL = 0; ContadorL<MatrizC.length; ContadorL++) {
			for (int ContadorC = 0; ContadorC<MatrizC[ContadorL].length; ContadorC++){
				System.out.println( "C [" + ContadorL +"]" + "[" + ContadorC + "] = " + MatrizC[ContadorL][ContadorC]  );
				if (ContadorC == ColunasA)  
					System.out.println("");
				}
		}
	}
	else{
		System.out.print("Operação inválida!");
	}
}
}