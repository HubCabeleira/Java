package Atividade8;

public class Avi�ojato extends Avi�odeguerra {
	private double HiperP;

	public Avi�ojato(String Modelo, double HiperP, int Altitude) {
		super(Modelo, Altitude);
		if (HiperP >1 && HiperP<2) {
			this.HiperP = HiperP ;
		}else{
			this.HiperP = 1.5 ;
		}
		} 
		
	
	@Override
	public void Acelerar() {
		if (Velocidade == 0) {
			Velocidade = 250;
		}
		else {
		Velocidade *= HiperP ;
		if (Velocidade> Altitude){
			Velocidade = Altitude; 
			}

		}
	}

}

