package ArraysLists;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ExercicioTimesFutebol {

    public static void main(String[] args) {

        ArrayList<Times> serieA = new ArrayList<>();
        int qtdTimes = Integer.parseInt(JOptionPane.showInputDialog("Quantos times vai inserir?"));
         for (int i=0;  i<qtdTimes; i++){
             serieA.add(new Times(JOptionPane.showInputDialog("Nome do time")));
         }

        Iterator<Times> it = serieA.iterator();
        System.out.println(it.next());


//        for (int i = 0; i< serieA.size(); i++){
//            System.out.println("Times da série A: " + serieA.get(i));
//    }
        Times excluido = serieA.get(2);
        System.out.println("Time a ser removido: " + excluido);
        serieA.remove(6);

        Iterator<Times> it2 = serieA.iterator();
        System.out.println(it2.next());


//        for (int i = 0; i< serieA.size(); i++){
//            System.out.println("Times da série A: " + Iterator<serieA>);
//        }




    }
}
