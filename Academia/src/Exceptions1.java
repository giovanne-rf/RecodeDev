import javax.swing.*;

public class Exceptions1 {

    public static void main(String[] args) {

        try{
            float saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite um número"));
            JOptionPane.showMessageDialog(null , "o Saldo é " + saldo);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null , "Não use vírgulas!");
            System.out.println("Digite numeros com pontos");
        }

    }
}
