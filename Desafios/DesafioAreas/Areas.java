public class Areas {
    final double pi = 3.14;
    public double AreaCirculo (final int raio) {
        final double area = 2 * pi * raio;
        return area;
    }

    public int AreaQuadrado(final int lado) {
        final int area = lado * lado;
        return area;
    }

    public int AreaTriangulo(final int altura, final int base) {
        final int area = (base * altura) / 2;
        return area;
     }
}
