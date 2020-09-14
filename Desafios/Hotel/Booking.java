import java.text.ParseException;
import java.util.Scanner;

public class Booking {

    public static void main(String[] args) throws ParseException {

        Scanner entrada = new Scanner(System.in);

        Customers cliente = new Customers();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Digite o tipo de cliente da reserva [0 - Regular] / [1-Fidelidade]: ");
        String tipoCliente= cliente.customerType(entrada.nextInt());

        while (!tipoCliente.equalsIgnoreCase("Regular") || !tipoCliente.equalsIgnoreCase("Regular")){
            System.out.println("Valor INVÁLIDO!!!! Digite o tipo de cliente da reserva [1 - Regular] / [2-Fidelidade]: ");
            tipoCliente= cliente.customerType(entrada.nextInt());
        };
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Você é um cliente tipo " + tipoCliente + ", vamos selecionar as datas de sua reserva: ");
        System.out.println("--------------------------------------------------------------------");

                    System.out.println("=============   PRIMEIRA DATA PARA RESERVA  =====================");
                    System.out.println(">>>> Digite o dia da primeira data [ 1 - 31]: ");
                    int day = entrada.nextInt();
                    while (day<0 || day>31){
                        System.out.println("Data inválida!!!! Digite o dia da primeira data [ 1 - 31]: ");
                        day = entrada.nextInt();
                    }
                    System.out.println("Registro realizado!: ");

                    System.out.println(">>>> Agora digite o mês da primeira data [ 1 - 12]: ");
                    int month = entrada.nextInt();
                    while (month<0 || month>12){
                        System.out.println(" !!! Mês INVÁLIDO !!! digite o mês da primeira data [ 1 - 12]: ");
                        month = entrada.nextInt();
                    }
                    System.out.println("Registro realizado!: ");

                    System.out.println(">>>> Agora digite o ano da primeira data: ");
                    int year = entrada.nextInt();
                    while (year<2020){
                        System.out.println("!!! Ano INVÁLIDO !!! digite o ano maior ou igual que o atual: ");
                        year = entrada.nextInt();
                    }
                    System.out.println("Registro realizado!: ");
                    Days data1 = new Days(day, month, year);

        String diaDaSemana1 = data1.dayOfWeek(day, month, year);
        
        Hotels hotel1 = new Hotels(day, month, year);
        Hotels hotel2 = new Hotels(day, month, year);
        Hotels hotel3 = new Hotels(day, month, year);

        System.out.println(tipoCliente+": R$"+hotel1.priceJardimBotanico(diaDaSemana1, tipoCliente)+ ", R$ "
                + hotel2.priceMarAtlantico(diaDaSemana1, tipoCliente)+", R$ "+hotel3.priceParqueFlores(diaDaSemana1, tipoCliente) +")");
        System.out.println("Dia da semana"+": ("+diaDaSemana1+")");


            entrada.close();

        }
};


