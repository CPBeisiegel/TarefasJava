package br.digitalhouse.bancoSantanderExercicio;

public class Principal {

    public static void main(String[] args) {

        Clientes novoClientes = new Clientes();

        novoClientes.setNome("Jessica");
        novoClientes.setCpf("0000000000");

        ContaCorrente novaContaCorrente = new ContaCorrente();

        novaContaCorrente.setClientes(novoClientes);
        novaContaCorrente.deposito(244);

        novaContaCorrente.saque(20);
    }

}
