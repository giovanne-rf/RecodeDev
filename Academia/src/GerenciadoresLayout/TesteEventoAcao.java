package GerenciadoresLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class TesteEventoAcao extends JFrame implements ActionListener{
    JLabel l1;
    JButton b1, b2;
    int i1, i2;
    public TesteEventoAcao(){
        setTitle("Teste Evento Acao");
        //tamanho da janela
        setSize(240,100);
        // anula o layout padrao
        getContentPane().setLayout(null);
        //cor de fundo da janela no padrão RGB (Red Green Blue)
        getContentPane().setBackground(new Color(255,255,255));
        //provoca o termino da execução (encerra o programa)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        centralizar();
        i1 = i2 = 0;
        b1 = new JButton("Gravar");
        b1.setBounds(10, 10, 100, 30);
        b1.addActionListener(this);
        b2 = new JButton("Sair");
        b2.setBounds(120, 10, 100, 30);
        b2.addActionListener(this);
        l1 = new JLabel("Pressione os botões");
        l1.setBounds(5, 50, 220, 20);
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(l1);
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
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == b1)
            l1.setText("Botão gravar pressionado " + ++i1 + " vez(es)");
        if (e.getSource() == b2)
            l1.setText("Botão sair pressionado " + ++i2 + " vez(es)");
    }
    public static void main(String [] args){
        TesteEventoAcao janela = new TesteEventoAcao();
        janela.setVisible(true);
    }
}
