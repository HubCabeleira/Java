package Atividade5;

public class Chip {
	int Saldo;
	public void Recarga(int Cr�dito){
		Saldo += Cr�dito;
	}
	public void Liga��es(int Quantidades){
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
