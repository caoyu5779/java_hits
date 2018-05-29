package Test;

import java.util.Calendar;
import java.util.Date;

public class Unit {
    public static void main(String[] args) {
        String date = String.format("%tc", new Date());
        System.out.println(date);

        Calendar cal = Calendar.getInstance();
        cal.set(2018,5,28,17,00,11);
        long day1 = cal.getTimeInMillis();
        System.out.println(day1);


    }
}
