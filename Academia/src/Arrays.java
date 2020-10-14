import javax.swing.*;

public class Arrays {

    public static void main(String[] args) {

        int[] vetor = new int[3];
        for (int i=0; i< vetor.length;i++){
             vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        }
        int [] vetorB = new int[3];
        for (int j=0; j<vetorB.length; j++){
            vetorB[j]=vetor[j]*=vetor[j];
        }

        for (int k=0; k<vetor.length; k++){
            System.out.println(vetor[k] + " ");

            for (int l=0; l<vetorB.length; l++){
                System.out.print(vetorB[l] + " ");
            }

            }






        }

}
