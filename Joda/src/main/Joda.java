package main;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;

import java.util.*;

public class Joda {

    public static void main(String[] args) {

        DateTime dataInicial = new DateTime(2012, 12, 1, 12, 0);
        DateTime dataFinal = new DateTime(2012, 12, 1, 12, 30);
        DateTime feriado = new DateTime(2012, 12, 25, 12, 0);

        int dias = Days.daysBetween(dataInicial, dataFinal).getDays();
        int horas = Hours.hoursBetween(dataInicial, dataFinal).getHours();
        int minutos = Minutes.minutesBetween(dataInicial, dataFinal).getMinutes();

        System.out.println(minutos);

    }
}