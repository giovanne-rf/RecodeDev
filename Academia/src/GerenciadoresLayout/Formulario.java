package GerenciadoresLayout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
public class Formulario extends JFrame implements ActionListener, ItemListener {
    JButton btnCalcular, btnCancelar;
    JTextField txtNum1, txtNum2, txtResultado;
    JRadioButton c1,c2,c3,c4,c5,c6;
    ButtonGroup bg = new ButtonGroup();
    double res=Double.MIN_VALUE;
    String numeros="";
    public Formulario(){
        setTitle("Formulario");
        setSize(640,450);
        GridLayout gl = new GridLayout(9,2,5,5);
        getContentPane().setLayout(gl);
        //provoca o termino da execucao (encerra o programa)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1 = new JRadioButton("Soma");
        c1.setBackground(new Color(180,180,180));
        c1.addItemListener(this);

        c2 = new JRadioButton("Subtração");
        c2.setBackground(new Color(180,180,180));
        c2.addItemListener(this);

        c3 = new JRadioButton("Multiplicação");
        c3.setBackground(new Color(180,180,180));
        c3.addItemListener(this);

        c4 = new JRadioButton("Divisão");
        c4.setBackground(new Color(180,180,180));
        c4.addItemListener(this);

        c5 = new JRadioButton("Potenciação");
        c5.setBackground(new Color(180,180,180));
        c5.addItemListener(this);

        c6 = new JRadioButton("Mega Sena");
        c6.setBackground(new Color(180,180,180));
        c6.addItemListener(this);

        bg.add(c1);
        bg.add(c2);
        bg.add(c3);
        bg.add(c4);
        bg.add(c5);
        bg.add(c6);

        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
        add(c6);

        JLabel lblNum1 = new JLabel("Número 1:");
        JLabel lblNum2 = new JLabel("Número 2:");
        JLabel lblNum3 = new JLabel("Resultado:");
        lblNum1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNum2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNum3.setHorizontalAlignment(SwingConstants.CENTER);

        getContentPane().add(lblNum1);

        txtNum1 = new JTextField();
        getContentPane().add(txtNum1);
        txtNum1.setHorizontalAlignment(SwingConstants.CENTER);

        getContentPane().add(lblNum2);
        txtNum2 = new JTextField();
        txtNum2.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(txtNum2);

        getContentPane().add(lblNum3);
        txtResultado = new JTextField();
        txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
        txtResultado.setEditable(false);
        getContentPane().add(txtResultado);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setMnemonic('C');
        getContentPane().add(btnCalcular);
        btnCalcular.addActionListener(this);

        btnCancelar = new JButton("Sair");
        btnCalcular.setMnemonic('S');
        getContentPane().add(btnCancelar);
        btnCancelar.addActionListener(this);
        setLocationRelativeTo(null);
        setVisible(true);
        JOptionPane.showMessageDialog(null, "Digite os números 1 e 2 e depois "
                + "\nClique na Operação desejada");
    }
    public static void main(String[] args) {
        new Formulario();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnCalcular)
        {
            if(res==Double.MIN_VALUE)
                txtResultado.setText(numeros);
            else
                txtResultado.setText(res+"");
        }
        else if (e.getSource()==btnCancelar)
            System.exit(0);
    }
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        {
            if ( e.getSource() == c1 )	//se o botão selecionado for o botão normal então
                txtResultado.setText("" + (Double.parseDouble(txtNum1.getText()) +
                        Double.parseDouble(txtNum2.getText())));

            else if ( e.getSource() == c2 )
                txtResultado.setText("" + (Double.parseDouble(txtNum1.getText()) -
                        Double.parseDouble(txtNum2.getText())));
            else if ( e.getSource() == c3 )
                txtResultado.setText("" + (Double.parseDouble(txtNum1.getText()) *
                        Double.parseDouble(txtNum2.getText())));
            else if ( e.getSource() == c4 )
                txtResultado.setText("" + (Double.parseDouble(txtNum1.getText()) /
                        Double.parseDouble(txtNum2.getText())));
            else if ( e.getSource() == c5 )
                txtResultado.setText("" + (Math.pow(Double.parseDouble(txtNum1.getText()),
                        Double.parseDouble(txtNum2.getText()))));
            else if ( e.getSource() == c6 )
            {
                for(int i=0; i<6 ; i++)
                {
                    numeros += "" + Math.floor(Math.random()*(60-1)+1);
                    numeros += "  ";
                    txtResultado.setText(numeros);
                }
            }
        }
    }
}
