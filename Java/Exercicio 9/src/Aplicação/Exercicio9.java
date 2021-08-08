package Aplicação;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner (System.in);
	System.out.println("|=================|");
	System.out.println("|=Ordem Crescente=|");
	System.out.println("|=================|");
	System.out.print("|Primeiro: ");
	double Primeiro = keyboard.nextDouble();
	System.out.println("|=================|");
	System.out.print("|Segundo: ");
	double Segundo = keyboard.nextDouble();
	System.out.println("|=================|");
	System.out.print("|Terceiro: ");
	double Terceiro = keyboard.nextDouble();
	if(Primeiro<Segundo && Primeiro<Terceiro) { 
		if(Segundo<Terceiro) { 
			String Ordem = ("" + Primeiro + ", " + Segundo + ", " + Terceiro);
			System.out.println("|==================|");
			System.out.println("| " + Ordem);
			System.out.println("|==================|");
		}
		else{
			String Ordem = ("" + Primeiro + ", " + Terceiro + ", " + Segundo);
			System.out.println("|==================|");
			System.out.println("| " + Ordem);
			System.out.println("|==================|");
		}
	}else if (Segundo<Primeiro && Segundo<Terceiro){
		if(Terceiro<Primeiro){
			String Ordem = ("" + Segundo + ", " + Terceiro + ", " + Primeiro);
			System.out.println("|==================|");
			System.out.println("| " + Ordem);
			System.out.println("|==================|");
		}
		else{
			String Ordem = ("" + Segundo + ", " + Primeiro + ", " + Terceiro);
			System.out.println("|==================|");
			System.out.println("| " + Ordem);
			System.out.println("|==================|");
		}
	}else{
		if(Segundo<Primeiro){
			String Ordem = ("" + Terceiro + ", " + Segundo + ", " + Primeiro);
			System.out.println("|=================|");
			System.out.println("| " + Ordem);
			System.out.println("|=================|");
		}else{
			String Ordem = ("" + Terceiro + ", " + Primeiro + ", " + Segundo);
			System.out.println("|=================|");
			System.out.println("| " + Ordem);
			System.out.println("|=================|");
	}
				}	

	}
}