public class Poupanca extends Conta{

    public Poupanca(String numero, double saldo) {
        super(numero, saldo);
    }

    public double creditarJuros (double taxa){
        saldo += saldo*taxa;
        return saldo;
    }
}
