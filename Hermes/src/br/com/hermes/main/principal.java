package br.com.hermes.main;

import br.com.hermes.processos.Processo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class principal {

    public static void main(String[] args) {

        String numeroProcesso =  "0002563-20.2020.5.06.0001";
        List<String> processo = new ArrayList<>();
        processo.add(String.valueOf(numeroProcesso.split(".")));

        ArrayList<Processo> lista = new ArrayList<Processo>();
        lista.add(new Processo("0002563-20.2020.5.06.0001", "Giovanne Alves"));
        lista.add(new Processo("0002023-30.2020.5.06.0001", "Eryca Alves"));
        lista.add(new Processo("0025631-40.2020.5.06.0001", "Matheus Alves"));

        System.out.println(lista);
        System.out.println(lista.get(2));
        System.out.println(lista.get(2));
        System.out.println(processo.get(0));

        for (Processo p: lista){
            System.out.println("Autor:  "+p.autores + " ano da distribuição: "+ p.ano);
        }







    }
}
