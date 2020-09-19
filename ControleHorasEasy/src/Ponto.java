public class Ponto {


    String ponto;
    String diaSemana;
    int timeIn ;
    int timeOut ;

    public Ponto(String ponto) {
        this.ponto = ponto;
        diaSemana = ponto.substring(1, 8);
        timeIn =Integer.parseInt(ponto.substring(10, 12));
        timeOut =Integer.parseInt(ponto.substring(14, 16));
    }

    public String getPonto() {
        return ponto;
    }

    public void setPonto(String ponto) {
        this.ponto = ponto;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public int getTimeIn() {
        return timeIn;
    }


    public int getTimeOut() {
        return timeOut;
    }


}
