package Atividade5;


public class Operadora extends Chip{
	void Verifica��o(){
		System.out.println(Saldo);	
		}
	void Emprestado() {
		if(Saldo>0) {
			Saldo += 10;
		}
		else if(Saldo<0){	
			Saldo += 5;	
		}
	}
}
