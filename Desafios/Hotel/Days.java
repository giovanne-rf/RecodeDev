
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Days {

    int day;
    int month;
    int year;
    String DayOfweek;


	


    public Days(int day, int month, int year) throws ParseException {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String ChooseDays (int day, int month, int year) throws ParseException {
        String data = ""+ day + month + year;
        SimpleDateFormat DataFornecida = new SimpleDateFormat("ddMMyyyy");
        Date date = DataFornecida.parse(data);
//            System.out.println("--------------------");
//            System.out.println("Milis "+date.getTime());
        Date data2 = new Date(date.getTime());
//            System.out.println("Data refeita: "+data2);
//            System.out.println("--------------------");
        DateFormat formato = new SimpleDateFormat("EEEE','dd 'de' MMMM 'de' yyyy");
//            System.out.println(formato.format(data2));
//            System.out.println("--------------------");
        return formato.format(data2);
    }

    public String WeekDay (int day, int month, int year) throws ParseException {
        String data = ""+ day + month + year;
        SimpleDateFormat DataFornecida = new SimpleDateFormat("ddMMyyyy");
        Date date = DataFornecida.parse(data);
        Date data2 = new Date(date.getTime());
        DateFormat formato = new SimpleDateFormat("EEEE");
        return formato.format(data2);
    }

    public String MonthOfYear (int day, int month, int year) throws ParseException {
        String data = ""+ day + month + year;
        SimpleDateFormat DataFornecida = new SimpleDateFormat("ddMMyyyy");
        Date date = DataFornecida.parse(data);
        Date data2 = new Date(date.getTime());
        DateFormat formato = new SimpleDateFormat("MMM");
        return formato.format(data2);
    }

    public void DayOfWeek (String DayWeek){
            switch (DayWeek){
            case "Segunda-feira":
                DayOfweek = "Mon";
                break;
            case "Terça-feira":
                DayOfweek = "Tue";
                break;
            case "Quarta-feira":
                DayOfweek = "Wed";
                break;
            case "Quinta-feira":
                DayOfweek = "Thru";
                break;
            case "Sexta-feira":
                DayOfweek = "Fri";
                break;
            case "Sábado":
                DayOfweek = "Sat";
                break;
            default:
                DayOfweek = "Sun";
        }
    };

    public void monthsOfYear (String DayWeek){
        switch (DayWeek){
            case "Segunda-feira":
                DayOfweek = "Mon";
                break;
            case "Terça-feira":
                DayOfweek = "Tue";
                break;
            case "Quarta-feira":
                DayOfweek = "Wed";
                break;
            case "Quinta-feira":
                DayOfweek = "Thru";
                break;
            case "Sexta-feira":
                DayOfweek = "Fri";
                break;
            case "Sábado":
                DayOfweek = "Sat";
                break;
            default:
                DayOfweek = "Sun";
        }
    };

    @Override
    public String toString() {
        return day +"/"+ month  +"/"+ year;
    }



//
//    Long dataInicialMilis = Long.parseLong(String.valueOf(date.getTime())); // equivale a 01/01/1930
//    long dataAtualMilis = new Date().getTime(); // data atual em milisegundos
//        System.out.println(dataAtualMilis);
//    int count = 0;
//        while (count < 3) {
//        Long milis = (long) (dataAtualMilis + (Math.random() * (dataAtualMilis + 1)));
//
//        System.out.println(new Date(milis));
//
//        count++;
//    }


}





