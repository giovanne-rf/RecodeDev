public class CalculoHora {

    public static void main(String[] args) {

        String ponto = "<Domingo><08><18><120>";

        Horas horas1 =  new Horas(ponto);
        Ponto ponto1 = new Ponto(ponto);

        System.out.println("Dia semana: "+ponto1.getDiaSemana());
        System.out.println("Horas trabalahadas: " + horas1.horasTrabalhadas(horas1.timeIn, horas1.getTimeOut()));
        System.out.println("Horas-Extras trabalhadas: "+horas1.horasExtrasTrabalhadas(horas1.horasTrabalhadas(horas1.timeIn, horas1.timeOut)));
        System.out.println("Coeficiente de horas-extras: "+horas1.diasSemana(horas1.diaSemana));
        System.out.println("Valor Total de horas a ser pago: "+horas1.calculoValorTotal());


    }
}