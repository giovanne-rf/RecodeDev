package OperadoresLogicos;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int it1 = 10, it2 = 15, it3 = 10, it4 = 15;
        boolean b1 = it1 == it2;
        System.out.println("it1 == it2 eh: " + b1);
        boolean b2 = it1 == it3;
        System.out.println("it1 == it3 eh: " + b2);
        boolean b3 = it1 != it2;
        System.out.println("it1 != it2 eh: " + b3);
        boolean b4 = it1 != it3;
        System.out.println("it1 != it3 eh: " + b4);
        boolean b5 = it2 > it4;
        System.out.println("it2 > it4 eh: " + b5);
        boolean b6 =  it2 >= it4;
        System.out.println("it2 >= it4 eh: " + b6);
        boolean b7 = it3 < it4;
        System.out.println("it3 < it4 eh: " + b7);
        boolean b8 = it2 <= it4;
        System.out.println("it2 <= it4 eh: " + b8);
    }
}