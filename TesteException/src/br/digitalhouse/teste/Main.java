package br.digitalhouse.teste;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        try {
            ArrayList<String> lista = new ArrayList<>();

            lista.add("Joao");
            lista.add("Jessica");
            lista.add("Tarantino");

            System.out.println(lista.get(3));
        } catch (java.lang.Exception e) {
            System.out.println("Ocorreu um erro " + e.getMessage());
            e.printStackTrace();
        }
    }
}
