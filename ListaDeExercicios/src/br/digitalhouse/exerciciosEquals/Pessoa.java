package br.digitalhouse.exerciciosEquals;

public class Pessoa {


    public Pessoa (String nome, Integer RG){
        this.nome = nome;
        this.RG = RG;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", RG=" + RG +
                '}';
    }

    @Override
    public boolean equals(Object umPessoa) {
        if(this == umPessoa){
            return true;
        }
        if(!(umPessoa instanceof Pessoa)){
            return false;
        }
        return this.getRG() == ((Pessoa) umPessoa).getRG();

    }

    private String nome;
    private Integer RG;

    public String getNome() {
        return nome;
    }

    public Integer getRG() {
        return RG;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRG(Integer RG) {
        this.RG = RG;
    }



}
