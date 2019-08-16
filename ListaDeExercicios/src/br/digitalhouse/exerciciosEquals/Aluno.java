package br.digitalhouse.exerciciosEquals;

public class Aluno {

    private String nome;
    private Integer numeroDeAluno;

    public Aluno(String nome, Integer numeroDeAluno){
        this.nome = nome;
        this.numeroDeAluno = numeroDeAluno;
    }

    @Override
    public boolean equals(Object umAluno) {
        if(this == umAluno ){
            return true;
        }
        if(!(umAluno instanceof Aluno)){
            return false;
        }
        return this.getNumeroDeAluno() == ((Aluno) umAluno ).getNumeroDeAluno();
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", numeroDeAluno=" + numeroDeAluno +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumeroDeAluno() {
        return numeroDeAluno;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroDeAluno(Integer numeroDeAluno) {
        this.numeroDeAluno = numeroDeAluno;
    }
}

