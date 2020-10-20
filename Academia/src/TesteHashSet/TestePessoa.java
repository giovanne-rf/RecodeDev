package TesteHashSet;

import java.util.HashMap;
import java.util.Map;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Giovanne", "008.081.034-90");
        Pessoa p2 = new Pessoa("Eryca Pinheiro", "003.136.123-40");
        Pessoa p3 = new Pessoa("Josinalda Alves", "127.103.123-40");
        Pessoa p4 = new Pessoa("Fernando Alves", "256.369.100-56");

        HashMap pessoasHash = new HashMap();
        inserirPEssoa("008.081.034-90", p1, "008.081.034-90", pessoasHash);


        }

        public static void inserirPEssoa(String cpf, Pessoa pessoa, String s, HashMap pessoasHash) {
            if (!pessoasHash.containsKey(cpf)){
                pessoasHash.put(cpf, pessoa);

            } else {
                System.out.println("CPF não cadastrado");
            }
    }



}
