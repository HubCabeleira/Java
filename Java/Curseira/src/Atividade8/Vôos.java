package Atividade8;
import java.util.HashMap;
import java.util.Map;

public class V�os {
	private int Trajetos ;
	private Map< Avi�o, Integer > Avi�o = new HashMap<>();
	public void V�os(int Dist�ncia){
		
			Trajetos = Dist�ncia;
		
	}
	public void AdicionarAvi�o(Avi�o Embarca��o){
		Avi�o.put(Embarca��o, 0);
	}
	private boolean Fimdovoo() {
		for(Integer Valor: Embarca��es.values()) {
			if (Valor>=Trajetos) {
				return true ;
			}else {
				return false; 
			}
			
		}
		
	}
	
	public void Partida() {
		while(!Terminou()){
			for(Avi�o Embarca��o : Embarca��es.keySet()){
				Avi�o.Velocidade();
				int Dist�ncia = Velocidade.get(Avi�o);
				Dist�ncia += Velocidade.get();
				
			Embarca��es.put(Avi�o, 0);
				
			}
		}
	}

}
