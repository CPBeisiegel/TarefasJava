package br.digitalhouse.exercicioJavaSemObjeto;

import java.util.ArrayList;
import java.util.List;

public class Exercicios5SemObjeto {

    public static void main(String[] args) {

        List<Integer> numerosPares = new ArrayList<>();

        numerosPares.add(2);
        numerosPares.add(6);
        numerosPares.add(7);
        numerosPares.add(8);
        numerosPares.add(9);

        int soma = 0;

        for(int i =0; i < numerosPares.size();i++){
            if(numerosPares.get(i)%2==0){
                soma = soma + numerosPares.get(i);
                System.out.println(soma);
            }
        }

    }
}
