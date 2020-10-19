package ToString;

import Excepetions.IdadeInvalidaException;

public class sobrEscrita {

        private String nome;
        private int idade;
        private String endereco;
        private String tel;

        public sobrEscrita (String nome, int idade,String endereco, String tel){
            this.nome = nome;
            this.idade = idade;
            this.endereco = endereco;
            this.tel = tel;	}

        public static void main (String args[]) throws IdadeInvalidaException {
            Pessoa p = new Pessoa("Leandro", (byte) 25);
            String str = p.toString();
            System.out.println(str + "\n");
            System.out.println(p);
        }
}

