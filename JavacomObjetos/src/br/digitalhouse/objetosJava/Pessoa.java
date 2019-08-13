package br.digitalhouse.objetosJava;

public class Pessoa {

    private String nomePessoa;

    //construtor especifico
    public Pessoa(String novoNome){
        nomePessoa = novoNome;
    }

    // get

    public String getNomePessoa() {
        return nomePessoa;
    }

    //set


    public void setNomePessoa(String novoNome) {
        nomePessoa = novoNome;
    }
}
