package Forandwhile;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		System.out.print("Inicial: ");
		Scanner Keyboard = new Scanner(System.in);
		int N�mero = Keyboard.nextInt();
		for(int Contador = 1 ; Contador <= N�mero ; Contador ++ ) {
			System.out.print(Contador + " ");
		}System.out.println("");
		System.out.print("Inicial: ");
		N�mero = Keyboard.nextInt();
		int Conta = 0 ;
		while(Conta != N�mero) {
			Conta ++ ;
			System.out.print(Conta + " ");
		}System.out.println("");
		System.out.print("Inicial: ");
		N�mero = Keyboard.nextInt();
		Conta = 0;
		do {
		Conta ++ ;
		System.out.print(Conta + " ");			
		}while(Conta != N�mero);

}
}