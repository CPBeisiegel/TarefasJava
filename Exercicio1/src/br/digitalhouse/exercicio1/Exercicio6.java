package br.digitalhouse.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Exercicio6 {

    public static void main(String[] args) {

        List<Integer> numbers1 = new ArrayList<>();

        numbers1.add(2);
        numbers1.add(6);
        numbers1.add(5);
        numbers1.add(8);
        numbers1.add(10);
        numbers1.add(8);
        numbers1.add(13);

        List<Integer> numerosPares = new ArrayList<>();

        for (int i = 0; i < numbers1.size(); i++) {
            if (numbers1.get(i)%2 == 0) {
                numerosPares.add(numbers1.get(i));
            }
        }
        System.out.println(numerosPares);

        }
    }

