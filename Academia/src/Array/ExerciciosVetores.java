package Array;

import javax.swing.*;

public class ExerciciosVetores {

    public static void main(String[] args) {


        int qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos alunos tem a turma:"));

        for (int i=0; i<qtdAlunos; i++) {
            String nome =  JOptionPane.showInputDialog(null, "Digite o nom do aluno: ");
            Aluno.NOME = nome;
            float nota =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o nom do aluno: "));
            Aluno.NOTA =  nota;

            System.out.println("Aluno [" + Aluno.NOME + "] nota: " + Aluno.NOTA);

        }

    }
}
