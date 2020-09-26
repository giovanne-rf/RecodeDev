package br.com.qualiti.cm;

import br.com.qualiti.cm.modelo.Tabuleiro;
import br.com.qualiti.cm.visao.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6,6,8);
        new TabuleiroConsole(tabuleiro);
    }
}
