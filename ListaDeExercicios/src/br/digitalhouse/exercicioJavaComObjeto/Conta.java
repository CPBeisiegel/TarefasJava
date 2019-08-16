package br.digitalhouse.exercicioJavaComObjeto;

public class Conta {

    private double numeroDaConta;
    private int saldo;
    private Cliente titular;

    public int getSaldo() {
        return saldo;
    }

    public double getNumeroDaConta() {
        return numeroDaConta;
    }

    public Cliente getTitular() {
        return titular;
    }
}
