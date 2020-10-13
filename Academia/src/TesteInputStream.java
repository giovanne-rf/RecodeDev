import java.io.IOException;

public class TesteInputStream {
    public static void main(String[] args) {
        try{
            byte mbyte [] = new byte [100];
            System.out.println("Digite sua idade:");
            System.in.read(mbyte);
            String mString = new String (mbyte).trim();
            int idade = Integer.parseInt(mString);
            System.out.println("Idade convertida em int: " + idade);
        } catch (NumberFormatException | IOException e) {
            System.out.println("Erro de conversao");;
        }
    }
}
