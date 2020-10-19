package Array;

import javax.swing.*;

public class Matriz {

    public static void main(String[] args) {

        int[][] matriz = new int[5][4];

        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 4; c++) {
                if (l < 4 && c < 3) {
                    matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Coluna [" + l + "] -  Linha [" + c + "]"));

                } else if (c == 3) {
                    matriz[l][c] = matriz[l][0] + matriz[l][1] + matriz[l][2];

                } else if (l == 4) {
                    matriz[l][c] = matriz[0][c] + matriz[1][c] + matriz[2][c] + matriz[3][c];

                }
            }
        }
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 4; c++) {
                System.out.print(matriz[l][c] + "\t");
            }
        }
    }
}
