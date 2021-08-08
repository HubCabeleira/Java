package Forandwhile;

import java.util.Scanner;

public class Exercicio8 {
public static void main(String[] args) {
	Scanner Teclado = new Scanner(System.in);
	System.out.print("Tamanho do conjunto: ");
	String Conjunto  = (" ");
	int Inicial = Teclado.nextInt();
	for(int Contador = 1; Contador <= Inicial; Contador ++ ) {
		int Quadrado = Contador*Contador ;
		Conjunto += Quadrado + " " ;
	}
	System.out.println("Quandrado dos elementos:" + Conjunto );
}
}
