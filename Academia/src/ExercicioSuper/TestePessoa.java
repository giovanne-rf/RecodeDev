package ExercicioSuper;

import javax.swing.*;
import java.util.ArrayList;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Endereco endereco =  new Endereco();
        ArrayList novaLista = new ArrayList();
        novaLista.add(endereco);



        for (int i = 0;  i< novaLista.size(); i++){
            endereco.setLogradouro((JOptionPane.showInputDialog("Digite o logradouro: ")));
            endereco.setComplemento(JOptionPane.showInputDialog("Digite o complemento: "));
            endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: ")));
        }
        novaLista.add(endereco);

        System.out.println(endereco);
    }
}
