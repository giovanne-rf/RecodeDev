package br.com.qualiti.cm.visao;

import br.com.qualiti.cm.excecao.ExplosaoException;
import br.com.qualiti.cm.excecao.SairException;
import br.com.qualiti.cm.modelo.Tabuleiro;

import java.util.Scanner;

public class TabuleiroConsole {
    private Tabuleiro tabuleiro;
    private Scanner entrada = new Scanner(System.in);

    public TabuleiroConsole (Tabuleiro tabuleiro){
        this.tabuleiro = tabuleiro;

        executarJogo();
    }

    private void executarJogo() {
        try{
            boolean continuar =  true;

            while (continuar){
                cicloDoJogo();
                
                System.out.println("Outra partida? (S/n) ");
                String resposta = entrada.nextLine();
                if ("n".equalsIgnoreCase(resposta)){
                    continuar = false;
                } else {
                    tabuleiro.reiniciar();
                }
            }

        } catch (SairException e){
            System.out.println("TCHAU !!!");
        } finally {
            entrada.close();;
        }
    }

    private void cicloDoJogo() {
        try{

        } catch (ExplosaoException e){
            System.out.println("Você");
        }

    }


}
