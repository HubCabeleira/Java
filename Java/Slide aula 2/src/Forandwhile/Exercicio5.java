package Forandwhile;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] arg) {
		Scanner Keyboard = new Scanner (System.in);
		System.out.print("Conjunto A: ");
		int N�merosA = Keyboard.nextInt();
		System.out.print("Conjunto B: ");
		int N�merosB = Keyboard.nextInt();
		String Conjunto = ("");
		for (int ContadorA = 1 ; ContadorA <= N�merosA; ContadorA++) {
				for (int ContadorB = 1 ; ContadorB <= N�merosB; ContadorB++){
					Conjunto +="( " + ContadorA + " X ";
					Conjunto += ContadorB + " ), ";
				}
		}
		System.out.print("Produto Carteseano: C = { " + Conjunto + " } ");
		}

}
