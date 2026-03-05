package net.saturn;


import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));

       // cal.add(Calendar.DAY_OF_YEAR, 1); // to subtract amount: -1

        System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "/" +
                cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.YEAR));

        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE));


    }
}