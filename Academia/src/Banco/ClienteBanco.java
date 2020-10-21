package Banco;

public class ClienteBanco {

    String nome;
    String dataNascimento;
    String CPF;
    String endereco;

    public ClienteBanco(){

    }

    public ClienteBanco(String nome, String dataNascimento, String CPF, String endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return " " +
                "O senhor'" + nome + '\'' +
                ", portador do CPF nº'" + CPF + '\'' +
                ", nascido em '" + dataNascimento + '\'' +
                ", residente e domiciliado na '" + endereco + '\'';
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public static void main(String[] args) {
        ClienteBanco novoCliente = new ClienteBanco();
        novoCliente.setNome("Giovanne José Alves");
        novoCliente.setCPF("008.081.034-90");
        novoCliente.setDataNascimento("19/10/1978");
        novoCliente.setEndereco("Rua Paulo Afonos, 65, Barro, Recife");
        System.out.println(novoCliente.toString());


    }
}
