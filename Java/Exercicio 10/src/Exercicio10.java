import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
	Scanner Keyboard = new Scanner (System.in);
	System.out.println("Altura: ");
	Double Altura = Keyboard.nextDouble();
	System.out.println("Sexo: ");
	String Sexo = Keyboard.next();
	if(Sexo == "M"){
		Double Resultado = ((72.7) * Altura) - 58 ; 
		System.out.println(Resultado);
	}else {
		Double Resultado = ((62.1) * Altura) - 44.7 ; 
		System.out.println(Resultado);		
	}
}
}
