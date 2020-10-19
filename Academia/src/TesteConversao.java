public class TesteConversao {

    public static void main(String[] args) {

        float i = 125.0f;
        float j = 23.0f;
        float r1 = (i/j);
        double  r2 = ((double) i/j);
        double r3 =(double) (i/j);

        int r4 = (int) (i/j);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

    }
}
