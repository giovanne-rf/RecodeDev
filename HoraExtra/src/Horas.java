public class Horas extends Ponto {


    String ponto;
    double coeficienteHoraExtra;
    private static final int HORAS_NORMAIS = 8;
    double valorHoraNormal = Double.parseDouble(ponto.substring(18, 21));
    double valorHoraExtra;
    private int horasExtrasTrabalhadas;
    double valorHorasNormaisTrabalhadas;
    double valorTotalHoras;

    public Horas(String ponto) {
        super(ponto);
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

