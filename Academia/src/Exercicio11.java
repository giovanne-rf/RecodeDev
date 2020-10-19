import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio11 {



    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos numeros você quer digitar? ");
        int repeticao = entrada.nextInt();
        for (int i=0; i<repeticao;i++){
            System.out.println("Digite um numero: ");
            numeros.add(entrada.nextInt());
        }
        for (int j=0; j<repeticao; j++){
            if (numeros.get(j)%2 == 0){
                System.out.println(" Numeros digitados pares: "+numeros.get(j));
            }
        }

    }

}
