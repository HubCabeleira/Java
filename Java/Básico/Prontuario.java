public class Prontuario{
	public static void main(String Arg[]){
		String[] pacientes = new String[]{"Alice Miguel"," Sophia","Arthur","Helena Bernardo","Valentina Heitor","Laura Davi","Isabella Lorenzo","Manuela Th�o","J�lia Pedro" ,"Helo�sa Gabriel","Luiza Enzo" ,"Maria Luiza Matheus", "Lorena Lucas" ,"L�via Benjamin" ,"Giovanna Nicolas" ,"Maria Eduarda	Guilherme" ,"Beatriz Rafael" ,"Maria Clara Joaquim","Cec�lia Samuel","Elo� Enzo Gabriel","Lara Jo�o Miguel"};		
		String[] fichas = new String[]{"1", "2", "3", "4", "5","6", "7", "8","9", "10","11", "12" ,"13", "14", "15", "16", "17", "18 ", "19","20"};
		String[][] prontuario = new String[2][20];
		System.arraycopy(fichas,0,prontuario[0],0,20);
		System.arraycopy(pacientes,0,prontuario[1],0,20);
		for(int c = 0; c<20; c++){
			String resultante = "";
			for(int l = 0; l<2; l++){
				resultante += " " + prontuario[l][c];}
			System.out.println("|N�mero e paciente:" + resultante);
		}
	}
}	