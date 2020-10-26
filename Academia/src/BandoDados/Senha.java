package BandoDados;

import BandoDados.ConectaBanco;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Senha extends JFrame implements ActionListener
{
    private String senha, usuario;
    JLabel jlUsuario, jlSenha;
    private JTextField txtUsuario;
    private JPasswordField pSenha;
    private JButton btnOK;
    private JButton bntSair;
    GridLayout gl = new GridLayout(3, 2, 2, 2);
    public String getSenha() {
        return senha;	}

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public static void main(String ar[])
    {
        new Senha();
    }

    public Senha()
    {
        setSize(450, 150);
        setLayout(gl);
        jlUsuario = new JLabel("Usuário");
        txtUsuario = new JTextField();
        jlSenha = new JLabel("Senha");
        pSenha = new JPasswordField();
        btnOK = new JButton("OK");
        bntSair = new JButton("Sair");
        getContentPane().add(jlUsuario);
        getContentPane().add(txtUsuario);
        getContentPane().add(jlSenha);
        getContentPane().add(pSenha);
        getContentPane().add(btnOK);
        getContentPane().add(bntSair);
        btnOK.addActionListener(this);
        bntSair.addActionListener(this);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnOK &&
                txtUsuario.getText().trim().length()>0 &&
                String.valueOf(pSenha.getPassword()).trim().length()>0)
        {
            ConectaBanco.setUSUARIO(txtUsuario.getText());
            ConectaBanco.setSENHA(String.valueOf(pSenha.getPassword()));
            try
            {
                ConectaBanco.getConexao(txtUsuario.getText(),
                        String.valueOf(pSenha.getPassword()) );
            }
            catch (ClassNotFoundException | InstantiationException |
                    IllegalAccessException | SQLException e1) {
                // TODO Auto-generated catch block
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos"
                        + e1.getMessage());
                txtUsuario.requestFocus();
                return;
            }
            dispose();
        }
        else if (e.getSource() == btnOK)
            JOptionPane.showMessageDialog(null, "Dados de Usuário e Senha "
                    + "\nSão Obrigatórios!!!");
        else if (e.getSource() == bntSair)
        {
            System.exit(0);
        }
    }
}
