package Forandwhile;

import java.util.Scanner;

public class Exercicio9 {
 public static void main(String[] args) {
	Scanner Keyboard =  new Scanner(System.in);
	System.out.print("Ultimo Número: ");
	float Último = Keyboard.nextFloat();
	float Resultado = 0 ;
	for(float Contador = 1, Antecessor = 1,  Sucessor = 2; Contador != Último; Contador++) {
		float Calculado = Antecessor/Sucessor ; 
		Resultado += Calculado ;
		float x = Sucessor;
		Sucessor += Antecessor;
		Antecessor = x;		
	}
	System.out.println("Resultado A:  " + Resultado);	
	float Primeiro = 1 ;
	float Resultante = 0 ;
	for(float Contador = 1; Contador != Último; Contador++ ) {
		Primeiro /= Contador ;
		if(Contador%2 != 0) {
		Primeiro = -Primeiro;
		}else{
			Primeiro = +Primeiro;
		}
		Resultante += Primeiro ;				
	}
	System.out.println("Resultado B:  " + Resultante);
}
}
