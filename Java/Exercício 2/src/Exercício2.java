import java.util.Scanner;

public class Exercício2 {
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String solicite1 = ("1ª Nota: ");
		System.out.print(solicite1);
		float note1 = scanner.nextFloat();
		String solicite2 = ("2ª Nota: ");
		System.out.print(solicite2);
		float note2 = scanner.nextFloat();
		String solicite3 = ("3ª Nota: ");
		System.out.print(solicite3);
		float note3 = scanner.nextFloat();
		String solicite4 = ("4ª Nota: ");
		System.out.print(solicite4);
		float note4 = scanner.nextFloat();
		float notes = (note4 + note3 + note2 + note1)/4 ;
		if (notes>=7) {				
			String Resultado = ("Aprovado com ") + notes + (" pontos.");
			System.out.println(Resultado);
		}
		else{
			String Resultado = ("Reprovado com ") + notes + (" pontos.");
			System.out.println(Resultado);
		}
					
				
		
	}
}
