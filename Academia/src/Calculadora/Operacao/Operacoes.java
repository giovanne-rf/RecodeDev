package Calculadora.Operacao;

public class Operacoes {

    String operacao;

    public void operacao(){

        switch (operacao){

            case "+":
                operacao = "soma";
            case "-":
                operacao = "subtracao";
            case "*":
                operacao = "multiplicacao";
            case "/":
                operacao = "divisao";
        }
    }
}
