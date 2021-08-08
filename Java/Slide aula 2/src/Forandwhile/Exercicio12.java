package Forandwhile;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner (System.in);
		System.out.println("|--|Ordem dos Conjuntos|--|");
		int Contador = 0;
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0; 
		String ConjuntoA = "|1ª) Conjunto  :" ;
		String CrescenteA  = "|   A) Crescente:" ;
		String DecrescenteA  = "|   B) Decrescente:" ;
		String ConjuntoB = "|2ª) Conjunto  :" ;
		String CrescenteB  = "|   A) Crescente:" ;
		String DecrescenteB  = "|   B) Decrescente:" ;
		String ConjuntoC = "|3ª) Conjunto  :" ;
		String CrescenteC  = "|   A) Crescente:" ;
		String DecrescenteC  = "|   B) Decrescente:" ;
		String ConjuntoD = "|4ª) Conjunto  :" ;
		String CrescenteD  = "|   A) Crescente:" ;
		String DecrescenteD  = "|   B) Decrescente:" ;
		String ConjuntoE = "|5ª) Conjunto  :" ;
		String CrescenteE  = "|   A) Crescente:" ;
		String DecrescenteE  = "|   B) Decrescente:" ;
		do {
		String Conjunto = " " ;
		String Crescente  = " " ;
		String Decrescente  = " " ;
		System.out.println("-------------------");
		System.out.print("| Valor: ");
		A = Keyboard.nextInt();
		System.out.print("| Valor: ");
		B = Keyboard.nextInt();
		System.out.print("| Valor: ");
		C = Keyboard.nextInt();
		System.out.print("| Valor: ");
		D = Keyboard.nextInt();
		Conjunto += (A + " " + B + " " + C + " " + D ) ;
		if((A < B) && (A < C) &&  (A < D)){
				Crescente +=  A;				
				if((B < C) && (B < D)){					
					Crescente += " " + B  + " " ;		
					if (C < D){						
						Crescente += C + " " + D ;						
					}else{
						Crescente += D + " " + C ;  				
					}
					
				}else if((C < B) && (C < D)) {
					Crescente += " " + C  + " " ;
					if (B < D){						
						Crescente += B + " " + D ;						
					}else{
						Crescente += D + " " + B ;  				
					}
				
				}else {
					Crescente += " " + D  + " " ;
					if (B < C){						
						Crescente += B + " " + C ;						
					}else{
						Crescente += C + " " + D ;  				
					}
				}
		}else if((B < A) && (B < C) &&  (B < D)){
				Crescente += " " + B ;				
				if((A < C) && (A < D)){					
					Crescente += " " + A  + " " ;		
					if (C < D){						
						Crescente += C + " " + D ;						
					}else{
						Crescente += D + " " + C ;  				
					}
				
				}else if((C < A) && (C < D)) {
					Crescente += " " + C  + " " ;
					if (A < D){						
						Crescente += A + " " + D ;						
					}else{
						Crescente += D + " " + A ;  				
				}
			
				}else {
					Crescente += " " + D  + " " ;
					if (A < C){						
						Crescente += A + " " + C ;						
					}else{
						Crescente += C + " " + A ;  				
				}
				
			}	
		}else if((C < A) && (C < B) &&  (C < D)){
				Crescente += " " + C ;				
				if((A < B) && (A < D)){					
					Crescente += " " + A  + " " ;		
					if (B < D){						
						Crescente += B + " " + D ;						
					}else{
						Crescente += D + " " + B ;  				
				}
				
				}else if((B < A) && (B < D)) {
					Crescente += " " + B  + " " ;
					if (A < D){						
						Crescente += A + " " + D ;						
					}else{
						Crescente += D + " " + A ;  				
				}
			
				}else {
					Crescente += " " + D  + " " ;
				if (A < B){						
					Crescente += A + " " + B ;						
				}else{
					Crescente += B + " " + A ;  				
				}
				
			}
				
		}else {
			Crescente +=  D ;				
			if((A < C) && (A < B)){					
				Crescente += " " + A  + " " ;		
				if (C < B){						
					Crescente += C + " " + B ;						
				}else{
					Crescente += B + " " + C ;  				
				}
				
			}else if((C < A) && (C < B)) {
				Crescente += " " + C  + " " ;
				if (A < B){						
					Crescente += A + " " + B ;						
				}else{
					Crescente += B + " " + A ;  				
				}
			
			}else {
				Crescente += " " + B  + " " ;
				if (A < C){						
					Crescente += A + " " + C ;						
				}else{
					Crescente += C + " " + A ;  				
				}
				
			}
				
		}
		
		if((A > B) && (A > C) &&  (A > D)){
			Decrescente +=  A;				
			if((B > C) && (B > D)){					
				Decrescente += " " + B  + " " ;		
				if (C > D){						
					Decrescente += C + " " + D ;						
				}else{
					Decrescente += D + " " + C ;  				
				}
				
			}else if((C > B) && (C > D)) {
				Decrescente += " " + C  + " " ;
				if (B > D){						
					Decrescente += B + " " + D ;						
				}else{
					Decrescente += D + " " + B ;  				
				}
			
			}else {
				Decrescente += " " + D  + " " ;
				if (B > C){						
					Decrescente += B + " " + C ;						
				}else{
					Decrescente += C + " " + D ;  				
				}
			}
	}else if((B > A) && (B > C) &&  (B > D)){
		Decrescente += " " + B ;				
			if((A > C) && (A > D)){					
				Decrescente += " " + A  + " " ;		
				if (C > D){						
					Decrescente += C + " " + D ;						
				}else{
					Decrescente += D + " " + C ;  				
				}
			
			}else if((C > A) && (C > D)) {
				Decrescente += " " + C  + " " ;
				if (A < D){						
					Decrescente += A + " " + D ;						
				}else{
					Decrescente += D + " " + A ;  				
			}
		
			}else {
				Decrescente += " " + D  + " " ;
				if (A > C){						
					Decrescente += A + " " + C ;						
				}else{
					Decrescente += C + " " + A ;  				
			}
			
		}	
	}else if((C > A) && (C > B) &&  (C > D)){
		Decrescente += " " + C ;				
			if((A > B) && (A > D)){					
				Decrescente += " " + A  + " " ;		
				if (B > D){						
					Decrescente += B + " " + D ;						
				}else{
					Decrescente += D + " " + B ;  				
			}
			
			}else if((B > A) && (B > D)) {
				Decrescente += " " + B  + " " ;
				if (A > D){						
					Decrescente += A + " " + D ;						
				}else{
					Decrescente += D + " " + A ;  				
			}
		
			}else {
				Decrescente += " " + D  + " " ;
			if (A > B){						
				Decrescente += A + " " + B ;						
			}else{
				Decrescente += B + " " + A ;  				
			}
			
		}
			
	}else {
		Decrescente +=  D ;				
		if((A > C) && (A > B)){					
			Decrescente += " " + A  + " " ;		
			if (C > B){						
				Decrescente += C + " " + B ;						
			}else{
				Decrescente += B + " " + C ;  				
			}
			
		}else if((C > A) && (C > B)) {
			Decrescente += " " + C  + " " ;
			if (A > B){						
				Decrescente += A + " " + B ;						
			}else{
				Decrescente += B + " " + A ;  				
			}
		
		}else {
			Decrescente += " " + B  + " " ;
			if (A > C){						
				Decrescente += A + " " + C ;						
			}else{
				Decrescente += C + " " + A ;  				
			}
			
		}
			
	}
		if(Contador == 0) {
			ConjuntoA += Conjunto; 
			CrescenteA += Crescente;
			DecrescenteA += Decrescente;
		}else if(Contador == 1) {
			ConjuntoB += Conjunto;
			CrescenteB += Crescente;
			DecrescenteB += Decrescente;
		}else if(Contador == 2) {
			ConjuntoC += Conjunto;
			CrescenteC += Crescente;
			DecrescenteC += Decrescente;
		}else if (Contador == 3){
			ConjuntoD += Conjunto;
			CrescenteD += Crescente;
			DecrescenteD += Decrescente;
		}else{
			ConjuntoE += Conjunto;
			CrescenteE += Crescente;
			DecrescenteE += Decrescente;		
		}
		Contador ++;
		}while(Contador<5); 
		System.out.println("-------------------");
		System.out.println(ConjuntoA);
		System.out.println(CrescenteA);
		System.out.println(DecrescenteA);
		System.out.println("-------------------");
		System.out.println(ConjuntoB);
		System.out.println(CrescenteB);
		System.out.println(DecrescenteB);
		System.out.println("-------------------");
		System.out.println(ConjuntoC);
		System.out.println(CrescenteC);
		System.out.println(DecrescenteC);
		System.out.println("-------------------");
		System.out.println(ConjuntoD);
		System.out.println(CrescenteD);
		System.out.println(DecrescenteD);
		System.out.println("-------------------");
		System.out.println(ConjuntoE);
		System.out.println(CrescenteE);
		System.out.println(DecrescenteE);
		System.out.println("-------------------");
			}			
	}
