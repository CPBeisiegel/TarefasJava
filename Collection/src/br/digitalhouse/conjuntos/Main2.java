
package br.digitalhouse.conjuntos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {

        Map<Integer, String> numeros = new HashMap<>();
        numeros.put(0,"Ovos");
        numeros.put(1, "Água");
        numeros.put(2, "Escopeta");
        numeros.put(3, "Cavalo");
        numeros.put(4, "Dentista");
        numeros.put(5, "Fogo");

        for(Integer chave :numeros.keySet()){
            String valor = numeros.get(chave);
            System.out.println(numeros);
        }

        Map<String, String> lista = new HashMap<>();
        lista.put("Joao "," Juan,Fissura,Maromba");
        lista.put("Miguel "," Night Watch, Bruce Wayne, Tampinha");
        lista.put("Maria ", " Wonder Woman, Mary, Marilene");
        lista.put("Lucas "," Lukinha, Jorge, George");



        for(String chave : lista.keySet()){
            String value = lista.get(chave);
            System.out.println(chave + " apelidos " + value);
        }



    }
}
