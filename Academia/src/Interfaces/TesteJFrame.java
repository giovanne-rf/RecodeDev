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

    public void centralizar () {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();

        if (janela.height > screen.height) {
            setSize(janela.width, screen.height);

            if (janela.width > screen.width) {
                setSize(screen.width, janela.width);
                setLocation((screen.width - janela.width) / 2, (screen.height - janela.width) / 2);
            }
        }
    }

        public JLabel CriarJLabel(){
            JLabel jl = new JLabel();
            jl.setText("JLabel inserido");
            jl.setLocation(10,10);
            jl.setSize(370,50);
            JTextField jt = new JTextField();
            jt.setToolTipText("Insira o texto");
            jt.setHorizontalAlignment(JTextField.TOP);
            jl.setOpaque(true);
            jl.setBackground(new Color(255, 255, 255));
            jl.setForeground(new Color(0,0,0));
            jl.setFont(new Font( "Courier new", Font.BOLD, 12));
            jl.setToolTipText("JLabel Exemplo");
            jl.setHorizontalAlignment(SwingConstants.LEFT);
            jl.setVerticalAlignment(SwingConstants.TOP);
            return jl;

        }



    public static void main(String[] args) {
        TesteJFrame janela = new TesteJFrame();
        janela.setVisible(false);
        janela.CriarJLabel();


    }
}
