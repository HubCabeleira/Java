package Atividade8;
import java.util.HashMap;
import java.util.Map;

public class Vôos {
	private int Trajetos ;
	private Map< Avião, Integer > Avião = new HashMap<>();
	public void Vôos(int Distância){
		
			Trajetos = Distância;
		
	}
	public void AdicionarAvião(Avião Embarcação){
		Avião.put(Embarcação, 0);
	}
	private boolean Fimdovoo() {
		for(Integer Valor: Embarcações.values()) {
			if (Valor>=Trajetos) {
				return true ;
			}else {
				return false; 
			}
			
		}
		
	}
	
	public void Partida() {
		while(!Terminou()){
			for(Avião Embarcação : Embarcações.keySet()){
				Avião.Velocidade();
				int Distância = Velocidade.get(Avião);
				Distância += Velocidade.get();
				
			Embarcações.put(Avião, 0);
				
			}
		}
	}

}
