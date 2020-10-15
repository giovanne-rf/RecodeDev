import Construtores.Pessoa;

public class Carro {

        public static String placa = "ABC-1563";

    public static void main(String[] args) {
        Carro carro1 =  new Carro();
        Carro carro2 =  new Carro();

        System.out.println("Carro.Placa: " + Carro.placa);
        System.out.println("Carro1.Placa: " + carro1.placa);
        System.out.println("Carro2.Placa: " + carro2.placa);


        System.out.println("Alterando a placa do carro1: ");
        carro1.placa="DBX-4034";
        System.out.println("Carro1.Placa: " + carro1.placa);
        System.out.println("Carro2.Placa: " + carro2.placa);
        System.out.println("Carro.Placa: " + Carro.placa);

    }
}
