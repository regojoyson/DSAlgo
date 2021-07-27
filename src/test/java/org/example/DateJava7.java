package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateJava7 {

    private static void printDate(String date, int type) throws ParseException {
        Date parsedDate = null;
        Calendar calenderDate = new GregorianCalendar();
        calenderDate.setLenient(false);
        SimpleDateFormat d = null;

        try {
            switch (type) {
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
            System.out.println(calenderDate.get(Calendar.DAY_OF_MONTH) + " " + (calenderDate.get(Calendar.MONTH) + 1) + " " + calenderDate.get(Calendar.YEAR));

        } catch (ParseException ex) {
            System.out.println("-1 -1 -1");

        }
        System.out.println("-------------------------7");
    }

    public static void main(String[] args) throws ParseException {
        //     DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //    System.out.println(LocalDate.parse("11/10/2020",f));
        printDate("11/10/2020", 1);
        printDate("2020.11.10", 2);
        printDate("Oct 11, 2020", 3);
        printDate("32/10/2020", 1);
        printDate("11/01/2020", 1);


    }
}
