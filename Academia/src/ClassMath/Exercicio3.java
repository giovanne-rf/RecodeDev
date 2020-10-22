package ClassMath;

import java.util.UUID;

public class Exercicio3 {

    public static void main(String[] args) {

        for (int i = 0; i<10; i++){
            double resp =  Math.random()*(50+50) -50;
            System.out.println(i+" [ "+Math.round(resp) +" ]");

        }
        System.out.println(UUID.randomUUID().toString());

    }
}
