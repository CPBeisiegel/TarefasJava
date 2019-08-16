package br.digitalhouse.exerciciosEquals;

public class Coca {

    private Integer tamanho;
    private Double preco;

    public Coca(Integer tamanho, double preco){
        this.tamanho = tamanho;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Coca{" +
                "tamanho=" + tamanho +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object umaCoca) {
        if(this == umaCoca ){
            return true;
        }
        if(!(umaCoca instanceof Coca)){
            return false;
        }
        return this.getTamanho() == ((Coca)umaCoca).getTamanho();
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
