package Construtores;

public class TestePessoa {

    public static void main(String[] args) {
         Pessoa novaPessoa = new Pessoa("João Alberto Figueira da Foz", 30, "Avenida Paulista, 1256");
        System.out.println(novaPessoa.nome);
        System.out.println(novaPessoa.idade);
        System.out.println(novaPessoa.endereco);

        Pessoa novaPessoa2 = new Pessoa();
        System.out.println(" --------- ");
        System.out.println(novaPessoa2.nome);
        System.out.println(novaPessoa2.idade);
        System.out.println(novaPessoa2.endereco);


    }
}
