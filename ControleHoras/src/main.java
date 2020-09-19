import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;

public class main {

    public static void main(String[] args) {
        cadastrarFuncionarios funcionario1 = new cadastrarFuncionarios(
                "Giovanne Alves", "008.081.034-90", "28.282-5", "Advogado", 4500, 8);

        cadastrarFuncionarios funcionario2 = new cadastrarFuncionarios(
                "Josinalda Alves", "127.004.123-40", "28.400-8", "Professora", 2800, 6);

        cadastrarFuncionarios funcionario3 = new cadastrarFuncionarios(
                "Eryca Carvalho", "003.136.123-45", "37.500-5", "Auxiliar Administrativo", 2900, 8);

        cadastrarFuncionarios funcionario4 = new cadastrarFuncionarios(
                "Antônio César Vicente da Silva", "125.369.123-4", "25.365-5", "Gordo louco", 5000, 8);

        cadastrarFuncionarios funcionario5 = new cadastrarFuncionarios(
                "Fransico de Assis", "256.360.123-40", "12.256-8", "Mago véi", 5000, 8);

        funcionario1.getDadosFuncionario();
        System.out.println("------------------------==================================----------------");
        funcionario2.getDadosFuncionario();
        System.out.println("------------------------==================================----------------");
        funcionario3.getDadosFuncionario();
        System.out.println("------------------------==================================----------------");
        funcionario4.getDadosFuncionario();
        System.out.println("------------------------==================================----------------");
        funcionario5.getDadosFuncionario();




        System.out.println("------------------------==================================--------------------------------");

        DateTime dataInicial = new DateTime(2012, 12, 1, 9, 23);
        DateTime dataFinal = new DateTime(2012, 12, 1, 14, 5);
        DateTime feriado = new DateTime(2012, 12, 25, 12, 0);

        int dias = Days.daysBetween(dataInicial, dataFinal).getDays();
        int horas = Hours.hoursBetween(dataInicial, dataFinal).getHours();
        int minutos = Minutes.minutesBetween(dataInicial, dataFinal).getMinutes();
        double minutosResto = minutos-(horas*60);


        System.out.println(horas);
        System.out.println(minutos);
        System.out.println(minutosResto);








    }

}
