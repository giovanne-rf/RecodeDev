package GerenciadoresLayout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class TesteLogonUsuario extends JFrame implements ActionListener
{
    JButton btnOk, btnCancelar;
    JTextField campoUsuario;
    JPasswordField campoSenha;
    public TesteLogonUsuario(){
        setTitle("Login Usuario");
        setSize(300,110);
        GridLayout gl = new GridLayout(3,2,1,1);
        getContentPane().setLayout(gl);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelUsuario = new JLabel();
        labelUsuario.setText("Usuario: ");
        getContentPane().add(labelUsuario);

        campoUsuario = new JTextField();
        getContentPane().add(campoUsuario);

        JLabel labelSenha = new JLabel();
        labelSenha.setText("Senha: ");
        getContentPane().add(labelSenha);

        campoSenha = new JPasswordField();
        getContentPane().add(campoSenha);

        btnOk = new JButton("Ok");
        getContentPane().add(btnOk);
        btnOk.addActionListener(this);

        btnCancelar = new JButton("Cancelar");
        getContentPane().add(btnCancelar);
        btnCancelar.addActionListener(this);

        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == btnOk){
            String usu = campoUsuario.getText();
            String senha = String.valueOf(campoSenha.getPassword());
            if (campoUsuario.getText().equals("Marcos") && senha.equals("123")){
                JOptionPane.showMessageDialog(null, usu + ", "
                        + "você foi logado ao sistema.");
                System.exit(0);
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuario ou senha inválidos. "
                        + "Tente novamente");
            }
        }
        if (e.getSource() == btnCancelar){
            JOptionPane.showMessageDialog(null, "Você escolheu CANCELAR. "
                    + "Tente novamente");
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new TesteLogonUsuario();
    }
}
