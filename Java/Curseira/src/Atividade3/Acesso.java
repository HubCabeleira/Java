package Atividade3;
import java.util.Scanner;
public class Acesso {
	Scanner	keyboard = new Scanner(System.in);
	public String Windows1 ;
	public String Windows2 ;
	void x() {
			String Direction = keyboard.next();
			System.out.print("Anonyma Yes/Not: ");
			if (Direction == "Not"){
				System.out.print("It Is'not posibility");
				Windows1 = "0000";
				Windows2 = "0000";
			}
			else{
				System.out.print("----------------------");
				System.out.print("|     Normalyt  |()|*|");
				System.out.print("----------------------");
				System.out.print("|                    |");
				System.out.print("|                    |");
				System.out.print("|                    |");
				System.out.print("|                    |");
				System.out.print("|                    |");
				System.out.print("----------------------");	
		}	 
	}
}
