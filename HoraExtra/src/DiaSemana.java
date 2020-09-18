public enum DiaSemana {

    Domingo (2),
    Segunda (1.5),
    Terça (1.5),
    Quarta (1.5),
    Quinta (1.5),
    Sexta(1.5),
    Sábado (1.7);


    public double coeficiente;

     DiaSemana(double coeficiente){
        this.coeficiente=coeficiente;
    }

    public double getCoeficiente() {
        return coeficiente;
    }
}






