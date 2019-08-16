package br.digitalhouse.exercicioImpressora;

import java.util.ArrayList;
import java.util.List;

public class Impressora {

    List<Imprimivel> fila = new ArrayList<>();

    public void imprimirTudo(){
        for(int i =0; i < fila.size();i++){
            fila.get(i).imprimir();
        }
    }

    public void adicionarImprimivel(Imprimivel arquivo){
        fila.add(arquivo);
    }
}
