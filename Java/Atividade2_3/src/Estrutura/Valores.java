package Estrutura;

public class Valores {

private String nome;
private String senha;

public String getSenha(){
  return this.senha ;
}

public void setSenha(String Senha){
  this.senha = Senha ;
}

public String getNome(){
  return this.nome ;
}

public void setNome(String Nome){
  this.nome = Nome ;
}

    private String atividades;
    private String materias;
    private String datas;
    private String respostas;
    private String totais;

    public String getMateria() {
        return materias;
    }

    public void setMateria(String materia) {
        this.materias = materia;
    }

    public String getData() {
        return datas;
    }

    public void setData(String data) {
        this.datas = data;
    }

    public String getAtividade() {
        return atividades;
    }

    public void setAtividade(String atividade) {
        this.atividades = atividade;
    }


    public String getRespostas() {
        return respostas;
    }

    public void setRespostas(String respostas) {
        this.respostas = respostas;
    }

    public String getTotais() {
        return totais;
    }

    public void setTotais(String totais) {
        this.totais = totais;
    }

    
    
}

