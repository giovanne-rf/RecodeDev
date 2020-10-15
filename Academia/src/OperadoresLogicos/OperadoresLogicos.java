package OperadoresLogicos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int a = 5, b = 7, c = 10;

        boolean b1 = (a > 3) && (b < 8);
        System.out.println("(a > 3) && (b < 8): " + b1);

        boolean b2 = ((a > 3) && (b > 8)) || (c < 20);
        System.out.println("((a > 3) && (b > 8)) || (c < 20):"+b2);

        boolean b3 = (c > 5);
        System.out.println("(c > 5): " + b3);

        boolean b4 = !(c > 5);
        System.out.println("!(c > 5): " + b4);
    }
}