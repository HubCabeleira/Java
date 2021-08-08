package Atividade1;

public class Avaliação {
	void Resultante(){
		Montagem Escolhas = new Montagem();
		Escolhas.Opções();
		int CustoR;
		int CustoRT;
		int CustoS;
		if(Escolhas.Rodas==1){
			CustoR = 75;
		}
		else if(Escolhas.Rodas==2) {
			CustoR = 100;
		}
		else {
			CustoR = 150;
		}	
		if(Escolhas.Rolamentos==1){
			CustoRT = 75;
		}
		else if(Escolhas.Rolamentos==2) {
			CustoRT = 100;
		}
		else {
			CustoRT = 150;
			}
		if(Escolhas.Shape==1){
			CustoS = 75;
		}
		else if(Escolhas.Shape==2) {
			CustoS = 100;
		}
		else {
			CustoS = 150;
		}
		int Total = CustoR + CustoRT + CustoS;
		System.out.print("| O preço total desses equipamentos é: " + Total);
			
		}
	}
		




