package Forandwhile;

import java.util.Scanner;

public class Exercicio19 {
		 public static void main(String[] args) {
		Scanner Keyboard =  new Scanner(System.in);
		boolean Validade = false;
		int AnguloA = 0;
		int AnguloB = 0;
		do {
		System.out.println("Angulo A: ");
		AnguloA = Keyboard.nextInt();
		System.out.println("Angulo B: ");
		AnguloB = Keyboard.nextInt();
		if (AnguloA + AnguloB<180){
			if(AnguloA > 0) {
				if(AnguloB > 0) {
				Validade = true;}
		}
			}
		}while(Validade == false);
		int Resultado = 180 - (AnguloA + AnguloB) ;
		System.out.println("Ângulo C: " + Resultado);
			
}
}