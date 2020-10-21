package GerenciadoresLayout;

import java.awt.*;
import javax.swing.*;
class TesteJPanel extends JFrame{
    JButton b1, b2;
    JPanel p1, p2;
    public TesteJPanel(){
        //Titulo da janela
        setTitle("Teste JPanel");
        //tamanho da janela
        setSize(200,200);
        // anula o layout padrao
        getContentPane().setLayout(null);
        //cor de fundo da janela no padrão RGB (Red Green Blue)
        getContentPane().setBackground(new Color(255,255,255));
        //provoca o termino da execução (encerra o programa)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        centralizar();

        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(10, 10, 170, 70);
        p1.setBackground(Color.BLUE);

        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(10,90,170,70);
        p2.setBackground(Color.YELLOW);

        b1 = new JButton("Gravar");
        b1.setBounds(35, 30, 100, 30);
        b2 = new JButton("Sair");
        b2.setBounds(35, 30, 100, 30);

        p1.add(b1);
        p2.add(b2);
        getContentPane().add(p1);
        getContentPane().add(p2);
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
        TesteJPanel janela = new TesteJPanel();
        janela.setVisible(true);
    }
}
