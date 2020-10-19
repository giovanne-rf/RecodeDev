package Construtores;

class Fornecedor {

    private String nome;
    private String fone;

   public Fornecedor(){
       this ("", "");
   }
    public Fornecedor(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public static void main(String[] args) {

       FornecedorEmpresa novaEmpresa = new FornecedorEmpresa(
               "Ajax Tecidos", "81-996879458", "1.26365.123", "01.,023.0214/0001-20");
        System.out.println(novaEmpresa.getNome());



    }
}
