package Construtores;

class FornecedorPessoa extends Fornecedor {

    String RG;
    String CPF;

    public FornecedorPessoa(String nome, String fone, String RG, String CPF) {
        super(nome, fone);
        this.RG = RG;
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
