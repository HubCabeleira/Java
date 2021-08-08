package Forandwhile;

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] arg) {
		Scanner Keyboard = new Scanner (System.in);
		float FaixaA = 0;
		float FaixaB = 0;
		float FaixaC = 0;
		float FaixaD = 0;
		int TotalA = 0;
		int TotalB = 0;
		int TotalC = 0;
		int TotalD = 0;
		System.out.println("|---------------------------------|");
		System.out.println("|-----|Levantamento de peso|------|");
		System.out.println("|---------------------------------|");
		for (int Contador = 1; Contador <= 5; Contador++) {
		System.out.print("| " + Contador + " º) Idade: ");
		int Idade = Keyboard.nextInt();
		System.out.print("| " + Contador + " º) Peso: ");
		float Peso = Keyboard.nextFloat();
		if(Idade <= 10) { 
			FaixaA += Peso ;
			TotalA ++;
		}else if (Idade<=20){
			FaixaB += Peso ;
			TotalB ++;
		}else if(Idade<=30){
			FaixaC += Peso ;
			TotalB ++;
		}else {
			FaixaD += Peso ;
			TotalB ++;
		}
		
				}
		System.out.println("| Média dos pesos|");
		System.out.println("| Faixa A : " + (FaixaA/TotalA) + " |");
		System.out.println("| Faixa B : " + (FaixaB/TotalA) + " |");
		System.out.println("| Faixa C : " + (FaixaC/TotalA) + " |");
		System.out.println("| Faixa D : " + (FaixaD/TotalA) + " |");
		System.out.println("|---------------------------------|");
		
	}	
}
