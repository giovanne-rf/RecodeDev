public class Horas extends Ponto {


    String ponto  = "<Domingo><08><18><120>"; // variável declarada apenas para evitar o nullpoint exception.
    double coeficienteHoraExtra;
    private static final int HORAS_NORMAIS = 8;
    double valorHoraNormal = Double.parseDouble(ponto.substring(18, 21)); // Quando esvazio o variável 'ponto' recebo um nullpoint exception, porquê?
    double valorHoraExtra;
    int horasExtrasTrabalhadas;
    double valorHorasNormaisTrabalhadas;
    double valorTotalHoras;

    public Horas(String ponto) {
        super(ponto);
    }

    public int horasTrabalhadas(int timeIn, int timeOut) {
        int qtdHoras = timeOut - timeIn;
        return qtdHoras;
    }

    public int horasExtrasTrabalhadas(int horasTrabalhadas) {
        this.horasExtrasTrabalhadas = horasTrabalhadas - 8;
        if (this.horasExtrasTrabalhadas < 0) {
            this.horasExtrasTrabalhadas = 0;
        }
        return this.horasExtrasTrabalhadas;
    }

    public double calculoValorTotal(){
        if (horasExtrasTrabalhadas == 0){
            valorTotalHoras = HORAS_NORMAIS * diasSemana(diaSemana);
        } else {
            valorTotalHoras = (HORAS_NORMAIS * valorHoraNormal) + (horasExtrasTrabalhadas*(valorHoraNormal*diasSemana(diaSemana)));
        }
        return valorTotalHoras;
    }


    public double getValorHoraNormal() {
        return valorHoraNormal;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public double getValorHorasNormaisTrabalhadas() {
        return valorHorasNormaisTrabalhadas;
    }


    public double getValorTotalHoras() {
        return valorTotalHoras;
    }





    public double diasSemana(String diaSemana) {
        switch (diaSemana) {
            case "Domingo":
                return coeficienteHoraExtra = 2;
            case "Segunda":
                return coeficienteHoraExtra = 1.5;

            case "Terça":
                return coeficienteHoraExtra = 1.5;

            case "Quarta":
                return coeficienteHoraExtra = 1.5;

            case "Quinta":
                return coeficienteHoraExtra = 1.5;

            case "Sexta":
                return coeficienteHoraExtra = 1.5;

            case "Sábado":
                return coeficienteHoraExtra = 1.7;


        }

        return 0;
    }
}

