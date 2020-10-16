package PoliMorfismo;

public class Veiculo {

    private String placa;
    private int ano;

    public Veiculo(){
    }

    public Veiculo (String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public void mostrarDados(){
    }

    public static void main(String[] args) {
         Veiculo caminhao = new Caminhao();
         Onibus onibus = new Onibus("KGB-3656", 2020, 50);
         caminhao.setAno(2019);
         caminhao.setAno(2019);
         caminhao.setPlaca("PGD-2369");
         caminhao.mostrarDados();
         onibus.mostrarDados();

    }
}
