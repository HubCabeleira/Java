package Arrayandmatriz;

import java.util.Scanner ;

public class Exercicio1 {
	public static void main(String[] arg) {
	Scanner Keyboard = new Scanner(System.in);
	int Linha[] = new int[10];
	for (int Contador = 0; Contador<10; Contador ++) {
		System.out.print((Contador + 1) + "ª)Valor: ");
		int Valor = Keyboard.nextInt();
		int Resultante = Valor*Valor;
		Linha[Contador] = Resultante;
	}
	for (int Contador = 0; Contador<10; Contador ++) {
		System.out.print(" " + (Contador + 1) + "ª)Valor: " + Linha[Contador]);
		
	}
	 
	}


}
