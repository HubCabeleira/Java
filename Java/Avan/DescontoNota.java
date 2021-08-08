public class DescontoNota{
	public double total(double a, double b, double c, double d){
		return(a+b+c+d);
		}
	public double desconto(double entrada){
		double resultado = (entrada-(entrada/100)*((entrada>100)?20:10));
		return(resultado);
		}
	public static void main(String [] args){
		DescontoNota his = new DescontoNota();
		double entrada = his.total(80,40,10,10);
		double saida = his.desconto(entrada);
		System.out.println("" + saida);
	}
}