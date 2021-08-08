package Atividade9;

public class Palavra {

	public static void main(String arg[]){
		Ordenando O = new Ordenando(15) ;
		O.Vertical("C");
		O.Vertical("O");
		O.Vertical("D");
		O.Vertical("E");
		System.out.println(O.Primeira());
		System.out.println(O.Tamanho());
		System.out.println(O.Última());
		System.out.print(O.Primeira());
		System.out.println(O.Tamanho());
		
	}

}
