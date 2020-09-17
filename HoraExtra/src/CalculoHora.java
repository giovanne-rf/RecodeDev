import javax.xml.transform.sax.SAXSource;
import java.util.ArrayList;
import java.util.Scanner;

public class CalculoHora {

    public static void main(String[] args) {

        Scanner entrada =  new Scanner(System.in);
        System.out.println("Quantos dias você trabalhou? ");
        int count = entrada.nextInt();
        ArrayList<String> ponto = new ArrayList();

        for (int i = 0; i<=count; i++) {
            System.out.println(" Digite o dia da semana trabalhado: ");
            String day = entrada.nextLine();

            System.out.println(" Digite a hora que você começou a trabalhar: [ 00 - 24] ");
            String TimeIn = entrada.nextLine();

            System.out.println(" Digite a hora que você terminou a trabalhar: [ 00 - 24] ");
            String TimeOut = entrada.nextLine();

            ponto.add(TimeIn+TimeOut);

        }

        System.out.println(ponto);

        entrada.close();
    }
}
