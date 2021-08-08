package Atividade1;
import java.util.Scanner;
public class Caracteristicas {
	Scanner Teclado = new Scanner(System.in);
	void Apresentação(){
	String Rever = "S";
	do {
		Montagem Escolhas = new Montagem();
		Escolhas.Opções();
		if(Escolhas.Rodas==1){
			System.out.println("|Estas rodas custarão R$75,00|");
		}
		else if(Escolhas.Rodas==2) {
			System.out.println("|Estas rodas custarão R$100,00|");
		}
		else {
			System.out.println("|Estas rodas custarão R$150,00|");
		}
		if(Escolhas.Rolamentos==1){
			System.out.println("|Estas rodas custarão R$75,00|");
		}
		else if(Escolhas.Rolamentos==2) {
			System.out.println("|Estas rodas custarão R$100,00|");
		}
		else {
			System.out.println("|Estas rodas custarão R$150,00|");
			}
		if(Escolhas.Shape==1){
			System.out.println("|Estas rodas custarão R$75,00|");
		}
		else if(Escolhas.Shape==2) {
			System.out.println("|Estas rodas custarão R$100,00|");
		}
		else {
			System.out.println("|Estas rodas custarão R$150,00|");
		}
		System.out.print("|Rever outra opção (S/N)?");
		Rever = Teclado.next();
	}while(Rever !="S");

	
	
		
	}
}



