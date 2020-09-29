package br.com.hermes.Validacao;

import br.com.hermes.excecoes.numeroInvalidoException;
import br.com.hermes.processos.Processo;

public class validarProcesso {

    private validarProcesso(){};

    public static void processo (String processo){

        if (processo.length() <25 || processo.length()>25){
            throw new numeroInvalidoException(processo);
        }
    }
}
