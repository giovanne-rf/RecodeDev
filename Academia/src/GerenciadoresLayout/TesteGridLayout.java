package GerenciadoresLayout;

import java.awt.*;
import javax.swing.*;
class TesteGridLayout extends ModeloJFrame{

    public TesteGridLayout(){
        //Titulo da janela
        setTitle("Teste GridLayout");
        //Define um tamanho inicial para a janela
        setSize(300,150);

        GridLayout gl = new GridLayout(3,2,5,05); // linhas, colunas, esp esq direito entre linhas

        getContentPane().setLayout(gl);

        JButton b1 = new JButton("Linha 1 - Coluna 1");
        JButton b2 = new JButton("Linha 1 - Coluna 2");
        JButton b3 = new JButton("Linha 2 - Coluna 1");
        JButton b4 = new JButton("Linha 2 - Coluna 2");
        JButton b5 = new JButton("Linha 3 - Coluna 1");
        JButton b6 = new JButton("Linha 3 - Coluna 2");

        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(b5);
        getContentPane().add(b6);
        setLocationRelativeTo(null);
    }
    public void centralizar(){
        //obtém a altura e largura da resolução vídeo
        Dimension screen =
                Toolkit.getDefaultToolkit().getScreenSize();
        //obtém a altura e largura da minha janela
        Dimension janela = getSize();

        if (janela.height > screen.height)
            setSize(janela.width, screen.height);
        if (janela.width > screen.width)
            setSize(screen.width, janela.height);

        setLocation((screen.width - janela.width)/2,
                (screen.height - janela.height)/2);
    }
    public static void main(String [] args){
        TesteGridLayout janela = new TesteGridLayout();
        janela.setVisible(true);
    }
}

