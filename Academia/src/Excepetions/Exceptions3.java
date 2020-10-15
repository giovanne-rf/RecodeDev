package Excepetions;

import javax.swing.*;

public class Exceptions3 {

    public static void main(String[] args) {

        String str;
        String mensagem =  "Digite a informação";
        int icone = JOptionPane.INFORMATION_MESSAGE;

        str = JOptionPane.showInputDialog(null, "msg", icone);
        char c = str.charAt(0);

    }
}
