package GerenciadoresLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Login extends ModeloJFrame implements ItemListener, ActionListener  {

    JTextField cpf, cpfDigito, rg, rgDigito, nome, nascimento, profissao, situacao;
    JComboBox<String> sexo, falecido;

    public Login (String title) {
        setTitle(title);
        int largura=1000, altura=400;
        setSize(largura, altura);
        setLocationRelativeTo(null);
        largura -=30;
        int x=10, y=10, l=0, a=25;
        add(criarJLabel("CPF:", x, y, 100, a));
        cpf = criarJTextField(x+=100, y, 120, a);
        add(cpf);

        add(criarJLabel("-", x+=120, y, 10, a));
        cpfDigito = criarJTextField(x+=10, y, 30, a);
        add(cpfDigito);

        add(criarJLabel("RG:", x+=60, y, 30, a));
        rg = criarJTextField(x+=30, y, 120, a);
        add(rg);

        add(criarJLabel("-", x+=120, y, 10, a));
        rgDigito = (criarJTextField(x+=10, y, 30, a));
        add(rgDigito);
        int v=a+10;
        y+=v;//Segunda linha
        add(criarJLabel("Nome:", x=10, y, 100, a));
        nome = criarJTextField(x+=100, y, largura-x, a);
        add(nome);

        y+=v;//Terceira linha
        add(criarJLabel("Sexo:", x=10, y, 100, a));
        sexo = criarJComboBox(x+=100, y, 100, a);
        add(sexo);
        sexo.addItem("Masculino");
        sexo.addItem("Feminino");
        sexo.setSelectedIndex(-1);
        sexo.addActionListener(this);

        add(criarJLabel("Nascimento:", x+=130, y, 100, a));
        nascimento = criarJTextField(x+=100, y, 200, a);
        add(nascimento);

        add(criarJLabel("Falecido:", x+=230, y, 80, a));
        falecido = criarJComboBox(x+=80, y, 100, a);
        add(falecido);
        falecido.addItem("Sim");
        falecido.addItem("Não");
        falecido.setSelectedIndex(-1);
        falecido.addActionListener(this);
        setResizable(false);//impede a alteração do tamanho da tela
        y+=v;//Quarta linha
        add(criarJLabel("Profissão:", x=10, y, 100, a));
        profissao = criarJTextField(x+=100, y, 300, a);
        add(profissao);

        add(criarJLabel("Situação:", x+=330, y, 90, a));
        situacao = criarJTextField(x+=90, y, largura-x, a);
        add(situacao);
    }

    public static void main(String[] args)
    {
        String title;
        title = "LOGIN";
        Login janela = new Login(title);
        //janela.setVisible(true);
    }

    public JLabel criarJLabel(String label, int left, int top, int w, int h) {
        JLabel jl = new JLabel();
        jl.setText(label);
        jl.setLocation(left, top);
        jl.setSize(w, h);
        jl.setForeground(new Color(0, 0, 0));
        jl.setFont(new Font("Courier new", Font.BOLD, 14));
        jl.setToolTipText(label);
        return jl;
    }
    public JTextField criarJTextField(int left, int top, int w, int h) {
        JTextField jt = new JTextField();
        jt.setHorizontalAlignment(JTextField.LEFT);
        jt.setBounds(left, top, w, h);
        return jt;
    }

    public JComboBox<String> criarJComboBox(int left, int top, int w, int h) {
        JComboBox<String> jt = new JComboBox<>();
        jt.setBounds(left, top, w, h);
        return jt;
    }

    public void actionPerformed(ActionEvent e) {

    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == sexo) {
            System.out.println("Selecionado: " + sexo.getSelectedItem());
            System.out.println(e.getStateChange());
        } else if (e.getSource() == falecido) {
            System.out.println("Selecionado: " + falecido.getSelectedItem());
        }
    }

}
