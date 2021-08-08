import java.util.Scanner;

public class Exercício4 {
	public static void main(String[] args) {
	Scanner scann = new Scanner(System.in);
	String solicite1 = ("1ª Nota: ");
	System.out.print(solicite1);
	float note1 = scann.nextFloat();
	String solicite2 = ("2ª Nota: ");
	System.out.print(solicite2);
	float note2 = scann.nextFloat();
	float notes = (note1+ note2)/2 ;
	if (notes<4){
		System.out.print("Reprovado.");
	} 
	else if(notes<7) {
		System.out.print("Exame final.");
	}
	else {
		System.out.print("Aprovado.");
	}

	}

} 