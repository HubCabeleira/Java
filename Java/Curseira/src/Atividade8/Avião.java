package Atividade8;

public class Avião extends Aviãodeguerra {
	private int Potencia;
	@Override
	public void Acelerar() {
		Velocidade += Velocidade*2;
		if (Velocidade>Potencia) {
			Velocidade = Potencia;
		} 
	}	

	public Avião(String Modelo, int Potencia, int Altitude){
		super(Modelo, Altitude);
		this.Potencia = Potencia;

	}
	
		

}
