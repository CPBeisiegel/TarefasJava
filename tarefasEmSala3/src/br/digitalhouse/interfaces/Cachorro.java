package br.digitalhouse.interfaces;

public class Cachorro extends Animal implements Saudavel {

    public Cachorro(String novaRaca){
        super(novaRaca);
    }

    @Override
    public boolean animalSaudavel(String diagnostico) {
        if(diagnostico != null || !diagnostico.equals("")) {
            System.out.println("O cachorro " + getRaca() + "está muito mal de acordo com o seguinte " + diagnostico);
            return true;
        } else{

            System.out.println("Não possui diagnostico");
            return false;
        }

    }

    @Override
    public int caculoIdadeAnimal(int novaIdade) {
        System.out.println("Estamos somando as idades");
        return getIdade() + novaIdade;
    }

    @Override
    public void seDivertir() {

    }
}
