package Atividade8;

public class Avi�o extends Avi�odeguerra {
	private int Potencia;
	@Override
	public void Acelerar() {
		Velocidade += Velocidade*2;
		if (Velocidade>Potencia) {
			Velocidade = Potencia;
		} 
	}	

	public Avi�o(String Modelo, int Potencia, int Altitude){
		super(Modelo, Altitude);
		this.Potencia = Potencia;

	}
	
		

}
