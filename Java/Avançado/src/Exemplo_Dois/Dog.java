package Exemplo_Dois;

public class Dog extends Pet{
	public void Dog(){
		this.setEspecie("Caninos");
		this.getEspecie();
		this.setNome("Zeus");
		this.getNome();
	}
	@Override
	public void Som() {
		System.out.println("Latido");
	}
	
}
