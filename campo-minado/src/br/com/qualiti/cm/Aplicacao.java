package br.com.qualiti.cm;

import br.com.qualiti.cm.modelo.Tabuleiro;

public class Aplicacao {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
        tabuleiro.abrir(3 , 3);
        tabuleiro.alterarMarcacao(4,4);
        tabuleiro.alterarMarcacao(4,5);
        System.out.println(tabuleiro);


    }
}
