public class SenhaNumerica {
	public static void main(String arg[]){
		double senha = Math.random();
		double numero = 0 ;
		System.out.print("This password is : " + senha );				
		System.out.println("Try : ");
		do{		
			numero ++;
			System.out.print(numero + " - ");	
		}while(!(numero==senha));
		System.out.println("Congraction try :" + numero);			
	}
}