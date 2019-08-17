package br.digitalhouse.exception;

public class CalculoMatematico {

    public int divisão(int numero1, int numero2 ){
        int divisao =0;
        try{
            divisao = numero1/numero2;
        } catch (ArithmeticException ex){
            System.out.println("A operação não pode ser realizada");
            return 0;
        }
        return divisao;
    }


}
