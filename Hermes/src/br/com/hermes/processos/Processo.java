package br.com.hermes.processos;

public class Processo {

    public String numero;
    public String ano;
    public String autores;
    private String jurisdicao ;
    private String tribunal ;
    private String vara;

    public Processo(String numero, String autores) {
        this.numero = numero;
        this.autores = autores;
        this.ano = numero.substring(11,15);
    }

    @Override
    public String toString() {
        return "Processo{" +
                "numero='" + numero + '\'' +
                ", autores='" + autores + '\'' +
                '}';
    }
}
