package Atividade1;

import java.util.Scanner;

public class Montagem {
	int Rodas;
	int Rolamentos;
	int Shape;
	void Opções() {
		System.out.println("|Montagem|");
		Scanner Teclado = new Scanner (System.in);
		System.out.println("|Modelo das rodas: |");
		System.out.println("| (1): Iniciantes (2): Semi-profissional (3): Profissional |");
		System.out.print("|Escolha: ");
		Rodas = Teclado.nextInt();
		System.out.println("|Modelo dos rolamentos|");
		System.out.println("| (1): Iniciantes (2): Semi-profissional (3): Profissional |");
		System.out.print("|Escolha: ");
		Rolamentos = Teclado.nextInt();
		System.out.println("|Modelo dos shapes: ");
		System.out.println("| (1): Iniciantes (2): Semi-profissional (3): Profissional |");
		System.out.print("|Escolha: ");
		Shape = Teclado.nextInt();

		
		}
	
}

