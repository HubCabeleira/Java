package Loja;


public class Caixa extends Sess�es{
		int ProdutosA; 
		int ProdutosB; 
		int ProdutosC;

		
		
		public void getCompras (int Sess�eA, int Sess�oB, int Sess�oC){
			this.ProdutosA = Sess�eA;
			this.ProdutosB = Sess�oB;
			this.ProdutosC = Sess�oC;  
			}
		
		public void Condimentos(int A, int B, int C, int D, int E){
			int ProdutosA = A*(CondimentosA);
			int ProdutosB = B*(CondimentosB);
			int ProdutosC = C*(CondimentosC);
			int ProdutosD = D*(CondimentosD);
			int ProdutosE = E*(CondimentosE);
				
			}

}
