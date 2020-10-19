import javax.swing.*;

public class calculoArea {

    public void main(String[] args) {

        byte escolha = Byte.parseByte(JOptionPane.showInputDialog("Digite:\n1-Quadrado \n2-Triangulo \n3-Círculo"));
        if (escolha == 1) {
            float lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do lado"));
            JOptionPane.showMessageDialog(null, "Area do Quadrado = " + lado * lado);
            JOptionPane.showMessageDialog(null, "Perímetro do Quadrado = " + 4 * lado);
        } else if (escolha == 2)//Triangulo
        {
            float ladoBase = Float.parseFloat(JOptionPane.showInputDialog("Digite a Base"));

            float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a Altura"));
            float lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o Segundo Lado"));
            float lado3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o Terceiro Lado"));
            JOptionPane.showMessageDialog(null,"Area do Triangulo = " + ladoBase*altura/2);
            JOptionPane.showMessageDialog(null,"Perímetro do Triangulo = " + (ladoBase+lado2+lado3));
        }
        else if(escolha == 3)//Círculo
        {
            float raio = Float.parseFloat(JOptionPane.showInputDialog("Digite o Raio do circulo"));
            JOptionPane.showMessageDialog(null,"Area do Círculo = " + 3.14*raio*raio);
            JOptionPane.showMessageDialog(null,"Perímetro do Círculo = " + 2+3.14+raio);
        }
        else
            JOptionPane.showMessageDialog(null,"Valor INCORRETO!!!\nDigite apenas 1 ou 2 ou 3.",
                    "Erro de Entrada",  0);
        }

    private double  areaCirculo(int raio, double pi){
         double area =raio*pi;
            return area;
    }

    private double  areaQuadrado(int lado){
        double area =lado*lado;
        return area;
    }

    private double  areaTriangulo(int base, int altura){
        double area =(base*altura)/2;
        return area;
    }

    private double  perimetroCirculo(int raio, double pi){
        double perimetro =2*pi*raio;
        return perimetro;
    }

    private double  perimetroQuadrado(int lado){
        double perimetro =lado*4;
        return perimetro;
    }

    private double  perimetroTrinagulo(int base, int altura ){
        double perimetro =base+base+base;
        return perimetro;
    }



}
