package main;

import java.util.Calendar;

public class main {

    public static void main(String[] args) {


        Calendar data1 = Calendar.getInstance();
        Calendar data2 = Calendar.getInstance();
        Calendar data3 = Calendar.getInstance();
        data1.set(20, 0, 20);
        data2.set(20, 2, 25);

        long diferencaDatas = data1.getTimeInMillis() - data2.getTimeInMillis();

        data3.setTimeInMillis(diferencaDatas);



    }

}
