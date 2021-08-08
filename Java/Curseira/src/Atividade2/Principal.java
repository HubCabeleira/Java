package Atividade2;

public class Principal {
	public static void main(String[] arg) {
		Paciente Avaliar = new Paciente();
		Avaliar.calcularIMC(40.0, 1.80);
		Double Resultante = Avaliar.Resultado;
		Avaliar.diaginostico(Resultante);
		String Faixa = Avaliar.Faixas;
		System.out.print(Faixa);
		
	}
	
}
