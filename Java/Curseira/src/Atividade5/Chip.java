package Atividade5;

public class Chip {
	int Saldo;
	public void Recarga(int Crédito){
		Saldo += Crédito;
	}
	public void Ligações(int Quantidades){
		int Custo = (Quantidades*2);
		if(Custo<Saldo){	
			Saldo -= Custo;
				}
		else if(Custo>Saldo) {	
			Saldo -= Custo*2;
		}
	}
	public void Bonus(){
	if(Saldo>=20 && Saldo<=35) {
		Saldo += 3;
	}else if(Saldo>35){
		Saldo += 5;
	}
	}
	
}
