package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LocalDate8Qqtn {
    private static DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy.MM.dd");
    private static DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MMM dd, yyyy");

    private static void printDate(String date, int type) {
        LocalDate parsedDate = null;
        try {


            switch (type) {
                case 1:
                    parsedDate = LocalDate.parse(date, formatter1);
                    break;
                case 2:
                    parsedDate = LocalDate.parse(date, formatter2);
                    break;
                case 3:
                    parsedDate = LocalDate.parse(date, formatter3);

            }
            System.out.println(parsedDate.getDayOfMonth() + " " + parsedDate.getMonthValue() + " " + parsedDate.getYear());
        } catch (DateTimeParseException ex) {
            System.out.println("-1 -1 -1");

        }
        System.out.println("-------------------------");

    }

    public static void main(String[] args) {
        //     DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //    System.out.println(LocalDate.parse("11/10/2020",f));
        printDate("11/10/2020", 1);
        printDate("2020.11.10", 2);
        printDate("Oct 11, 2020", 3);
        printDate("32/10/2020", 1);
        printDate("11/01/2020", 1);


    }
}

