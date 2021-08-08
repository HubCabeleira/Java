package exemplo.oito;

public class Disponivel{
	public static void main(String args[]) {
	Colegiado definindo;
	definindo = new Colegiado(156.2513, 10, 20, 250);
	int limite = 20;
	int alunosTurma = (definindo.discentes)/limite ;
	Disponivel[] turma;
	turma = new Disponivel[definindo.turmas];
	try{
			System.out.println(turma[alunosTurma]);
	}catch(ArrayIndexOutOfBoundsException erro){
			System.out.println("Turmas insuficiêntes(LOTADO)");
	}catch(Exception erro){
			System.out.println("Erro de execução");
	}finally{
			System.out.println("Verificado");
	}
	}
}
