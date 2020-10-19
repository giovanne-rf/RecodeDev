package Construtores;


public class ValidarRG {
    public static void main(String[] args) {

        String rg = "25636890-5";
        String[] digito = rg.split("-");
        int numero = Integer.parseInt(digito[0]);
        int soma = 0;
        int digito2 = Integer.parseInt(digito[1]);

        String numeroEmTexto = digito[0];
        int[] array = new int[numeroEmTexto.length()];
        for (int i = 0; i < numeroEmTexto.length(); i++) {
            array[i] = Character.getNumericValue(numeroEmTexto.charAt(i));
            soma += array[i];
        }

        System.out.println(soma);
        System.out.println(numero);

        if (soma%11 == digito2){
            System.out.println(" RG correto");
        } else {
            System.out.println("RG incorreto");
        }

    }
}

