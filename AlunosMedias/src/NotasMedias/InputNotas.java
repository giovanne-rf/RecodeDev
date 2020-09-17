package NotasMedias;

import java.util.Scanner;

class inputNotas {

    public static void main(String[] args) {

        Alunos aluno = new Alunos("Giovanne", 8, 9);
        System.out.println(aluno.resultado(aluno.media));

        System.out.println(aluno.media());
        System.out.println(aluno.nota1);
        System.out.println(aluno.nota2);
        System.out.println(aluno.media);


    }


    
}
