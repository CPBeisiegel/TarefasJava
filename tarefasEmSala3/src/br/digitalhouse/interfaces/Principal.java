package br.digitalhouse.interfaces;

public class Principal {

    public static void main(String[] args) {

        Cachorro novoCachorro = new Cachorro("Golden");
        novoCachorro.animalSaudavel("do veterinário");

        novoCachorro.setIdade(10);
        int idadeAnimal = novoCachorro.caculoIdadeAnimal(90);
        System.out.println("A idade total é " + idadeAnimal);
    }

}
