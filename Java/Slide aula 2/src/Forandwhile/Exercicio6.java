package Forandwhile;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		System.out.print("Inicial: ");
		Scanner Keyboard = new Scanner(System.in);
		int N�mero = Keyboard.nextInt();
		for(int Contador = (N�mero) ; Contador != 0 ; Contador -- ) {
			System.out.println(Contador);
		}int Conta = N�mero;
		while(Conta != 0) {
			System.out.println(Conta);
			Conta -- ;
		}Conta = N�mero;
		do {
		System.out.println(Conta);
		Conta -- ;			
		}while(Conta != 0);
		
	}

}
