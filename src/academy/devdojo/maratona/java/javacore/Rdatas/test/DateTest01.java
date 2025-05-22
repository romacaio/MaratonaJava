package academy.devdojo.maratona.java.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000); // long ms
        System.out.println(date);
        date = new Date(); // agora
        System.out.println(date.getTime()); // ms do date atual
        date = new Date(1747917638431L);
        System.out.println(date);
        date.setTime(date.getTime() - 3_600_000); // adicionando 1 hora
        System.out.println(date);
    }
}
