package PoliMorfismo;

public class Caminhao extends Veiculo{

    private int pesoCarga;

    public Caminhao (){

    }

    public Caminhao(String placa, int ano, int pesoCarga) {
        super(placa, ano);
        this.pesoCarga = pesoCarga;
    }

    public int getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(int pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    @Override
    public void mostrarDados() {
            super.mostrarDados();
            System.out.println(this.getPesoCarga());
            System.out.println(this.getPlaca());
            System.out.println(super.getAno());
    }
}
