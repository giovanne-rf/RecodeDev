package Ponto;

public class Ponto {

    String dayWeek;
    int timeIn;
    int timeOut;
    double plus;

    public Ponto(String dayWeek, int timeIn, int timeOut) {
        this.dayWeek = dayWeek;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

    public double valorHoraExtra (int timeIn, int timeOut, double plus){
        double valorHorasExtras = 0;
        double horasExtrasTrabalhadas=0;
        int horasTrabalhadas =  timeOut - timeIn;
        if ((horasTrabalhadas>8)) {
            horasExtrasTrabalhadas = (horasTrabalhadas-8);
        } else {
            horasTrabalhadas = 0;
        }

        valorHorasExtras = horasExtrasTrabalhadas*plus;


        return valorHorasExtras;
    }
}
