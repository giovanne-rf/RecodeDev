public class Hotels {

    String name;
    int rating;
    double DailyRate;
    
    public double ParqueDaFlores (String dayOfWeek, String customerType){
        name = "Parque da Flores";
                rating = 3;
        if (dayOfWeek.equalsIgnoreCase("sábado") || dayOfWeek.equalsIgnoreCase("domingo")){
                if (customerType.equalsIgnoreCase("Regular")){
                DailyRate = 90;
                 } else if (customerType.equalsIgnoreCase("Fidelidade")){
                DailyRate = 80;
                }
                // dias normais:
        } else {
            if (customerType.equalsIgnoreCase("Regular")){
                DailyRate = 110;
            } else if (customerType.equalsIgnoreCase("Fidelidade")){
                DailyRate = 80;
            }
        }
        return DailyRate;
    }

    public double JardimBotanico (String dayOfWeek, String customerType){
        name = "Jardim Botânico";
        rating = 4;
        if (dayOfWeek.equalsIgnoreCase("sábado") || dayOfWeek.equalsIgnoreCase("domingo")){
            if (customerType.equalsIgnoreCase("Regular")){
                DailyRate = 60;
            } else if (customerType.equalsIgnoreCase("Fidelidade")){
                DailyRate = 50;
            }
            // dias normais:
        } else {
            if (customerType.equalsIgnoreCase("Regular")){
                DailyRate = 160;
            } else if (customerType.equalsIgnoreCase("Fidelidade")){
                DailyRate = 110;
            }
        }
        return DailyRate;
    }

    public double MarAtlantico (String dayOfWeek, String customerType){
        name = "Mar Atlântico";
        rating = 5;
        if (dayOfWeek.equalsIgnoreCase("sábado") || dayOfWeek.equalsIgnoreCase("domingo")){
            if (customerType.equalsIgnoreCase("Regular")){
                DailyRate = 150;
            } else if (customerType.equalsIgnoreCase("Fidelidade")){
                DailyRate = 40;
            }
            // dias normais:
        } else {
            if (customerType.equalsIgnoreCase("Regular")){
                DailyRate = 220;
            } else if (customerType.equalsIgnoreCase("Fidelidade")){
                DailyRate = 100;
            }
        }
        return DailyRate;
    }

    @Override
    public String toString() {
        return "Hotels{" +
                "nome='" + name + '\'' +
                ", rating=" + rating +
                ", DailyRate=" + DailyRate +
                '}';
    }
}
