public class Calendario{
	public static void main (String Arg[]){
		String[] dias = new String[]{"| Domingo |", "| Segunda |", "|  Terça  |", "| Quarta  |", "| Quinta  |", "|  Sexta  |", "| Sábado  |"};
		String[] mes; 
		mes = new String[12];
		mes[0] ={"January"};
		mes[1] ={"February"};
		mes[2] ={"March"};
		mes[3] ={"abril"};
		mes[3] ={"abril"};
		mes[5] ={"June"};
		mes[6] ={"July"};
		mes[7] ={"Augost"};
		mes[8] ={"Sectember"};
		mes[9] ={"Noverber"};
		mes[10] ={"Ouctuber"};
		mes[11] ={"December"};
		String[][] ano = new string[12][31];
		for(int m = 0;m < 11; m++){
			int d_M = mes[m];
			switch(d_m){
				case d_m 1 : datas = 31 ;
					break;
				case d_m 2 : datas = 28;
					brak; 
				case d_m 3 : datas = 31 ;
					break;
				case d_m 5 : datas = 31 ;
					break;
				case d_m 7 : datas = 31 ;
					break;
				case d_m 8 : datas = 31 ;
					break;
				case d_m 10 : datas = 31 ;
					break;
				case d_m 12 : datas = 31 ;
					break;
				default: datas = 30;
					}
			do{
				if(datas.lenthg >= 7){
					for(int d = 0;d<6;d++){
						ano[m][d] = dias[d];}
						datas =- 6;
				}else{
					for(int d = 0 ;d<datas;d++){
						ano[m][d] = dias[d]}
						datas = 0;}			
				}while(datas>=1);
		for(int m = 0; m < 11; m++){
			for(int d = 0; d < mes[m][].length; d ++)			
			System.out.println(" " + ano[m][d]); 
		}
	}
}