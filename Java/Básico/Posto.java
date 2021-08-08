public class Posto{
	public static void main(String Arg[]){
		String veiculo = "Carro";
		String servico = "Revisao";
		int custo = 0;
		if (veiculo == "Carro"){
			switch(servico){
				case "Revisao" : custo += 150;
				case "Limpeza" : custo += 80;
				case "Abastecido" : custo += 60; 
				default : custo = 0;
					}
		}else{
			switch(servico){
				case "Revisao" : custo += 80;
				case "Limpeza" : custo += 40;
				case "Abastecido" : custo += 30; 
				default : custo = 0;
					}
		}	
	}
}