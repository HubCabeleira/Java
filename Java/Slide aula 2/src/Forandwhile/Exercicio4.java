package Forandwhile;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] arg) {
		Scanner Keyboard = new Scanner (System.in);
		System.out.print("Algarismo: ");
		float N�mero = Keyboard.nextInt();
		float Contador = 1;
		float Resultante = 0;
		do { 
			Contador ++ ;
			Resultante += Contador; 
		}while( Contador!=N�mero);
		float Total = (Resultante/N�mero);
		System.out.println(Total);
	}
	}