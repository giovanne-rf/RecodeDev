package Interfaces;

import javax.swing.*;
import java.awt.*;

public class TesteJFrame extends JFrame {

    public TesteJFrame (){

        setTitle("Primeira Janela Swing");

        setSize(500,500);

        getContentPane().setLayout(null);

        getContentPane().setBackground(new Color(155,200,100));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void centralizar (){
        Dimension screen =  Toolkit.getDefaultToolkit().getScreenSize();

        Dimension janela  = getSize();

        if (janela.height > screen.height){
            setSize(janela.width, screen.height);

        if (janela.width >screen.width){
            setSize(screen.width, janela.width);
            setLocation((screen.width - janela.width) / 2 ,(screen.height - janela.width) / 2);
        }
        }
    }

    public static void main(String[] args) {
        TesteJFrame janela = new TesteJFrame();
        janela.setVisible(true);
        janela.centralizar();
    }
}
