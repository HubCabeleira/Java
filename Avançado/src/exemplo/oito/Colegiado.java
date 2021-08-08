package exemplo.oito;

public class Colegiado {
	private double registros;
	public int turmas;
	private int doscentes;
	public int discentes;
	public Colegiado(double identificador , int total, int conjuntoA, int conjuntoB) {
		this.registros = identificador;
		this.turmas = total;
		this.doscentes = conjuntoA;
		this.discentes = conjuntoB;
	}
}
