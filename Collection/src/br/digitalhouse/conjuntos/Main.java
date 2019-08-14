package br.digitalhouse.conjuntos;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Erika");
        conjunto.add("Jessica");
        conjunto.add("Camila");
        conjunto.add("Rafa");


        for(String valor: conjunto){
            System.out.println(valor);
        }

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(3, "Compramos 20 sapatos");
        mapa.put(2, "Qual é o filme ?");
        mapa.put(1,"Confissões de uma Shopaholic");
        mapa.put(1,"Confissões");

        String vida = mapa.get(1);
        String viver = mapa.get(2);
        System.out.println(vida);
        System.out.println(viver);


        List<String> lista = new ArrayList<>();
        lista.add("Camila");
        lista.add("Camila");
        lista.add("Irinilda");
        lista.add("Joao das Neves");

        for(String valor :lista){
            System.out.println(valor);
        }

        String valor = lista.get(3);
        System.out.println(valor);

    }

}
