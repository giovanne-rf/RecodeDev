package GerenciadoresLayout;
import java.awt.*;
import javax.swing.*;
class TesteFlowLayout extends JFrame{

    public TesteFlowLayout(){
        //Titulo da janela
        setTitle("Teste FlowLayout");
        //Define um tamanho inicial para a janela
        setSize(300,120);
        //cor de fundo da janela no padrão RGB (Red Green Blue)
        getContentPane().setBackground(new Color(255,255,255));
        //provoca o termino da execução (encerra o programa)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        centralizar();
        //Cria um flowlayout alinhando seus componentes ah esquerda
        //e definindo o espaçamento horizontal e vertical entre eles
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 10, 10);

        getContentPane().setLayout(fl);

        JButton b1 = new JButton("Botao 1");
        JButton b2 = new JButton("Botao 2");
        JButton b3 = new JButton("Botao 3");
        JButton b4 = new JButton("Botao 4");
        JButton b5 = new JButton("Botao 5");

        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(b5);

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
        TesteFlowLayout janela = new TesteFlowLayout();
        janela.setVisible(true);
    }
}
