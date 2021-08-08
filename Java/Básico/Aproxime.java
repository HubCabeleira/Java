public class Aproxime{
	public float valor;
	public static void main(String Arg[]){
		Aproxime este = new Aproxime();
		este.setValor(1);
		int resultante = ((int)este.setValor());
		System.out.println(este.getValor());		
		System.out.println(resultante) ;	
		}
	public float getValor(){
		return valor;	}
	public void setValor(float Numerico){
		this.valor = Numerico;	}		
}