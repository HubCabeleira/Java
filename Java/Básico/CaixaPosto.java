public class CaixaPosto{
	private char automovel ;
	private char servico ;
	public static void main(String Arg[]){
		Posto registro = new Posto();
		registro.getAutomovel("Carro");
		registro.getServico("Revisão");
		if (registro.getAutomovel() == "Carro"){
			switch(registro.getServico()){
				registro.getServico() "Revisao" : custo + 150;
				registro.getServico() "Limpeza" : custo + 80;
				registro.getServico() "Abastecido" : custo + 60; 
				default : custo += 0;
					}
		}else{
			switch(servico){
				registro.getServico() "Revisao" : custo + 80;
				registro.getServico() "Limpeza" : custo + 40;
				registro.getServico() "Abastecido" : custo + 30; 
				default : custo += 0;
					}
		}
	public char getAutomovel(){
		return automovel;	}
	public void setAutomovel(char Veiculo){	
		this.automovel = veiculo;	}
	public char getServico(){
		return Servico;		}
	public void setServico(char producao){	
		this.servico = producao;	}
}