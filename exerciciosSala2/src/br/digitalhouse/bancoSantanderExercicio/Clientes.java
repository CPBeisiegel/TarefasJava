package br.digitalhouse.bancoSantanderExercicio;

import javafx.scene.paint.Stop;

public class Clientes {
    private String numeroCliente;
    private String sobrenome;
    private String rg;
    private String cpf;


    public Clientes(String novoNumeroCliente, String novoSobrenome){
        numeroCliente = novoNumeroCliente;
        sobrenome = novoSobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }
}

