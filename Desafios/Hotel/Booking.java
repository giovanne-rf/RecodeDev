import java.text.ParseException;
import java.util.Random;
import java.util.Scanner;

public class Booking {

    public static void main(String[] args) throws ParseException {

        Scanner entrada = new Scanner(System.in);

        Customers cliente = new Customers();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Digite o tipo de cliente da reserva [1 - Regular] / [2-Fidelidade]: ");
        String tipoCliente= cliente.customerType(entrada.nextInt());

        while (!tipoCliente.equalsIgnoreCase("Regular") && !tipoCliente.equalsIgnoreCase("Fidelidade")){
            System.out.println("Valor INVÁLIDO!!!! Digite o tipo de cliente da reserva [1 - Regular] / [2-Fidelidade]: ");
            tipoCliente= cliente.customerType(entrada.nextInt());
        };
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Você é um cliente tipo " + tipoCliente + ", vamos selecionar as datas de sua reserva: ");
        System.out.println("--------------------------------------------------------------------");

                    System.out.println("=============   PRIMEIRA DATA PARA RESERVA  =====================");
                    System.out.println(">>>> Digite o dia da primeira data [ 1 - 31]: ");
                    int dia = entrada.nextInt();
                    while (dia<0 || dia>31){
                        System.out.println("Valor inválido!!!! Digite o dia da primeira data [ 1 - 31]: ");
                        dia = entrada.nextInt();
                    }
                    System.out.println("Registro realizado!: ");

                    System.out.println(">>>> Agora digite o mês da primeira data [ 1 - 12]: ");
                    int mes = entrada.nextInt();
                    while (mes<0 || mes>12){
                        System.out.println(" !!! Valor INVÁLIDO !!! digite o mês da primeira data [ 1 - 12]: ");
                        mes = entrada.nextInt();
                    }
                    System.out.println("Registro realizado!: ");

                    System.out.println(">>>> Agora digite o ano da primeira data: ");
                    int ano = entrada.nextInt();
                    while (ano<2020){
                        System.out.println("!!! Valor INVÁLIDO !!! digite o ano maior ou igual que o atual: ");
                        ano = entrada.nextInt();
                    }
                    System.out.println("Registro realizado!: ");
                    Days data1 = new Days(dia, mes, ano);

        String diaDaSemana1 = data1.WeekDay(dia, mes, ano);
        data1.DayOfWeek(diaDaSemana1);

        String mesDoAno1 = data1.MonthOfYear(dia, mes, ano);
        data1.MonthOfYear(dia, mes, ano);

        String diaDaSemanaIngles1 = data1.DayOfweek;
        Hotels hotel1 = new Hotels();
        Hotels hotel2 = new Hotels();
        Hotels hotel3 = new Hotels();

        hotel1.ParqueDaFlores(diaDaSemana1, tipoCliente);
        hotel2.JardimBotanico(diaDaSemana1, tipoCliente);
        hotel3.MarAtlantico(diaDaSemana1, tipoCliente);
        double tarifa1h1 = hotel1.ParqueDaFlores(diaDaSemana1, tipoCliente);
        double tarifa1h2 = hotel2.JardimBotanico(diaDaSemana1, tipoCliente);
        double tarifa1h3 = hotel3.MarAtlantico(diaDaSemana1, tipoCliente);

//        System.out.println(tipoCliente+":" + data1.day+mesDoAno1+data1.year+"("+diaDaSemanaIngles1+")");
//        System.out.println("Primeira data selecionada: <" + data1.ChooseDays(dia, mes, ano)+">");
//        System.out.println("Dia da Semana: <" +diaDaSemana +">");
//        System.out.println("Dia da Semana: (" +diaDaSemanaIngles +")");
//        System.out.println("Tarifa para o 1º dia do hotel  "+ hotel1.nome +" R$: " + tarifa1h1);
//        System.out.println("Tarifa para o 2º dia do hotel  "+ hotel2.nome +" R$: " + tarifa1h2);
//        System.out.println("Tarifa para o 2º dia do hotel  "+ hotel3.nome +" R$: " + tarifa1h3);
//        System.out.println("--------------------------------------------------------------------");

                    System.out.println("=============   SEGUNDA DATA PARA RESERVA  =====================");
                    System.out.println(">>>> Digite o dia da primeira data [ 1 - 31]: ");
                    dia = entrada.nextInt();
                    while (dia<0 || dia>31){
                        System.out.println("Valor inválido!!!! Digite o dia da primeira data [ 1 - 31]: ");
                        dia = entrada.nextInt();
                    }
                    System.out.println("Registro realizado!: ");

                    System.out.println(">>>> Agora digite o mês da primeira data [ 1 - 12]: ");
                    mes = entrada.nextInt();
                    while (mes<0 || mes>12){
                        System.out.println(" !!! Valor INVÁLIDO !!! digite o mês da primeira data [ 1 - 12]: ");
                        mes = entrada.nextInt();
                    }
                    System.out.println("Registro realizado!: ");

                    System.out.println(">>>> Agora digite o ano da primeira data: ");
                    ano = entrada.nextInt();
                    while (ano<2020){
                        System.out.println("!!! Valor INVÁLIDO !!! digite o ano maior ou igual que o atual: ");
                        ano = entrada.nextInt();
                    }
                    Days data2 = new Days(dia, mes, ano);

        String diaDaSemana2 = data2.WeekDay(dia, mes, ano);

        String mesDoAno2 = data2.MonthOfYear(dia, mes, ano);
        data2.MonthOfYear(dia, mes, ano);
        String diaDaSemanaIngles2 = data2.DayOfweek;

        hotel1 = new Hotels();
        hotel2 = new Hotels();
        hotel3 = new Hotels();

        hotel1.ParqueDaFlores(diaDaSemana2, tipoCliente);
        hotel2.JardimBotanico(diaDaSemana2, tipoCliente);
        hotel3.MarAtlantico(diaDaSemana2, tipoCliente);
        double tarifa2h1 = hotel1.ParqueDaFlores(diaDaSemana2, tipoCliente);
        double tarifa2h2 = hotel2.JardimBotanico(diaDaSemana2, tipoCliente);
        double tarifa2h3 = hotel3.MarAtlantico(diaDaSemana2, tipoCliente);

//        System.out.println(tipoCliente+":" + data2.day+mesDoAno2+data2.year+"("+diaDaSemanaIngles2+")");
//        System.out.println("Primeira data selecionada: <" + data1.ChooseDays(dia, mes, ano)+">");
//        System.out.println("Tipo de cliente: " + tipoCliente);
//        System.out.println("Dia da Semana: <" +diaDaSemana +">");
//        System.out.println("Tarifa para o 2º dia do hotel  "+ hotel1.nome +" R$: " + tarifa2h1);
//        System.out.println("Tarifa para o 2º dia do hotel  "+ hotel2.nome +" R$: " + tarifa2h2);
//        System.out.println("Tarifa para o 2º dia do hotel  "+ hotel3.nome +" R$: " + tarifa2h3);
//        System.out.println("--------------------------------------------------------------------");

                    System.out.println("=============   TERCEIRA DATA PARA RESERVA  =====================");
                    System.out.println(">>>> Digite o dia da primeira data [ 1 - 31]: ");
                    dia = entrada.nextInt();
                    while (dia<0 || dia>31){
                        System.out.println("Valor inválido!!!! Digite o dia da primeira data [ 1 - 31]: ");
                        dia = entrada.nextInt();
                    }
                    System.out.println("Registro realizado!: ");

                    System.out.println(">>>> Agora digite o mês da primeira data [ 1 - 12]: ");
                    mes = entrada.nextInt();
                    while (mes<0 || mes>12){
                        System.out.println(" !!! Valor INVÁLIDO !!! digite o mês da primeira data [ 1 - 12]: ");
                        mes = entrada.nextInt();
                    }
                    System.out.println("Registro realizado!: ");

                    System.out.println(">>>> Agora digite o ano da primeira data: ");
                    ano = entrada.nextInt();
                    while (ano<2020){
                        System.out.println("!!! Valor INVÁLIDO !!! digite o ano maior ou igual que o atual: ");
                        ano = entrada.nextInt();
                    }
                    Days data3 = new Days(dia, mes, ano);

        String diaDaSemana3 = data3.WeekDay(dia, mes, ano);

        String mesDoAno3 = data3.MonthOfYear(dia, mes, ano);
        data3.MonthOfYear(dia, mes, ano);
        String diaDaSemanaIngles3 = data3.DayOfweek;

        hotel1 = new Hotels();
        hotel2 = new Hotels();
        hotel3 = new Hotels();

        hotel1.ParqueDaFlores(diaDaSemana3, tipoCliente);
        hotel2.JardimBotanico(diaDaSemana3, tipoCliente);
        hotel3.MarAtlantico(diaDaSemana3, tipoCliente);
        double tarifa3h1 = hotel1.ParqueDaFlores(diaDaSemana3, tipoCliente);
        double tarifa3h2 = hotel2.JardimBotanico(diaDaSemana3, tipoCliente);
        double tarifa3h3 = hotel3.MarAtlantico(diaDaSemana3, tipoCliente);

        System.out.println(tipoCliente+":" +data1.day+mesDoAno1+data1.year+"("+diaDaSemanaIngles1+"), "
                +data2.day+mesDoAno2+data2.year+"("+diaDaSemanaIngles2+"), " +
                ""+ data3.day+mesDoAno3+data3.year+"("+diaDaSemanaIngles3+")");

        double tarifa1 = tarifa1h1+tarifa1h2+tarifa1h3;
        double tarifa2 = tarifa2h1+tarifa2h2+tarifa2h3;
        double tarifa3 = tarifa3h1+tarifa3h2+tarifa3h3;

        if (tarifa1<tarifa2 && tarifa1<tarifa3){
            System.out.println("Parque das Flores");
        } else if (tarifa2<tarifa1 && tarifa2<tarifa3){
            System.out.println("Jardim Botânico");
        } else if (tarifa3<tarifa1 && tarifa3<tarifa2){
            System.out.println("Mar Atlântico");

        } else {
            System.out.println("Nenhum!!!!");
        }
//        System.out.println("Primeira data selecionada: <" + data1.ChooseDays(dia, mes, ano)+">");
//        System.out.println("Tipo de cliente: " + tipoCliente);
//        System.out.println("Dia da Semana: <" +diaDaSemana +">");
//        System.out.println("Tarifa para o 2º dia do hotel  "+ hotel1.nome +" R$: " + tarifa3h1);
//        System.out.println("Tarifa para o 2º dia do hotel  "+ hotel2.nome +" R$: " + tarifa3h2);
//        System.out.println("Tarifa para o 2º dia do hotel  "+ hotel3.nome +" R$: " + tarifa3h3);
//        System.out.println("--------------------------------------------------------------------");
//            String day=""+dia;
//            String month=""+mes;
//            String year=""+ano;
//            String data = ""+ data1;
//            data1.DataFornecida.format("ddMMyyyy");
//            System.out.println(data1.DataFornecida);
//            System.out.println("--------------------------------------------------------------------");
//            System.out.println("-----------------VAMOS SELECIONAR A SEGUNDA DATA--------------------");
//            System.out.println("--------------------------------------------------------------------");
//            System.out.println(">>>> Digite o dia da SEGUNDA data [ 1 - 31]: ");
//            dia = entrada.nextInt();
//            while (dia<0 || dia>31){
//            System.out.println("!!! Valor inválido !!!! Digite o dia da primeira data [ 1 - 31]: ");
//            dia = entrada.nextInt();
//            }
//            System.out.println("Registro realizado!: ");
//
//            System.out.println(">>>> Agora digite o mês da SEGUNDA data [ 1 - 12]: ");
//            mes = entrada.nextInt();
//            while (mes<0 || mes>12){
//            System.out.println("!!! Valor INVÁLIDO !!! digite o mês da SEGUNDA data [ 1 - 12]: ");
//            mes = entrada.nextInt();
//            }
//            System.out.println("Registro realizado!: ");
//
//            System.out.println(">>>> Agora digite o ano da SEGUNDA data: ");
//            ano = entrada.nextInt();
//            while (ano<2020){
//            System.out.println("!!! Valor INVÁLIDO!!! digite o ano maior ou igual que o atual: ");
//            ano = entrada.nextInt();
//            }
//            System.out.println("Registro realizado!: ");
//            Days data2 = new Days(dia, mes, ano);
//
//            System.out.println("--------------------------------------------------------------------");
//            System.out.println("-----------------VAMOS SELECIONAR A TERCEIRA DATA--------------------");
//            System.out.println("--------------------------------------------------------------------");
//            System.out.println(">>>> Digite o dia da TERCEIRA data [ 1 - 31]: ");
//            dia = entrada.nextInt();
//            while (dia<0 || dia>31){
//            System.out.println("!!! Valor inválido !!!! Digite o dia da TERCEIRA data [ 1 - 31]: ");
//            dia = entrada.nextInt();
//            }
//            System.out.println("Registro realizado!: ");
//
//            System.out.println(">>>> Agora digite o mês da TERCEIRA data [ 1 - 12]: ");
//            mes = entrada.nextInt();
//            while (mes<0 || mes>12){
//            System.out.println("!!! Valor INVÁLIDO!!! digite o mês da TERCEIRA data [ 1 - 12]: ");
//            mes = entrada.nextInt();
//            }
//            System.out.println("Registro realizado!: ");
//
//            System.out.println(">>>> Agora digite o ano da TERCEIRA data: ");
//            ano = entrada.nextInt();
//            while (ano<2020){
//            System.out.println("!!! Valor INVÁLIDO !!! digite o ano maior ou igual que o atual: ");
//            ano = entrada.nextInt();
//            }
//            System.out.println("Registro realizado!: ");
//            ano = entrada.nextInt();
//            Days data3 = new Days(dia, mes, ano);
//            System.out.println("--------------------------------------------------------------------");
////            System.out.println(" Tipo do cliente: <"+ tipo+">: " + "Primeira data <"+ data1+">, "
////                    +" Segunda data: <"+ data2+">, "+"Terceira data: <"+ data3+">");
//            System.out.println("--------------------------------------------------------------------");

            entrada.close();

        }
}


//        System.out.println(cliente.customerType);
//        System.out.println(dateOne);
//        System.out.println(dateTwo);
//        System.out.println(dateThree);





