package Atividade3;
import java.util.Scanner;
public class Identificador {
public static void main(String[] arg) {
	Scanner	keyboard = new Scanner(System.in);
	Cadastro Usu�rios = new Cadastro();
	Acesso Acessando = new Acesso();
	for (String Close = "Not"; Close == "Yes";) {
		Acessando.x();
		if (Usu�rios.C�digoA == Acessando.Windows1 && Usu�rios.C�digoA == Acessando.Windows2 ) {
		Usu�rios.AcessoA ++;
	}
	if (Usu�rios.C�digoB == Acessando.Windows2){
		Usu�rios.AcessoA ++;
		Usu�rios.AcessoB ++;}
	Close = keyboard.next();
	System.out.print("Continue Yes/Not: ");
	}
	System.out.print("Acess Normalyt " + Usu�rios.AcessoA + "Acess anonymm " + Usu�rios.AcessoB );
}
}