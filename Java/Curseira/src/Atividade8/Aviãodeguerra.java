package Atividade8;

public abstract class Avi�odeguerra {

	protected int Velocidade;
	
	protected int Altitude;
	
	protected String Modelo;
	
	public abstract void Acelerar();


	public Avi�odeguerra(String Modelo, int Altitude) {
		this.Modelo = Modelo;
		this.Altitude = Altitude;
		this.Velocidade = 0;
				
	}
		
	public void Desacelerar() {
		Velocidade = Velocidade/2;
		
	}

	public int getVelocidade() {
		return Velocidade;
		
	}

	public String getModelo() {
		return Modelo;
	}


}
