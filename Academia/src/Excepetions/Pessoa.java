package Excepetions;

public class Pessoa {

    String nome;
    byte idade;
    public Pessoa (String nome, byte idade) throws IdadeInvalidaException{
        setNome(nome);
        setIdade(idade);
    }
    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade)  throws IdadeInvalidaException {
        if (idade < 0 || idade > 120) {
            throw new IdadeInvalidaException("idade inválida");
        } else {
            this.idade = idade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




}



