package org.example;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LocalDate8Qqtn {
    private static DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy.MM.dd");
    private static DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MMM dd, yyyy");

    private static String getDate(String date, int N) {
        LocalDate parsedDate = null;
        try {

            switch (N) {
                case 1:
                    parsedDate = LocalDate.parse(date, formatter1);
                    break;
                case 2:
                    parsedDate = LocalDate.parse(date, formatter2);
                    break;
                case 3:
                    parsedDate = LocalDate.parse(date, formatter3);

            }
            return parsedDate.getDayOfMonth() + " " + parsedDate.getMonthValue() + " " + parsedDate.getYear();
        } catch (DateTimeParseException ex) {
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

