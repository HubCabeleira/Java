package Atividade9;

public class Ordenando {
	
	private Object[] Letras;
	private int Primeira = 0;
		
	public Ordenando(int Limite) {
		Letras = new Object[Limite];
		
	}
	
	public void Vertical (Object Letra) {
		Letras[Primeira] = Letra;
		Primeira ++ ;
	}
	
	public Object Última() {
		Primeira --;
		return Letras[Primeira] ;
		
	}
	
	public Object Primeira(){
//		return Letras[Primeira -1];

}
	public int Tamanho(){
		return Primeira;
	}

	public Object[] getLetras() {
		return Letras;
	}

	public void setLetras(Object[] letras) {
		Letras = letras;
	}


	public void setPrimeira(int primeira) {
		Primeira = primeira;
	}
	}
