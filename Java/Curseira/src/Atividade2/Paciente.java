package Atividade2;
public class Paciente {
	Double Massa ;
	Double Altura ;
	Double Resultado;
	String Faixas;
	
	public void calcularIMC(double M ,double A)
	{
	Massa = M;
	Altura = A;
		Resultado  = (Massa/(Altura*2)) ;
		}	
	
	public void diaginostico(double Resultado){
		double Resultante = Resultado;
		
		if(Resultante<16){
			Faixas = "Desnutrido";
		}else if(Resultante<16.99){
			Faixas = "Subnutrido";
		}else if(Resultante<18.49 ){
			Faixas = "Normal";
		}else if(Resultante<24.99){
			Faixas = "Sobrepeso";
		}else if(Resultante<29.99){
			Faixas = "Obessidade";
		}else if(Resultante<34.99){
			Faixas = "Obessidade tipo 1";
		}else if(Resultante<39.99){
			Faixas = "Obessidade tipo 2";
		}else{
			Faixas = "Obessidade Mórbida";
		}
		
	}
	public Double getMassa() {
		return Massa;
	}


	public void setMassa(Double massa) {
		Massa = massa;
	}


	public Double getAltura() {
		return Altura;
	}


	public void setAltura(Double altura) {
		Altura = altura;
	}


	public double getResultado() {
		return Resultado;
	}


}
