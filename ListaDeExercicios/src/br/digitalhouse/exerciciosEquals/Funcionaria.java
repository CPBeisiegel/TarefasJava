package br.digitalhouse.exerciciosEquals;

public class Funcionaria {

    private String nome;
    private Integer numeroDeRegistro;


    public Funcionaria(String nome, Integer numeroDeRegistro){
        this.nome = nome;
        this.numeroDeRegistro = numeroDeRegistro;
    }

    @Override
    public boolean equals(Object umaFuncionaria) {
        if(this == umaFuncionaria ){
            return true;
        }
        if(!(umaFuncionaria instanceof Funcionaria)){
            return false;
        }
        return this.getNumeroDeRegistro() == ((Funcionaria) umaFuncionaria ).getNumeroDeRegistro();
    }

    @Override
    public String toString() {
        return "Funcionaria{" +
                "nome='" + nome + '\'' +
                ", numeroDeRegistro=" + numeroDeRegistro +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroDeRegistro(Integer numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }
}
