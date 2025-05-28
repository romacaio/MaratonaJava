package academy.devdojo.maratona.java.exercicios.datahora;

/*
    Crie um programa que mostre a data e hora atual no formato: dd/MM/yyyy HH:mm:ss.
 */

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Exercicio01 {
    public static void main(String[] args) {

        // Usando o LocalDateTime
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        // Usando o Date
        SimpleDateFormat sdf = new SimpleDateFormat("d/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(sdf.format(date));

        // Usando o Calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println(sdf.format(calendar.getTime()));
    }
}
