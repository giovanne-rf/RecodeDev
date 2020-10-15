package Excepetions;

import javax.swing.*;

public class TesteIdade {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null, "Digite o nome:");
        byte idade = Byte.parseByte(JOptionPane.showInputDialog(null, "Digite a idade:"));

        try{
            Pessoa p = new Pessoa(nome, idade);

        } catch (NumberFormatException e){
            System.out.println("Digite apenas números");

        } catch (IdadeInvalidaException e){
            e.printStackTrace();

        }
    }

}
