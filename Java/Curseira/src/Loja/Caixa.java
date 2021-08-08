package Loja;


public class Caixa extends Sessões{
		int ProdutosA; 
		int ProdutosB; 
		int ProdutosC;

		
		
		public void getCompras (int SessõeA, int SessãoB, int SessãoC){
			this.ProdutosA = SessõeA;
			this.ProdutosB = SessãoB;
			this.ProdutosC = SessãoC;  
			}
		
		public void Condimentos(int A, int B, int C, int D, int E){
			int ProdutosA = A*(CondimentosA);
			int ProdutosB = B*(CondimentosB);
			int ProdutosC = C*(CondimentosC);
			int ProdutosD = D*(CondimentosD);
			int ProdutosE = E*(CondimentosE);
				
			}

}
