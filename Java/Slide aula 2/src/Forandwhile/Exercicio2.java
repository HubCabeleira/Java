package Forandwhile;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] arg) {
	Scanner Keyboard = new Scanner(System.in);
	System.out.print("N�mero: ");
	int N�mero = Keyboard.nextInt();
	int Contador = 1;
	boolean V�lido = true;
	while( Contador<=N�mero) {
		Contador ++;
		if(N�mero % Contador == 0 && Contador != N�mero) {
			V�lido = false;
			System.out.println("N�o � primo.");
			break;
		}
		
	}
	if (V�lido == true) { 
		System.out.println("� primo.");}
	}

}
