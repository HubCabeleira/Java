package Atividade1;
import java.util.Scanner;
public class Loja {
	public static void main(String[] arg){
	Scanner Teclado = new Scanner(System.in);
	System.out.println("|Sem truques|");
	System.out.println("|(1) Mostroario (2)Montagem (3)Avaliação|");
	System.out.print("|Oque deseja: ");
	int Opção = Teclado.nextInt();
	if (Opção==1) {
		Caracteristicas Mostruario = new Caracteristicas();
		Mostruario.Apresentação();
	}
	else if(Opção==2){
		Montagem Oficina = new Montagem();
		Oficina.Opções();
	}
	else{
		Avaliação Valorativa = new Avaliação();
		Valorativa.Resultante();
	}	
	
	}
		
}

