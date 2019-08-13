package br.digitalhouse.bancoSantanderExercicio;

public abstract class Conta {

    private double saldo;
    private Clientes cliente;

    public Clientes getCliente() {
        return cliente;
    }

    public double getsaldo() {
        return saldo;
    }

    public void setConsultarSaldo(double consultarSaldo) {
        this.saldo = consultarSaldo;
    }

    public void deposito(double quantia) {
        System.out.println();
        this.saldo = saldo + quantia;
    }

    public void saque(){

    }




}
