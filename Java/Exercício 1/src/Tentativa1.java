import java.util.Scanner;

public class Tentativa1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String linha = ("-----------------------------------------------"); 
	String mensagem0 = ("Descubra seu número da sorte para apostas!");
	String mensagem1 = ("Oquanto você já ganhou? ");
	String mensagem2 = ("Oquanto você têm? ");
	String mensagem3 = ("Oquanto voê quer ganhar? ");
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
	float terá = scanner.nextFloat();
	System.out.println(linha);
	float resultante = ((teve + tem + terá)/3);
	System.out.println("Seu número da sorte é: " + resultante + ".");
	System.out.print(linha);
}
}
