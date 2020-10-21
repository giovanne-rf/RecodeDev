package Calculadora;
import javax.swing.JOptionPane;
public class Calculadora
{
    public int somar(int n1, int n2)
    {
        return n1+n2;
    }
    public float somar(float n1f, float n2f)
    {
        return n1f+n2f;
    }
    public int somar(String n1s, String n2s)
    {
        return (Integer.parseInt(n1s) + Integer.parseInt(n2s));
    }

    public int subtrair(int n1, int n2)
    {
        return n1-n2;
    }
    public float subtrair(float n1f, float n2f)
    {
        return n1f-n2f;
    }
    public int subtrair(String n1s, String n2s)
    {
        return (Integer.parseInt(n1s) - Integer.parseInt(n2s));
    }

    public int multiplicar(int n1, int n2)
    {
        return n1*n2;
    }
    public float multiplicar(float n1f, float n2f)
    {
        return n1f*n2f;
    }
    public int multiplicar(String n1s, String n2s)
    {
        return (Integer.parseInt(n1s) * Integer.parseInt(n2s));
    }

    public int dividir(int n1, int n2)
    {
        return n1/n2;
    }
    public float dividir(float n1f, float n2f)
    {
        return n1f/n2f;
    }
    public int dividir(String n1s, String n2s)
    {
        return (Integer.parseInt(n1s) / Integer.parseInt(n2s));
    }

    public static void main(String args[])
    {
        Calculadora m = new Calculadora();
        int resp=0;
        do
        {
            String escolha = JOptionPane.showInputDialog("Digite: "
                    + "\n1-Soma \n2-Subtração \n3-Multiplicação \n4-Divisão");
            if(escolha.equals("1"))
            {
                String n1 = JOptionPane.showInputDialog("Digite: o 1. número");
                String n2 = JOptionPane.showInputDialog("Digite: o 2. número");
                JOptionPane.showMessageDialog(null, "Soma = " + m.somar(n1, n2));
            }
            else if (escolha.equals("2"))
            {
                int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite: o 1. número"));
                int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite: o 2. número"));
                JOptionPane.showMessageDialog(null, "Subtração = " + m.subtrair(n1, n2));
            }
            else if (escolha.equals("3"))
            {
                float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite: o 1. número"));
                float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite: o 2. número"));
                JOptionPane.showMessageDialog(null, "Multiplicação = " + m.multiplicar(n1, n2));
            }
            else if (escolha.equals("4"))
            {
                float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite: o 1. número"));
                float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite: o 2. número"));
                JOptionPane.showMessageDialog(null, "Divisão = " + m.dividir(n1, n2));
            }
            resp = JOptionPane.showConfirmDialog(null,"Deseja calcular outro: ",
                    "Calculadora", 1);
        }
        while(resp==0);
    }
}




/*
Faça um programa em Java para implementar uma calculadora
simples com as quatro operações básicas da matemática.
Crie três métodos para cada uma das operações e cada método
deverá ser sobrecarregado, pois um deles deve receber apenas
dois parâmetros do tipo int, o outro apenas dois parâmetros
do tipo float e o último apenas dois parâmetros do tipo String.
Quando os parâmetros forem do tipo String, os mesmos deverão
ser convertidos para o tipo int.
}

 */