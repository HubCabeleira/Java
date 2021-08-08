package Exemplo_Dois;

public class Lion extends Pet {
	public void lion() {
		this.setEspecie("Felinos");
		this.getEspecie();
		this.setNome("King");
		this.getNome();
	}
	@Override
	public void Som() {
		System.out.println("Rugido");
	}

}