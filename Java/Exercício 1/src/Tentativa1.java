import java.util.Scanner;

public class Tentativa1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String linha = ("-----------------------------------------------"); 
	String mensagem0 = ("Descubra seu n�mero da sorte para apostas!");
	String mensagem1 = ("Oquanto voc� j� ganhou? ");
	String mensagem2 = ("Oquanto voc� t�m? ");
	String mensagem3 = ("Oquanto vo� quer ganhar? ");
	System.out.println(linha);
	System.out.println(mensagem0);
	System.out.println(linha);
	System.out.print(mensagem1);
	float teve = scanner.nextFloat();
	System.out.println(linha);
	System.out.print(mensagem2);
	float tem = scanner.nextFloat();
	System.out.println(linha);
	System.out.print(mensagem3);
	float ter� = scanner.nextFloat();
	System.out.println(linha);
	float resultante = ((teve + tem + ter�)/3);
	System.out.println("Seu n�mero da sorte �: " + resultante + ".");
	System.out.print(linha);
}
}
