package academy.devdojo.maratona.java.javacore.Rdatas.test;


import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;


public class LocalDateTest01 {
    public static void main(String[] args) {

        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        LocalDate date = LocalDate.of(2022, Month.JANUARY, 13);
        LocalDate agora = LocalDate.now();
        agora = agora.plusDays(2);

        System.out.println(date.getYear());  // ano
        System.out.println(date.getMonth());  // mês
        System.out.println(date.getMonthValue());  // valor do mês (inteiro)
        System.out.println(date.getDayOfWeek());   // dia da semana
        System.out.println(date.getDayOfMonth());  // dia do mês
        System.out.println(date.lengthOfMonth());  // tamanho do mês (dias)
        System.out.println(date.isLeapYear());  // se é um ano bissexto (boolean)

        System.out.println();

        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_WEEK));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));

        System.out.println(date); // Padrão ISO
        System.out.println(agora);

        System.out.println();
        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.MAX);
    }
}
