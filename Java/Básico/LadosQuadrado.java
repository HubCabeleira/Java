public class LadosQuadrado{
	public double area ; 
	public double getArea(){
		return area; }
	public void setArea(double tamanho){
		this.area = tamanho; }
	public static void main(String Args[]){
		LadosQuadrado resultado = new LadosQuadrado(); 
		resultado.setArea(90);
		System.out.println("Quadrado >" + resultado.getArea());
		System.out.println("Lado do quadro >" + Math.sqrt(resultado.getArea()));
			}
}