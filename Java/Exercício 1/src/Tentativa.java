import java.util.Scanner;

public class Tentativa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String linha  = (".....");
		String Solicita��oA = ("Qual o seu nome: ");
		String Solicita��oB = ("Qual o seu endere�o: ");
		String Solicita��oC = ("Qual a sua idade: ");
		System.out.println(linha);
		System.out.print(Solicita��oA);
		String name = scanner.next();
		System.out.println(linha);
		System.out.print(Solicita��oB);
		String endere�o = scanner.next();
		System.out.println(linha);
		System.out.print(Solicita��oC);
		int idade = scanner.nextInt();
		System.out.println(linha);
		String mensagem = ("Ol� " + name + " fico contente por ter " + idade + " anos e por morar em " + endere�o + ".");
		System.out.println(mensagem);
		System.out.println(linha);
		scanner.close();
	}
}