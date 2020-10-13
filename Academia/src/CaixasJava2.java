import javax.swing.*;

public class CaixasJava2 {

    public static void main(String[] args) {

        try{
            int  numero;
            numero= Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
            JOptionPane.showMessageDialog(null, "O numero é " + numero);

        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite apenas numeros");
        }
    }
}
