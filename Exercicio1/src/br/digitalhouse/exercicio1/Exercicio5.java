package br.digitalhouse.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Exercicio5 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(6);
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);
        numbers.add(8);
        numbers.add(13);

        int somapares = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)%2 == 0) {
                somapares = somapares + numbers.get(i);
            }
        }

        System.out.println("A soma dos numeros pares é " + somapares);
    }
}
