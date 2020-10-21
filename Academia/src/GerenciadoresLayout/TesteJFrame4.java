package GerenciadoresLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class TesteJFrame4 extends JFrame implements ActionListener, ItemListener {
    JTextField cpf, cpfDigito, rg, rgDigito, nome, nascimento, profissao, situacao;
    JComboBox<String> sexo, falecido;
    public TesteJFrame4 (String title) {


        //Título da janela
        setTitle(title);
        //Tamanho da janela
        setSize(1000, 400);
        // Anula o layout padrão
        setLayout(null);


        // Cor de fundo da janela no padrão RGB (Red Green Blue)
        getContentPane().setBackground(new Color(173,216,230));

        //Provoca o término da execução (encerra o programa);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(criarJLabel("CPF:", 10, 10, 50, 25));
        cpf = criarJTextField(110, 10, 120, 25);
        add(cpf);

        add(criarJLabel("-", 240, 10, 10, 25));
        cpfDigito = criarJTextField(260, 10, 30, 25);
        add(cpfDigito);

        add(criarJLabel("RG:", 310, 10, 30, 25));
        rg = criarJTextField(350, 10, 120, 25);
        add(rg);

        add(criarJLabel("-", 480, 10, 10, 25));
        rgDigito = (criarJTextField(500, 10, 30, 25));
        add(rgDigito);

        add(criarJLabel("Nome:", 10, 60, 100, 25));
        nome = criarJTextField(110, 60, 600, 25);
        add(nome);

        add(criarJLabel("Sexo:", 10, 110, 100, 25));
        sexo = criarJComboBox(110, 110, 160, 25);
        sexo.addItem("Masculino");
        sexo.addItem("Feminino");
        sexo.setSelectedIndex(-1);
        sexo.addItemListener(this);
        add(sexo);


        add(criarJLabel("Nascimento:", 290, 110, 80, 25));
        nascimento = criarJTextField(380, 110, 200, 25);
        add(nascimento);

        add(criarJLabel("Falecido:", 600, 110, 100, 25));
        falecido = criarJComboBox(710, 110, 100, 25);
        add(falecido);
        falecido.addItem("Sim");
        falecido.addItem("Não");
        falecido.setSelectedIndex(-1);
        falecido.addItemListener(this);

        add(criarJLabel("Profissão:", 10, 160, 100, 25));
        profissao = criarJTextField(110, 160, 300, 25);
        add(profissao);

        add(criarJLabel("Situação:", 430, 160, 70, 25));
        situacao = criarJTextField(500, 160, 470, 25);
        add(situacao);
    }
    public static void main(String[] args) {
        String title;
        title = "Atualiza Dados Cadastrais";
        TesteJFrame4 janela = new TesteJFrame4(title);
        janela.setVisible(true);
    }
    public JLabel criarJLabel(String label, int left, int top, int w, int h) {
        JLabel jl = new JLabel();
        jl.setText(label);
        jl.setLocation(left, top);
        jl.setSize(w, h);
        //Torna opaco o fundo do rótulo
        jl.setOpaque(false);
        //jl.setBackground(new Color(255, 255, 255));
        jl.setForeground(new Color(0, 0, 0));
        jl.setFont(new Font("Courier new", Font.BOLD, 12));
        jl.setToolTipText(label);
        jl.setHorizontalAlignment(SwingConstants.LEFT);
        jl.setVerticalAlignment(SwingConstants.CENTER);

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

    public void actionPerformed(ActionEvent e)
    {

    }

    public void itemStateChanged(ItemEvent e)
    {
        if (e.getSource() == sexo) {
            System.out.println("Selecionado: "+ sexo.getSelectedItem());
        }
        else if (e.getSource() == falecido) {
            System.out.println("Selecionado: "+ falecido.getSelectedItem());
        }

    }

}
