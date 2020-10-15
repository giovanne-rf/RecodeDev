import javax.swing.*;

public class Algebra {

    public static void main(String[] args) {

        int numero1= Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1: "));
        int numero2= Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2: "));

        if (numero1 >numero2){
            for (int i=numero2; i<numero1; i++){
                System.out.println( i + " ---> " + i*i);
            }
        }else if(numero1 <numero2){
            for (int i=numero1; i<numero2;i++){
                System.out.println( i + " ---> " + i*i);
            }
        }
    }

}
