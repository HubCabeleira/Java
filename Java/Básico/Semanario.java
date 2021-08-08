public class Semanario{
	public static void main (String Arg[]){
		String[] dias;
		dias = new String[7];
		dias[0] = "Domingo: ";
		dias[1] = "Segunda: "; 
		dias[2] = "Terça: ";
		dias[3] = "Quarta: ";
		dias[4] = "Quinta: ";
		dias[5] = "Sexta: ";
		dias[6] = "Sábado: ";
		String[] tarefas = {"Revisões, higiene pessoal e  hobbes", "Estudo, cursinhos e revisões", "Estudo, cursinhos e revisões", "Estudo, cursinhos e revisões","Estudo, cursinhos e revisões", "Estudo, cursinhos e cusinhos", "Revisões, faxinha e cursinhos"};
		for(int d = 0; d<7; d++){			
			System.out.println("| " + dias[d] + tarefas[d]); 
		}
	}
}