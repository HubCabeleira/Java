package Forandwhile;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		int N�mero = Keyboard.nextInt();
		for(int FatorA = 1, FatorB = 1; FatorA <= N�mero; FatorB ++){
			if (FatorB > N�mero){
				FatorB = 0;
				FatorA ++ ;
			}else{
				System.out.println(FatorA + " + " + FatorB + "=" + (FatorA+FatorB) );
			}
		
			
		}
		int FatorA = 0;
		int FatorB = N�mero;
		do {
			FatorA ++;			
			if (FatorA > FatorB){
				FatorA = 0;
				FatorB -- ;
			}else{
			System.out.println(FatorB + " - " + FatorA + "=" + (FatorB-FatorA));
			}
			
			
		}while(FatorB != 0);
		
		for(FatorA = 1, FatorB = 1; FatorA <= N�mero; FatorB ++){
			if (FatorB > N�mero){
				FatorB = 0;
				FatorA ++ ;
			}else{
				System.out.println(FatorA + " X " + FatorB + "=" + (FatorA*FatorB));
				}
			
			
	}
		FatorA = N�mero;
		FatorB = 0;
		while(FatorA != 0) {
			FatorB ++ ;			
			if (FatorB > FatorA){
				FatorB = 0;
				FatorA -- ;
			}else{
			System.out.println(FatorA + " / " + FatorB + "=" + (FatorA/FatorB));
			}
			
			
		}

}
}