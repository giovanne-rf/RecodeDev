package Construtores;

public class FornecedorEmpresa extends Fornecedor{

    String IE;
    String CNPJ;

    public FornecedorEmpresa(String nome, String fone, String IE, String CNPJ) {
        super(nome, fone);
        this.IE = IE;
        this.CNPJ = CNPJ;
    }

    public String getIE() {
        return IE;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
