package br.digitalhouse.exception;

public class Principal {

    public static void main(String[] args) {

        CalculoMatematico calculo = new CalculoMatematico();

        calculo.divisão(4,0);
    }
}
