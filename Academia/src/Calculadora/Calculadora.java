package Calculadora;

import Calculadora.Soma.Soma;

public class Calculadora {

    public static void main(String[] args) {

        Soma soma = new Soma (52, 369);
        System.out.println(soma.Resultado());

    }
}
