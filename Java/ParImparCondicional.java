public class ParImparCondicional{
	public static void main(String[] args){
		int numero;
		String resposta;
		System.out.print("Digite um número :");
		numero = Integer.parseInt(System.console().readLine());
		resposta = numero % 2 == 0 ? "Par":"Impar";
		System.out.printf("O número digitado é : %s.\n", resposta);
	}	
}
