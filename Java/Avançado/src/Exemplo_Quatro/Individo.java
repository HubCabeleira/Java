package Exemplo_Quatro;

public class Individo {
	private String sexo;
	private String faixa_etaria;
	private String biotipo;
	
	public Individo(){
		this.sexo = "Indefinido";
		this.faixa_etaria = "Indefinida";
		this.biotipo = "Indefinido";
		System.out.println("É do sexo " + this.sexo + " e aparenta ter a idade de " + this.faixa_etaria + " e o seu tipo físico é " + this.biotipo);
	}
}
