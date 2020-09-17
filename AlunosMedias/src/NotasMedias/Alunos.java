package NotasMedias;

public class Alunos {

     String aluno;
     double nota1, nota2;
     double media;
     String resultado;

    public Alunos(String aluno, double nota1, double nota2) {
        this.aluno = aluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double media() {
        media = (nota1 + nota2)/2;

        return media;
    }

    public String resultado(double media) {
        if (media > 7) {
            resultado = "Aprovado";

           return  resultado; //System.out.println("O aluno "+ aluno + " teve média " + media + " e o resultado é: " + resultado);
        } else if (media > 3) {
            resultado = "Recuperação";
            nota1 = media;
            media = 5;
            nota2 = (media - nota1) * 2;
//            System.out.println("O aluno "+ aluno + " teve média " + media + " e o resultado é: " + resultado);
//            System.out.println("A nota necessária para a aprovação é: " + nota2);
            return resultado;
        } else {
            resultado = "reprovado";
//            System.out.println("O aluno "+ aluno + " teve média " + media + " e o resultado é: " + resultado);
            return resultado;
        }
    }
}

