public class Cambio{
	private String Dollar;
	private String Bitcoins;
	private double quantia ;  
	private double resultante ; 
	public static void main (String Arg[]){
		Cambio Cotacoes = new Cambio() ;
		Cotacoes.setQuantia(50000);
		Cotacoes.setBitcoins("$ 50 000.00");
		Cotacoes.setDollar("$ 1.00");
		if(Cotacoes.getQuantia()>=50000){
			Cotacoes.setResultante((Cotacoes.getQuantia()/50000));
			System.out.println("|It's possibility.") ;
			System.out.println("|The value is : " + Cotacoes.getDollar());
			System.out.println("|Result:" + Cotacoes.getResultante()) ;
			}else{
			System.out.println("|It doesn't possibility.");
			System.out.println("|The value coincript level more up: " + Cotacoes.getBitcoins());
			}
		}
	public String getDollar(){
		return Dollar ;
		}
	public void setDollar(String valor){
		this.Dollar = valor ;
		}
	public String getBitcoins(){
		return Bitcoins ;
		}
	public void setBitcoins(String valor){
		this.Bitcoins = valor ;
		}
	public double getQuantia(){
		return quantia ;
		}
	public void setQuantia(double converta){
		this.quantia = converta ;
		}
	public double getResultante(){
		return resultante ;
		}
	public void setResultante(double total){
		this.resultante = total ;
		}
}