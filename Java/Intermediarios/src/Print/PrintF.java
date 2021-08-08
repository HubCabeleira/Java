package Print;

public class PrintF {
	
	public static void main(String[] args) {
		System.out.printf("Hello %s", "olá Mundo !");
		System.out.println();
		System.out.printf("Hello %S", "Olá Mundo !");
		System.out.println();
		System.out.printf("%C", 'c');
		System.out.println();
		System.out.printf("%c", 'c');
		System.out.printf("%n");
		int valor = 10;
		System.out.printf("%d", valor);
		System.out.printf("%n");
		double pflutuante = 3.14564;
		System.out.printf("%f", pflutuante);
		System.out.printf("%n");
		System.out.printf("%20s", "20 Espaços");
		System.out.printf("%n");
		System.out.printf("%,d", valor);
		System.out.println();
		System.out.printf("%+d", valor);
		System.out.println();
		System.out.printf("%015d", valor);
		System.out.println();
		System.out.printf("%.3f", pflutuante);
		
		
	}
	
}
