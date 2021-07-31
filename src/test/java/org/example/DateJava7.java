package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateJava7 {

    private static String getDate(String date, int N) throws ParseException {
        Date parsedDate = null;
        Calendar calenderDate = new GregorianCalendar();
        calenderDate.setLenient(false);
        SimpleDateFormat d = null;

        try {
            switch (N) {
                case 1:
                    d = new SimpleDateFormat("dd/MM/yyyy");
                    d.setLenient(false);
                    parsedDate = d.parse(date);
                    break;
                case 2:
                    d = new SimpleDateFormat("yyyy.MM.d");
                    d.setLenient(false);
                    parsedDate = d.parse(date);
                    break;
                case 3:
                    d = new SimpleDateFormat("MMM dd, yyyy");
                    d.setLenient(false);
                    parsedDate = d.parse(date);
                    break;
            }
            calenderDate.setTime(parsedDate);
            return calenderDate.get(Calendar.DAY_OF_MONTH) + " " + (calenderDate.get(Calendar.MONTH) + 1) + " " + calenderDate.get(Calendar.YEAR);

        } catch (ParseException ex) {
            return "-1 -1 -1";

        }

    }

    public static void main(String[] args) throws ParseException {
        //     DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //    System.out.println(LocalDate.parse("11/10/2020",f));
        System.out.println(getDate("11/10/2020", 1));
        System.out.println(getDate("2020.11.10", 2));
        System.out.println(getDate("Oct 11, 2020", 3));
        System.out.println(getDate("32/10/2020", 1));
        System.out.println(getDate("11/01/2020", 1));


    }
}
