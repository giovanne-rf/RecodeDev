package ClassMath;

public class Aleatorio {

    public static void main(String[] args) {

        double numero = Math.random()*150;

        double res = Math.floor(Math.min(Math.PI, Math.E)) - Math.ceil((Math.max(Math.E, Math.random())));

        double resp2 =  Math.pow (Math.floor(Math.max(Math.E, Math.random())), Math.ceil(Math.max(Math.PI, Math.random())));



        System.out.println(Math.abs(numero));
        System.out.println(res);
        System.out.println(resp2);
    }


}
