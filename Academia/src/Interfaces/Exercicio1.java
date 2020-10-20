package Interfaces;

import javax.swing.*;
import java.awt.*;

public class Exercicio1 extends  JFrame{


    public static void main(String[] args) {
        Exercicio1 novaJanela = new Exercicio1();
        novaJanela.setVisible(true);

    }

    public Exercicio1 (){
        setTitle(JOptionPane.showInputDialog("Digite o título da janela"));
        int largura = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura da janela"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura da janela"));
        int r = Integer.parseInt(JOptionPane.showInputDialog("Digite R"));
        int g = Integer.parseInt(JOptionPane.showInputDialog("Digite G"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite B"));

        setSize(largura, altura);
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(r,g,b));
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

    public JLabel CriarJLabel(){
        JLabel jl = new JLabel();
        jl.setText("JLabel inserido");
        jl.setLocation(10,10);
        jl.setSize(370,50);
        jl.setOpaque(true);
        jl.setBackground(new Color(255, 255, 255));
        jl.setForeground(new Color(0,0,0));
        jl.setFont(new Font( "Courier new", Font.BOLD, 12));
        jl.setToolTipText("JLabel Exemplo");
        jl.setHorizontalAlignment(SwingConstants.LEFT);
        jl.setVerticalAlignment(SwingConstants.TOP);
        return jl;
    }
}
