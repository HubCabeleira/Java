public class ConjuntoZ {
	public static void main(String arg[]){
		double positivos = 1;
		double negativos = -1;
		while(!(positivos==negativos) && !(negativos==positivos)){
			negativos --;
			positivos ++;
			System.out.print(positivos + ", ");
			System.out.print(negativos);	
						}
		}
	}