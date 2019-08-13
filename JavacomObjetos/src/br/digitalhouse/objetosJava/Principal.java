package br.digitalhouse.objetosJava;

public class Principal {

    public static void main(String[] args){

        Animal animalMamifero;
        animalMamifero = new Animal("Bidu");

        animalMamifero.setNomeAnimal("Lulu");
        System.out.println(animalMamifero.getNomeAnimal());
        System.out.println(animalMamifero.getRaca());
        System.out.println(animalMamifero.getCor());
        System.out.println(animalMamifero.getIdade());

        Animal animalDomestico = new Animal();

        // atribui fora
        animalDomestico.setNomeAnimal("Ted");
        System.out.println(animalDomestico.getNomeAnimal());

        System.out.println("********************************************************************************");

        // Novo objeto
        Pessoa pessoaJovem = new Pessoa("Erika");

        System.out.println(pessoaJovem.getNomePessoa());

        // dando atributo
        animalDomestico.setDonoAnimal(pessoaJovem);

        System.out.println(animalDomestico.getDonoAnimal().getNomePessoa());

        Pessoa pessoaIdosa = new Pessoa("Clotilde");

        animalDomestico.setDonoAnimal(pessoaIdosa);
    }



}
