package br.com.hermes.processos;

import br.com.hermes.excecoes.numeroInvalidoException;

import java.util.ArrayList;
import java.util.List;

public class Processo {

    String numero;
    private String autor;
    private String reu;
    private String ano;
    private String jurisdicao ;
    private String tribunal ;
    private String vara ;

    public Processo(String numero) {
//        if (numero.length()<25){
//            throw new numeroInvalidoException(numero);
//        }
        this.numero = numero;
//        this.ano = numero.substring(11, 15);
//        this.jurisdicao = numero.substring(16,17);
//        this.tribunal = numero.substring(18,20);
//        this.vara = numero.substring(21,25);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAno() {
        return ano;
    }

    public String getJurisdicao() {
        return jurisdicao;
    }

    public String getTribunal() {
        return tribunal;
    }

    public void setTribunal(String tribunal) {
        this.tribunal = tribunal;
    }

    public String getVara() {
        return vara;
    }
}
