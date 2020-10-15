public class Exceptions2 {

    public static void main(String[] args) {

        int vetor [] =  {3, 6,9};
        int index = 3;

        try {
            System.out.println("A terceira posição é " + vetor[index]);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index fora da borda");
        }


    }
}
