
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Days {

    int day;
    int month;
    int year;
    String diaSemana;
    Calendar bookingDate = null;


    public Days(int day, int month, int year) throws ParseException {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String dayOfWeek(int day, int month, int year) throws ParseException {
        String data = "" + day + month + year;
        SimpleDateFormat formatedDate = new SimpleDateFormat("ddMMyyyy");
        Date date = formatedDate.parse(data);
        bookingDate = Calendar.getInstance();
        bookingDate.setTime(date);
        int weekDay = bookingDate.get(Calendar.DAY_OF_WEEK);

        switch (weekDay) {
            case 1:
                diaSemana = "Mon";
                break;
            case 2:
                diaSemana = "Tue";
                break;
            case 3:
                diaSemana = "Wed";
                break;
            case 4:
                diaSemana = "Thru";
                break;
            case 5:
                diaSemana = "Fri";
                break;
            case 6:
                diaSemana = "Sat";
                break;
            default:
                diaSemana = "Sun";
        }
        return diaSemana;
    };

    public String MonthOfYear(int day, int month, int year) throws ParseException {
        String data = "" + day + month + year;
        SimpleDateFormat DataFornecida = new SimpleDateFormat("ddMMyyyy");
        Date date = DataFornecida.parse(data);
        Date data2 = new Date(date.getTime());
        DateFormat formato = new SimpleDateFormat("MMM");
        return formato.format(data2);
    }


    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}







