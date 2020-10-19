package Array;

import javax.swing.*;

public class ExercicioMatriz {

    public static void main(String[] args) {

        int ordemMatriz = Integer.parseInt(JOptionPane.showInputDialog("Digite a ordem da matriz"));
        int[][] matriz = new int[ordemMatriz][ordemMatriz];
        int somaDP = 0;
        int somaDS = 0;
        int maiorPrincipal = 0;
        int maiorSecundario = 0;

        for (int l = 0; l < ordemMatriz; l++) {
            for (int c = 0; c < ordemMatriz; c++) {
                matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Coluna [" + l + "] -  Linha [" + c + "]"));

                if (l == c) {
                    somaDP += matriz[l][c];
                } else if (matriz[l][c] > maiorPrincipal)
                    maiorPrincipal = matriz[l][c];

                if (l + c == ordemMatriz - 1) {
                    somaDS += matriz[l][c];
                } else if (matriz[l][c] > maiorSecundario) {
                    maiorSecundario = matriz[l][c];
                }

            }
        }

        for (int l = 0; l < ordemMatriz; l++) { // laço de impressão
            for (int c = 0; c < ordemMatriz; c++) {
                System.out.print(matriz[l][c] + "\t");
            }
            System.out.println(" ");

        }
        System.out.println(somaDP);
        System.out.println(somaDS);
        System.out.println(maiorPrincipal);
        System.out.println(maiorSecundario);
    }
}


