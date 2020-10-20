package Interfaces;

import javax.swing.*;
import java.awt.*;

public class TesteJFrame extends JFrame {

    public TesteJFrame (){

        setTitle("Primeira Janela Swing");

        setSize(500,500);

        getContentPane().setLayout(null);

        getContentPane().setBackground(new Color(255,255,255));

    }

    public static void main(String[] args) {
        TesteJFrame janela = new TesteJFrame();
        janela.setVisible(true);
    }
}
