package Exemplo_Tr�s;

public class Aluno {
	public static void main(String args[]){
		Cadastro pessoa;
		pessoa = new Cadastro();
		pessoa.setMatricula(15036);
		System.out.println("N�mero Cadastrado: " + pessoa.getMatricula()  );
	}

}
