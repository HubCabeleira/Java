package Atividade1;
import java.util.Scanner;
public class Loja {
	public static void main(String[] arg){
	Scanner Teclado = new Scanner(System.in);
	System.out.println("|Sem truques|");
	System.out.println("|(1) Mostroario (2)Montagem (3)Avalia��o|");
	System.out.print("|Oque deseja: ");
	int Op��o = Teclado.nextInt();
	if (Op��o==1) {
		Caracteristicas Mostruario = new Caracteristicas();
		Mostruario.Apresenta��o();
	}
	else if(Op��o==2){
		Montagem Oficina = new Montagem();
		Oficina.Op��es();
	}
	else{
		Avalia��o Valorativa = new Avalia��o();
		Valorativa.Resultante();
	}	
	
	}
		
}

