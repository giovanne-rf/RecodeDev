import java.text.ParseException;

public class Hotels extends Days {

    private String name;
    private int rating;
    private double dailyRate=0.01;

    public Hotels(int day, int month, int year) throws ParseException {
        super(day, month, year);
    }

    public double priceParqueFlores(String isWeekEnd, String customerType) throws ParseException {
        if (dayOfWeek(day, month, year).equalsIgnoreCase("Sat") || dayOfWeek(day, month, year).equalsIgnoreCase("Sun")) {
            if (customerType.equalsIgnoreCase("Fidelidade")) {
                dailyRate = 80;
            } else {
                dailyRate = 90;
            }
        } else
            if (customerType.equalsIgnoreCase("Fidelidade")) {
                dailyRate = 80;
        } else {
            dailyRate = 110;
        };

        return dailyRate;
    };

    public double priceMarAtlantico(String isWeekEnd, String customerType) throws ParseException {
        if (dayOfWeek(day, month, year).equalsIgnoreCase("Sat") || dayOfWeek(day, month, year).equalsIgnoreCase("Sun")) {
            if (customerType.equalsIgnoreCase("Fidelidade")) {
                dailyRate = 40;
            } else {
                dailyRate = 150;
            }
        } else
            if (customerType.equalsIgnoreCase("Fidelidade")) {
                dailyRate = 100;
        } else {
            dailyRate = 220;
        };

        return dailyRate;
    };

    public double priceJardimBotanico(String isWeekEnd, String customerType) throws ParseException {
        if (dayOfWeek(day, month, year).equalsIgnoreCase("Sat") || dayOfWeek(day, month, year).equalsIgnoreCase("Sun")) {
            if (customerType.equalsIgnoreCase("Fidelidade")) {
                dailyRate = 50;
            } else {
                dailyRate = 60;
            }
        } else
            if (customerType.equalsIgnoreCase("Fidelidade")) {
                dailyRate = 110;
        } else {
            dailyRate = 160;
        };

        return dailyRate;
    };

}
