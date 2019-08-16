package br.digitalhouse.exercicioImpressora;

public class Contrato implements Imprimivel {

    private String nome;
    private String tipo;

    public Contrato(String novoNome, String novoTipo){
        nome = novoNome;
        tipo = novoTipo;

    }

    @Override
    public void imprimir() {
        System.out.println("sou um contrato muito legal");

    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public void setTipo(String novoTipo) {
        tipo = novoTipo;
    }
}
