package GerenciadoresLayout;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class ExLogin extends ModeloJFrame implements ActionListener {
    String usuario = "Giovanne ";
    String password = "28g12g69g";

    JLabel jlNome, jlSenha, l1;
    JTextField nome;
    JPasswordField senha;
    JButton login, cancelar;
    JPanel panel1, panel2;

    ExLogin() {
        setTitle("Teste JPanel");
        setSize(400,200);
        GridLayout grid1 = new GridLayout(7,1,5,5);

        login = new JButton("Entrar no sistema");
        cancelar = new JButton("Cancelar");
        l1 = new JLabel("Acesse o sistema:");
        nome = new JTextField();
        senha = new JPasswordField();
        jlNome = new JLabel("Usuário:");
        jlSenha = new JLabel("Senha:");

        getContentPane().add(l1);
        getContentPane().add(jlNome);
        getContentPane().add(nome);
        getContentPane().add(jlSenha);
        getContentPane().add(senha);
        getContentPane().add(login);
        getContentPane().add(cancelar);
        setLayout(grid1);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(255,255,255));
        login.addActionListener(this);
        senha.addActionListener(this);

    }
    public static void main(String[] args) {
        ExLogin login = new ExLogin();
        login.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            String s = String.valueOf(senha.getPassword());
            if (!nome.getText().equals(usuario) && !String.valueOf(senha.getPassword()).equals(password))
            {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
                nome.grabFocus();
                nome.selectAll();
            }
            else {
                JOptionPane.showMessageDialog(null, "Usuário logado com sucesso!");
                System.exit(0);
            }
        }
        if (e.getSource() == cancelar) {
            System.exit(0);
        }

    }


}
