package Forandwhile;

public class Exercicio11 {
	public static void main(String[] args) {		
	int Produto = 1;
	for (int Contador = 92; Contador <= 105; Contador ++ ) {
		if(Contador%2 == 0 && Contador%3 == 0 ) {
			Produto = Contador*Produto ;
		}
	}System.out.print("Resultado: " + Produto);
}
}