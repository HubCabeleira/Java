package Forandwhile;

import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] arg) {
	Scanner Keyboard = new Scanner (System.in);
	System.out.print("Algarismo: ");
	int N�mero = Keyboard.nextInt();
	int Resultante = 1;
	for( int Contador = 1; Contador  != N�mero; Contador ++ ) {
		Resultante = Contador * Resultante;
		System.out.println(Resultante);		
	}
}
}
