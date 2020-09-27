package br.com.hermes.Validacao;

import br.com.hermes.excecoes.numeroInvalidoException;
import br.com.hermes.processos.Processo;

public class validarProcesso {

    private validarProcesso(){};

    public static void processo (Processo processo){
        if (processo.getNumero().length() < 25){
            throw new numeroInvalidoException(processo.getNumero());
        }
    }

}
