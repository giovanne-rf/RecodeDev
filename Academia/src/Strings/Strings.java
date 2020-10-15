package Strings;

import javax.swing.*;

public class Strings {


    public static void main(String[] args) {

        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do mês: "));
        switch (mes) {
            case 1:case 2: case 3:
            System.out.println("Verão");
            break;

            case 4:  case 5:  case 6:
                System.out.println("Primavera");
                break;

            case 7:  case 8:   case 9:
                System.out.println("Inverno");
                break;

            case 10: case 11:            case 12:
                System.out.println("Outuno");
                break;
            default:

                System.out.println("Digite um mês valido");
                break;
        }
//        System.out.println("A estação do ano é " + mes);
    }
}
