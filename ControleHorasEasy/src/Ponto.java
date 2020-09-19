public class Ponto {


    String ponto;
    String diaSemana;
    int timeIn ;
    int timeOut ;

    public Ponto(String ponto) {
        this.ponto = ponto;
        String [] entradaSplit = ponto.split(" ");
        diaSemana = entradaSplit[0];
        timeIn =Integer.parseInt(entradaSplit[1]);
        timeOut =Integer.parseInt(entradaSplit[2]);
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
