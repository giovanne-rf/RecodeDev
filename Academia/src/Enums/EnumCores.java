package Enums;

public class EnumCores {

    enum Cores {
        Vermelho, Verde, Azul
    }

    public static class UsarEnumeracao {
        public static void main(String[] args) {
            for (Cores c: Cores.values())
                System.out.println(c);
        }
    }
}
