public class Conta {

    String numero;
    double depositoInicial;
    double saldo;

    public Conta(String numero, double depositoInicial) {
        this.numero = numero;
        this.depositoInicial = depositoInicial;
        this.saldo = depositoInicial;
    }


    public double creditar(double credito){
        this.saldo += credito;
        return saldo;
    };

    public double debitar (double debito){
        this.saldo -= debito;
        return saldo;
    };

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

}

