import java.util.Scanner;
class Exercicio5{
	public static void main(String[] args){
		System.out.println("|================|Funções|==============|");	
		System.out.println("|Insira dois números: ");		
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("|Primeiro: ");
		Float primeiro = Keyboard.nextFloat();
		System.out.println("|Segundo: ");			
		Float segundo = Keyboard.nextFloat();		
		System.out.println("|==========|Equações|=============|");
		System.out.println("|Possibilidades: ");
		System.out.println("|(1) Média entre os dois |");
		System.out.println("|(2) Diferença entre o > e o < |");
		System.out.println("|(3) Produto entre os números |");
		System.out.println("|(4) Divisão do A por B |");
		System.out.println("|Insira a opção: ");		
		String escoha = Keyboard.next();
		\\if (escolha == "1"){
			\\Float resultante0 = ((primeiro+segundo)/2) ;
		\\} else if (escolha == "2") {
			\\if (primeiro>segundo) {
				\\Float resultante0 = (primeiro-segundo);
			\\}else{
				\\Float resultante0 = (segundo-primeiro);
			\\}		
		\\} else if (escolha == "3") {
			\\Float resultante0 = (primeiro*segundo);
		\\} else if (escolha == "4") {
			\\Float resultante0 = (primeiro/segundo);
		\\} else {
			\\Validade = ("Erro");
			}
		\\if (Validade == "Erro") {
			\\System.out.println("Opição inválida");
		\\} else {
			\\System.out.println("Resultado:" + resultante);
		\\}		
							}
}	
