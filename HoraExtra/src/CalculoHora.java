public class CalculoHora {

    public static void main(String[] args) {

        String ponto = "<Domingo><08><18><120>";


        System.out.println(new Ponto(ponto).getDiaSemana());

        Horas dia2 = new Horas(ponto);

        System.out.println(dia2.diasSemana(dia2.diaSemana));
        System.out.println(dia2.getDiaSemana());




    }
}
