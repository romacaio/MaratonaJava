package academy.devdojo.maratona.java.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.of(2026, Month.AUGUST, 6);
        LocalTime localTime = LocalTime.of(9, 45, 21);
        LocalDate localDateParse = LocalDate.parse("2026-08-06"); // através de uma String
        LocalTime localTimeParse = LocalTime.parse("09:45:00");

        System.out.println("LocalDateTime " + localDateTime);
        System.out.println("localDateParse " + localDateParse);
        System.out.println("localTimeParse " + localTimeParse);

        System.out.println();
        LocalDateTime ldt1 = localDate.atTime(localTime); // atribuindo um time a um LocalDate
        LocalDateTime ldt2 = localTime.atDate(localDate); // atribuindo um date a um LocalTime
        System.out.println("ldt1 " + ldt1);
        System.out.println("ldt2 " + ldt2);


    }

}

