public class inverterString {

    public static void main(String[] args) {

        // Crie um programa que leia seu nome e imprima-o na
        // ordem invertida. Exemplo bonito: Marcos - socraM

        String nome = new String("Giovanne José Alves Pereira");
        String nomeInvertido = "";

        System.out.println(nome);

        for (int i=nome.length()-1; i>-1; i--){
            nomeInvertido += nome.charAt(i);
        }

        System.out.println(nomeInvertido);
    }
}
