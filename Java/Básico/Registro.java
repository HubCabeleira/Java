public class Registro{
	private String Numero ;		
	public static void main(String arg[]){
		Registro codigo = new Registro();
		codigo.setCodigo("109.927.714-04");		
		System.out.println("Your code:" + codigo.getCodigo() + " .");
		}
	public String getCodigo(){
		return Numero;
			}
	public void setCodigo(String Numero){
		  this.Numero = Numero;
			}
}