package academy.devdojo.maratona.java.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20250602", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-06-02", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2025-06-02", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println();
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println();
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2025-06-02T13:21:00.4878002", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String s5 = LocalDate.now().format(formatterBr);
        System.out.println();
        System.out.println(s5);
        LocalDate parseBr = LocalDate.parse("02/06/2025", formatterBr);
        System.out.println(parseBr);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyy", Locale.GERMAN);
        String formatGr = LocalDate.now().format(formatterGR);
        System.out.println();
        System.out.println(formatGr);
        LocalDate parseGr = LocalDate.parse("02.Juni.2025",formatterGR);
        System.out.println(parseGr);

    }
}
