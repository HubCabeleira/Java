package Forandwhile;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] arg) {
	Scanner Keyboard = new Scanner(System.in);
	System.out.print("Número: ");
	int Número = Keyboard.nextInt();
	int Contador = 1;
	boolean Válido = true;
	while( Contador<=Número) {
		Contador ++;
		if(Número % Contador == 0 && Contador != Número) {
			Válido = false;
			System.out.println("Não é primo.");
			break;
		}
		
	}
	if (Válido == true) { 
		System.out.println("É primo.");}
	}

}
