package Forandwhile;

public class Exercicio10 {
	 public static void main(String[] args) {
		 	String Resultante = " ";
			for (int Contador = 1000; Contador <= 2000; Contador ++ ) {
				if(Contador%11 == 5) {
					Resultante += (Contador + " ");
				}
			}System.out.print("Resultado:"+ Resultante);
		}
}
