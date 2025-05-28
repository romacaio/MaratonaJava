package academy.devdojo.maratona.java.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {

        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        LocalDateTime now = LocalDateTime.now();

        System.out.println();

        System.out.println(now);
        ZonedDateTime zonedDateTime1 = now.atZone(tokyoZone);
        System.out.println(zonedDateTime1);

        Instant nowInstant = Instant.now();
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);

        System.out.println();

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetManaus);
        System.out.println(offsetDateTime3);

        System.out.println();
        JapaneseDate japaneseDate1 = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate1);
        LocalDate meijiEra = LocalDate.of(1900, 2, 1);
        JapaneseDate japaneseDate2 = JapaneseDate.from(meijiEra);
        System.out.println(japaneseDate2);
    }
}
