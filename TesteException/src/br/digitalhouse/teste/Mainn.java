package br.digitalhouse.teste;

public class Mainn {
    public static void main(String[] args) {

        try {
            Pessoa pessoa = new Pessoa();
            System.out.println(pessoa.getRg() + 0000);
        } catch (java.lang.Exception e){
            System.out.println("Ocorreu um erro " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Aconteceu o print dentro do finally");
        }
    }
}