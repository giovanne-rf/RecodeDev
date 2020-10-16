package Calculadora.Operacao;

public class Operacao {

        double entrada1;
        double entrada2;
        double resultado;
        String operacao;

    public Operacao(double entrada1, double entrada2, String operacao) {
        this.entrada1 = entrada1;
        this.entrada2 = entrada2;
        this.operacao = operacao;
    }

    public double Resultado (){
            return resultado = entrada1+entrada2;
        }
}
