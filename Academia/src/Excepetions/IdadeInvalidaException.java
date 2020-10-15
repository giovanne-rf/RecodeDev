package Excepetions;

import javax.swing.*;

public class IdadeInvalidaException extends Exception{

    public IdadeInvalidaException (String mensagem){
        super(mensagem);
        print();
    }

    public void print (){
        JOptionPane.showMessageDialog(null, "Você digitou mensagem fora do intervalo");
        System.out.println(getMessage());
        System.out.println(" -- IdadeInvalidaException -- ");
    }
}
