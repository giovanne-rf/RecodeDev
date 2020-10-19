package Enums;

import javax.swing.*;

public class DiasSemana {

    public static void main(String[] args) {
        for (diasSemana dia: diasSemana.values())
            System.out.println(dia);

        for (Meses mes: Meses.values())
            System.out.println(mes);


    }

    public enum diasSemana{
        Segunda, Terça, Quarta, Quinta, Sexta, Sábado, Domingo
    }


}
