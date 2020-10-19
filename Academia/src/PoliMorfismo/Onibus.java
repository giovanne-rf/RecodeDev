package PoliMorfismo;

public class Onibus extends Veiculo{

    private  int passageiros;

    public Onibus(String placa, int ano, int passageiros) {
        super(placa, ano);
        this.passageiros = passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public int getPassageiros() {
        return passageiros;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println(this.getPassageiros());
        System.out.println(this.getPlaca());
        System.out.println(super.getAno());
    }
}
