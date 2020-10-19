package PoliMorfismo;

import javax.swing.*;

public class TestePolimorfismo {

    public static void main(String args[]) {

        Bicho b;
        if (JOptionPane.showInputDialog(null, "qual o animal?").equalsIgnoreCase("Cachorro")){
            b = new Cachorro();
        } else {
            b = new Gato();
        }
        b.fala();
    }
}
