import java.util.Scanner;

public class Tentativa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String linha  = (".....");
		String SolicitaçãoA = ("Qual o seu nome: ");
		String SolicitaçãoB = ("Qual o seu endereço: ");
		String SolicitaçãoC = ("Qual a sua idade: ");
		System.out.println(linha);
		System.out.print(SolicitaçãoA);
		String name = scanner.next();
		System.out.println(linha);
		System.out.print(SolicitaçãoB);
		String endereço = scanner.next();
		System.out.println(linha);
		System.out.print(SolicitaçãoC);
		int idade = scanner.nextInt();
		System.out.println(linha);
		String mensagem = ("Olá " + name + " fico contente por ter " + idade + " anos e por morar em " + endereço + ".");
		System.out.println(mensagem);
		System.out.println(linha);
		scanner.close();
	}
}