package Forandwhile;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] arg) {
	Scanner Keyboard = new Scanner(System.in);
	int TotalA = 0;
	int TotalB = 0;
	int TotalC = 0;
	int TotalD = 0;
	int TotalE = 0;
	for (int Contador = 0 ; Contador <= 80 ;Contador ++  ) {
		System.out.println("Idade: " );
		int Idade = Keyboard.nextInt();
		if (Idade<=15) {
			TotalA ++;			
		}else if(Idade>=16 && Idade<=30) {
			TotalB ++;
		}else if(Idade>=31 && Idade<= 45) {
			TotalC ++;
		}else if(Idade<=46 && Idade<=60){
			TotalD ++;
		}else {
			TotalE ++;
		}
		
		}
	System.out.println("Faixa A: " + (TotalA));
	System.out.println("Faixa B: " + (TotalB));
	System.out.println("Faixa C: " + (TotalC));
	System.out.println("Faixa D: " + (TotalD));
	System.out.println("Faixa E: " + (TotalE));
	System.out.println("Percentual A: " + (TotalA*0.8));
	System.out.println("Percentual E: " + (TotalE*0.8));
	}
}
