package ExercicioSuper;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private ArrayList<Endereco> endereco = new ArrayList<Endereco>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(ArrayList<Endereco> endereco) {
        this.endereco = endereco;
    }
}
