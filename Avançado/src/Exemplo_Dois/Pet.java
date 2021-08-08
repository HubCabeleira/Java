package Exemplo_Dois;

public class Pet {
	private String especie;
	private String nome;
	public String getEspecie(){
		return especie;
	}
	public void setEspecie(String especie){
		this.especie = especie;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void Som() {
		System.out.println("Grunidos");  
	}

}
