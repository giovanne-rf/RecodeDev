package br.com.hermes.main;

import br.com.hermes.Validacao.validarProcesso;
import br.com.hermes.excecoes.numeroInvalidoException;
import br.com.hermes.processos.Processo;

public class principal {

    public static void main(String[] args) {
        try {
            Processo processo = new Processo ("00000451-10.2020.6.06.0001");
            System.out.println(processo.getNumero());
            System.out.println(processo.getAno());
            System.out.println(processo.getJurisdicao());
            System.out.println(processo.getTribunal());
            System.out.println(processo.getVara());

        } catch (numeroInvalidoException e){
            System.out.println(e.getMessage());
        }




    }
}
