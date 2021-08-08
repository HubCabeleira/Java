package Atividade3;
import java.util.Scanner;
public class Identificador {
public static void main(String[] arg) {
	Scanner	keyboard = new Scanner(System.in);
	Cadastro Usuários = new Cadastro();
	Acesso Acessando = new Acesso();
	for (String Close = "Not"; Close == "Yes";) {
		Acessando.x();
		if (Usuários.CódigoA == Acessando.Windows1 && Usuários.CódigoA == Acessando.Windows2 ) {
		Usuários.AcessoA ++;
	}
	if (Usuários.CódigoB == Acessando.Windows2){
		Usuários.AcessoA ++;
		Usuários.AcessoB ++;}
	Close = keyboard.next();
	System.out.print("Continue Yes/Not: ");
	}
	System.out.print("Acess Normalyt " + Usuários.AcessoA + "Acess anonymm " + Usuários.AcessoB );
}
}