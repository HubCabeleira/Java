package Exemplo_Dois;

public class Chikens extends Pet{
	public void Chikens(){
		this.setNome("Amarelinha");
		this.setEspecie("Ave");
		this.getEspecie();
		this.getNome();
	}
	@Override
	public void Som() {
		System.out.println("Cacarejo");
	}
}
