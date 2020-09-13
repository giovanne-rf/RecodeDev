import java.util.Scanner;

public class CalculoAreas {
    public static void main(String[] args) {

        Scanner medida = new Scanner(System.in);
        System.out.println("Informa o raio do círculo em m2: ");
        double raio = medida.nextDouble();

        Areas circulo = new Areas();
        System.out.printf("A área do circulo é %.2f m2 ", circulo.AreaCirculo((int) raio));
        System.out.println ("");

        System.out.println("Informa o lado do quadrado em m2: ");
        int lado = medida.nextInt();
        Areas quadrado = new Areas();
        System.out.println("A área do quadrado em m2 é " +  quadrado.AreaQuadrado(lado));
        System.out.println ("");

        System.out.println("Informa a altura do triângulo em m2: ");
        int altura = medida.nextInt();
        System.out.println("Informa a base do triângulo em m2: ");
        int base = medida.nextInt();
        Areas triangulo = new Areas();
        System.out.println("A área do triangulo em m2 é " +  triangulo.AreaTriangulo(altura, base));
        System.out.println ("");

        medida.close();
    }
}
