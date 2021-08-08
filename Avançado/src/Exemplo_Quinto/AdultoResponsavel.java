package Exemplo_Quinto;

public class AdultoResponsavel {
	private int idade;
	private String nome;
	private boolean altoriza;
	
	public AdultoResponsavel(int idade, String nome, boolean altoriza) {
		this.idade = idade;
		this.nome = nome;
		this.altoriza = altoriza;
		if(altoriza == false) {
			System.out.println(nome);
			}
		}	
	public AdultoResponsavel(String nome, boolean altoriza) { 
		this.nome = nome;
		this.altoriza = altoriza;
		if(altoriza == false) {
			System.out.println(nome);
			}
	 	}

}
