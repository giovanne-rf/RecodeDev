public class Areas {
    final double pi = 3.14;
    public double AreaCirculo (int raio){
        double area=2*pi*raio;
        return area;
    }
    public int AreaQuadrado (int lado){
        int area = lado * lado;
        return area;
    }
     public int AreaTriangulo(int altura, int base){
        int area = (base*altura)/2;
        return area;
     }
}
