public class Valida{
	private String senha;
	private int cpf;
	private String login;
	public String getSenha(){
		return senha;}
	public int getCpf(){
		return cpf;}
	public String getLogin(){
		return login;}
	public void setSenha(String senha){
		this.senha = senha;}
	public void setCpf(int cpf){
		this.cpf = cpf;}
	public void setLogin(String login){
		this.login = login;}
	public static void main (String Arg[]){
		Valida entrada = new Valida();
		entrada.setSenha("Codepass");	
		entrada.setCpf(10992);
		entrada.setLogin("id");
		if( !(entrada.getSenha() == "Invalid") && (entrada.getCpf() == 10992)){
			if(entrada.getLogin() == "id"|| entrada.getLogin() == "ID"){
				System.out.println("This user is resgister");
						}
					}
		}
	}