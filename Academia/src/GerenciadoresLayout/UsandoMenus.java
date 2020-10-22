package GerenciadoresLayout;

/*O exemplo abaixo ilustra o uso de Menus*/
import java.awt.*;	import java.awt.event.*;	import javax.swing.*;

public class UsandoMenus extends JFrame implements ActionListener
{	JMenuBar BarraMenu = new JMenuBar();
    JMenu Arquivo = new JMenu ("Arquivo"); 	JMenu Editar = new JMenu ("Editar");
    JMenuItem Novo = new JMenuItem ("Novo"); 	JMenuItem Salvar = new JMenuItem ("Salvar");
    JMenuItem Abrir = new JMenuItem ("Abrir");
    JMenuItem Recarregar = new JMenuItem ("Recarregar");
    JMenuItem Sair = new JMenuItem ("Sair");
    JTextField T1 = new JTextField("Aqui teremos as respostas");

    UsandoMenus()
    { 	setTitle("UsandoMenus");
        setSize(270,250);
        setLocation(50,50);
        setResizable(false);
        setJMenuBar(BarraMenu);
        Arquivo.setMnemonic('A');
        Abrir.setMnemonic('b');
        Novo.setMnemonic('N');
        Recarregar.setMnemonic('e');
        Sair.setMnemonic('S');
        BarraMenu.add(Arquivo);	BarraMenu.add(Editar);
        Arquivo.add(Novo);	Arquivo.add(Salvar);Arquivo.add(Abrir);;Arquivo.add(Recarregar);	Arquivo.add(Sair);
        Novo.addActionListener(this);Salvar.addActionListener(this);Sair.addActionListener(this);
        getContentPane().add(T1);
    }

    public static void main (String args[])
    {	JFrame janela = new UsandoMenus();
        janela.setSize(250,250);
        janela.show();
        WindowListener x = new WindowAdapter()
        {  public void windowClosing(WindowEvent e)
        {    System.exit(0);   }  };
        janela.addWindowListener(x); }

    public void actionPerformed(ActionEvent e)
    { if (e.getSource()==Novo)
        T1.setText("Escolhido o item de Menu Novo");
        if (e.getSource()==Abrir)
            T1.setText("Escolhido o item de Menu Salvar");


        if (e.getSource()==Recarregar)
            T1.setText("Escolhido o item de Menu Salvar");
        if (e.getSource()==Salvar)
            T1.setText("Escolhido o item de Menu Salvar");
        if (e.getSource()==Sair)
            System.exit(0);      } 		}
