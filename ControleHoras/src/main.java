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
        System.out.println("------------------------==================================--------------------------------");

        Ponto ponto1 = new Ponto("Giovanne José Alves Pereira","008.081.034-90",
                "28.282-D", "Advogado", 4500, 8);
        ponto1.anoIn=2020;
        ponto1.mesIn=9;
        ponto1.diaIn=19;
        ponto1.horaIn=8;
        ponto1.minIn=0;
        ponto1.anoOut=2020;
        ponto1.mesOut=9;
        ponto1.diaOut=19;
        ponto1.horaOut=22;
        ponto1.mesOut=0;



        System.out.println(ponto1.nomeCompleto);
        System.out.println(ponto1.dataIn);
        System.out.println(ponto1.dataOut);
        System.out.println(ponto1.horasTrabalhadas);
        System.out.println(ponto1.horasExtrasTrabalhadas);

        System.out.println("------------------------==================================--------------------------------");

        DateTime dataIn = new DateTime(2020, 9, 19, 20, 23);
        DateTime dataOut = new DateTime(2020, 9, 20, 8, 15);

        int dias = Days.daysBetween(dataIn, dataOut).getDays();
        int horas = Hours.hoursBetween(dataIn, dataOut).getHours();
        int minutos = Minutes.minutesBetween(dataIn, dataOut).getMinutes();
        double minutosResto = minutos-(horas*60);


        System.out.println(dataIn);
        System.out.println(horas);
        System.out.println(minutos);
        System.out.println(minutosResto);








    }

}
