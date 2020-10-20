package ExercicioSuper;

public class Endereco {

    private String logradouro;
    private String complemento;
    private int numero;

    public String getLogradouro(String s) {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco na " + logradouro + ", " + numero +  ", complemento " +
                complemento;
    }
}
