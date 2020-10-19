package ArraysLists;

public class Times {

    String nome;
    String torcida;

    public Times(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTorcida() {
        return torcida;
    }

    public void setTorcida(String torcida) {
        this.torcida = torcida;
    }

    @Override
    public String toString() {
        return nome;
    }
}




