package academy.devdojo.maratona.java.exercicios.datahora;

/*
    Mostre a data e hora atual de:
    São Paulo,
    Nova York,
    Tóquio, usando ZonedDateTime e ZoneId.
 */

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Exercicio05 {
    public static void main(String[] args) {
        /*
        Verificar os IDS:

        Set<String> zonas = ZoneId.getAvailableZoneIds();
        System.out.println(zonas);
         */

        System.out.println();
        Instant now = Instant.now();
        ZoneId saoPauloZone = ZoneId.of("America/Sao_Paulo");
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        ZoneId novaYorkZone = ZoneId.of("America/New_York");
        ZonedDateTime zonedSaoPaulo = now.atZone(saoPauloZone);
        ZonedDateTime zonedTokyo = now.atZone(tokyoZone);
        ZonedDateTime zonedNovaYork = now.atZone(novaYorkZone);

        System.out.println("São Paulo: " + zonedSaoPaulo);
        System.out.println("Nova York: " + zonedNovaYork);
        System.out.println("Tóquio: " + zonedTokyo);

    }
}
