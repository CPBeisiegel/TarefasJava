package br.digitalhouse.exerciciosEquals;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pessoa umPessoa = new Pessoa ("Janete",252252525);
        Pessoa doisPessoa = new Pessoa("Juliana",24242424);

        System.out.println(umPessoa.equals(doisPessoa));

        Coca umaCoca = new Coca(10,20);
        Coca outraCoca = new Coca (10,20);

        System.out.println(umaCoca.equals(outraCoca));

        Aluno umAluno = new Aluno("Juliana",123);
        Aluno outroAluno = new Aluno("Valeria",124);
        Aluno outraAluno = new Aluno("Valiana",125);
        Aluno numaAluno = new Aluno("Valdomiro",1234);


        List<String> alunos = new ArrayList<>();
        alunos.add("umAluno");
        alunos.add("outroAluno");
        alunos.add("outraAluno");
        alunos.add("numaAluno");



        System.out.println(umAluno.equals(outroAluno));

        Funcionaria umaFuncionaria = new Funcionaria("Valesca",213);
        Funcionaria outraFuncionaria = new Funcionaria("Adriana", 214);

        System.out.println(umaFuncionaria.equals(outraFuncionaria));







    }
}
