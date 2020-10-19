package ArraysLists;

import javax.swing.*;
import java.util.ArrayList;

public class ExercicioTimesFutebol {

    public static void main(String[] args) {

        ArrayList<Times> serieA = new ArrayList<>();
        int qtdTimes = Integer.parseInt(JOptionPane.showInputDialog("Quantos times vai inserir?"));
         for (int i=0;  i<qtdTimes; i++){
             serieA.add(new Times(JOptionPane.showInputDialog("Nome do time")));
         }
        for (int i = 0; i< serieA.size(); i++){
            System.out.println("Times da série A: " + serieA.get(i));
    }
}
}
