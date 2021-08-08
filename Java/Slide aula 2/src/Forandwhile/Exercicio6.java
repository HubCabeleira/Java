package Forandwhile;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		System.out.print("Inicial: ");
		Scanner Keyboard = new Scanner(System.in);
		int Número = Keyboard.nextInt();
		for(int Contador = (Número) ; Contador != 0 ; Contador -- ) {
			System.out.println(Contador);
		}int Conta = Número;
		while(Conta != 0) {
			System.out.println(Conta);
			Conta -- ;
		}Conta = Número;
		do {
		System.out.println(Conta);
		Conta -- ;			
		}while(Conta != 0);
		
	}

}
