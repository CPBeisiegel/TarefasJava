package br.digitalhouse.exercicioImpressora;

public class Documento implements Imprimivel {

    private String nome;
    private String tipo;


    public Documento (String novoNome, String novoTipo){
        nome = novoNome;
        tipo = novoTipo;

    }

    @Override
    public void imprimir() {
        System.out.println("Sou um documento word");

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
