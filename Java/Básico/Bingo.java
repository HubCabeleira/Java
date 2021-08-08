import java.util.*;
public class Bingo{
	public static void main(String Args[]){
		String[] sorteados = new String[]{"1", "2", "3", "4", "5", "6", "7", "8","9", "10","11", "12" ,"13", "14", "15", "16", "17", "18 ", "19","20", "21", "22", "23", "24", "25"};
		Arrays.sort(sorteados);
		String[] his_table = new String[20];
		System.arraycopy(sorteados,0,his_table,0,20);
		String linha = "";
		for(int n = 0; n < his_table.length ; n++){
			linha += "	" + his_table[n];
			if(n==4 || n==9 || n==14 || n==19){
				System.out.println("");
				System.out.println(linha);
				System.out.println("");
				linha = "";}
		}
	}
}



