package br.digitalhouse.exercicioJavaSemObjeto;

import java.util.ArrayList;
import java.util.List;

public class Exercicio4SemObjeto {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<> ();

        numeros.add(4);
        numeros.add(6);
        numeros.add(10);
        numeros.add(7);

        int soma = 0;

        for(int i =0; i < numeros.size(); i++){

            soma = soma + numeros.get(i);

        }

        System.out.println("A soma do numeros é: " + soma);

    }
}
