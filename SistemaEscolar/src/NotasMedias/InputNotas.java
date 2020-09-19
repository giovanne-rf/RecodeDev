package NotasMedias;

import java.util.Scanner;

class inputNotas {

    public static void main(String[] args) {

        Alunos aluno = new Alunos("Giovanne", 8, 9);

        System.out.println("Nota 1: "+ aluno.nota1);
        System.out.println("Nota 2: " +aluno.nota2);
        System.out.println("O aluno teve média " + aluno.media()+" e foi "+ aluno.resultado(aluno.media()));


    }


    
}
