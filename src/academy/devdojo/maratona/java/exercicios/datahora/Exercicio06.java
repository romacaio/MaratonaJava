package academy.devdojo.maratona.java.exercicios.datahora;

/*
    Crie um OffsetDateTime com UTC-3 (Brasil).
    Formate para mostrar "yyyy-MM-dd HH:mm:ssxxx".
 */

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Exercicio06 {
    public static void main(String[] args) {
        ZoneOffset offset = ZoneOffset.of("-03:00");
        LocalDateTime now = LocalDateTime.now();
        OffsetDateTime offsetBrasil = now.atOffset(offset);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssxxx");
        System.out.println(dtf.format(offsetBrasil));
    }
}
