import javax.swing.*;

public class CaixasJava {

    public static void main(String[] args) {

        String nome;
        int salario;
        int resp;

        nome = JOptionPane.showInputDialog(null, "Digite seu nome");
        JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
        resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
        JOptionPane.showMessageDialog(null, "sua repsosta foi " + resp);



    }
}
