package Excepetions;

import javax.swing.*;

public class FaixaEtaria {

    public static void main(String[] args) throws IdadeInvalidaException {
        
        String nome = "";
        byte idade;
        String faixaEtaria = null;
        
        nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        idade = Byte.parseByte(JOptionPane.showInputDialog(null, "Digite sua idade: "));
        
        Pessoa nova = new Pessoa (nome, idade);

        if(idade>0 && idade<10){
                    faixaEtaria = "Criança";
                } else if (idade>11 && idade<17){
                    faixaEtaria = "Adolescente";
                } else  if(idade>18 && idade<60){
                    faixaEtaria= "Adulto";
                } else if (idade>61){
                    faixaEtaria= "Idoso";
                }
        JOptionPane.showMessageDialog(null, nome + " tem " + idade + " anos  e sua faixa etária é: "+ faixaEtaria);
    }
}
