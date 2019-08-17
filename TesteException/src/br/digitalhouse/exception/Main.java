package br.digitalhouse.exception;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        try {
//            ArrayList<String> lista = new ArrayList<>();
//            lista.add("Pato");
//            lista.add("Cachorro");
//            lista.add("Gato");
//
//            System.out.println(lista.get(3));
//        } catch (java.lang.Exception ex) {
//            System.out.println("Ocorreu um erro " + ex.getMessage());
//            ex.printStackTrace();
//        }
//
//        try{ArrayList<String> lista = new ArrayList<>();
//        lista.add("Pato");
//        lista.add("Cachorro");
//        lista.add("Gato");
//
//        System.out.println(lista.get(2));
//        } catch (java.lang.Exception exp) {
//            System.out.println("O animal é " + exp.getMessage());
//        }

        try {
            ArrayList<String> list = new ArrayList<>();
            System.out.println(list.get(5));
        } catch (java.lang.ArrayIndexOutOfBoundsException exq){
            System.out.println("Deu ruim " + exq.getMessage());
            exq.printStackTrace();
        } catch(java.lang.Exception exp){
            System.out.println("Deu muito ruim "+ exp.getMessage());
            exp.printStackTrace();
        }
    }
}