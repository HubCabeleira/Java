public class Semanario{
	public static void main (String Arg[]){
		String[] dias;
		dias = new String[7];
		dias[0] = "Domingo: ";
		dias[1] = "Segunda: "; 
		dias[2] = "Ter�a: ";
		dias[3] = "Quarta: ";
		dias[4] = "Quinta: ";
		dias[5] = "Sexta: ";
		dias[6] = "S�bado: ";
		String[] tarefas = {"Revis�es, higiene pessoal e  hobbes", "Estudo, cursinhos e revis�es", "Estudo, cursinhos e revis�es", "Estudo, cursinhos e revis�es","Estudo, cursinhos e revis�es", "Estudo, cursinhos e cusinhos", "Revis�es, faxinha e cursinhos"};
		for(int d = 0; d<7; d++){			
			System.out.println("| " + dias[d] + tarefas[d]); 
		}
	}
}