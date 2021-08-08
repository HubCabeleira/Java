package Forandwhile;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		System.out.print("Inicial: ");
		Scanner Keyboard = new Scanner(System.in);
		int Número = Keyboard.nextInt();
		for(int Contador = 1 ; Contador <= Número ; Contador ++ ) {
			System.out.print(Contador + " ");
		}System.out.println("");
		System.out.print("Inicial: ");
		Número = Keyboard.nextInt();
		int Conta = 0 ;
		while(Conta != Número) {
			Conta ++ ;
			System.out.print(Conta + " ");
		}System.out.println("");
		System.out.print("Inicial: ");
		Número = Keyboard.nextInt();
		Conta = 0;
		do {
		Conta ++ ;
		System.out.print(Conta + " ");			
		}while(Conta != Número);

}
}