package br.digitalhouse.conjuntos;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(5);
        listaNumeros.add(5);
        listaNumeros.add(6);
        listaNumeros.add(7);
        listaNumeros.add(8);
        listaNumeros.add(8);
        listaNumeros.add(8);

        for(Integer valor : listaNumeros){
            System.out.println(valor);
        }

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(5);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(8);
        lista.add(8);

        for(Integer valor : lista){
            System.out.println(valor);
        }

    }
}
