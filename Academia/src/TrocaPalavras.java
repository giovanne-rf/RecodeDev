import javax.swing.*;

public class TrocaPalavras {

    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Digite a frase: ");
        String troca = JOptionPane.showInputDialog("Qual caracter você quer trocar: ");
        String novaparte =  JOptionPane.showInputDialog("Nova parte: ");

        System.out.println(frase.replace(troca, novaparte));

        String nome = JOptionPane.showInputDialog("Digite seu nome: ");

    }
}
