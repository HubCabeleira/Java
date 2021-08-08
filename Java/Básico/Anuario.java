public class Calendario{
	public static void main (String Arg[]){
		String[] dias;
		dias = new String[7];
		dias[0] = "| Domingo |";
		dias[1] = "| Segunda |"; 
		dias[2] = "|  Terça  |";
		dias[3] = "| Quarta  |";
		dias[4] = "| Quinta  |";
		dias[5] = "|  Sexta  |";
		dias[6] = "| Sábado  |";
		String[] mes = new String[]{"January", "February", "March", "abril", "June", "Jhuly", "Augost", "Sectember", "Noverber","Ouctuber", "December"};
		for(int d = 0; d<12; d++){			
			System.out.println("| " + mes[d]); 
		}
	}
}