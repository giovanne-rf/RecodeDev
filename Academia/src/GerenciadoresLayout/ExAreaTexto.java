package GerenciadoresLayout;

import java.awt.*;	import java.awt.event.*;	import javax.swing.*;

public class ExAreaTexto extends JFrame implements ActionListener
{	JTextArea TA1,TA2;
    JTextField T1;
    JButton B1,B2;

    public static void main(String args[])
    {	JFrame Janela = new ExAreaTexto();
        Janela.setResizable(false);
        Janela.show();
        WindowListener x = new WindowAdapter()
        {  public void windowClosing(WindowEvent e)
        {    System.exit(0);   }  };
        Janela.addWindowListener(x); }

    ExAreaTexto()
    {   setSize(480,280);
        setTitle("Usando Áreas de Texto");
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        T1 = new JTextField(40);  T1.addActionListener(this);
        B1 = new JButton("Copia Tudo");   B1.addActionListener(this);
        B2 = new JButton("Copia Selecao");B2.addActionListener(this);
        TA1 = new JTextArea("Editor de texto:\n",5,40);
        TA2 = new JTextArea(5,40);
        JScrollPane painel1 = new JScrollPane(TA1);
        JScrollPane painel2 = new JScrollPane(TA2);
        Container c=getContentPane();
        c.add(painel1);  c.add(T1);c.add(B1);c.add(B2);c.add(painel2);
    }

    public void actionPerformed(ActionEvent e)
    { 	if (e.getSource()==T1) //ao pressionar ENTER no JTextField
    {   TA1.append(T1.getText()); 		//copie o conteúdo de T1 para a TA1
        T1.setText("");
    }
        if (e.getSource()==B1) 	//se o botão selecionado for o B1 (copia tudo)
            TA2.setText(TA1.getText()); //copia conteúdo de TA1 em TA2
        if (e.getSource()==B2) 	//se o botão selecionado for o B2 (copia seleção)
            TA2.setText(TA1.getSelectedText()); //copia o texto selecionado
    }	}
