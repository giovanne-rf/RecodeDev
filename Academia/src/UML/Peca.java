package UML;

public class Peca {
    public String nome;
    protected int cumprimento;
    private int durabilidade;

    public Peca (){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCumprimento() {
        return cumprimento;
    }

    public void setCumprimento(int cumprimento) {
        this.cumprimento = cumprimento;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }
}
