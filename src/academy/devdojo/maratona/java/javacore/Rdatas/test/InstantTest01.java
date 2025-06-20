package academy.devdojo.maratona.java.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {

        Instant now = Instant.now();  // trabalha com nano second e o tempo UTC
        System.out.println(now);
        System.out.println(LocalDateTime.now()); // quando é formatada em texto (como string), ela usa o sufixo Z, que indica Zulu Time.
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        System.out.println(Instant.ofEpochSecond(3, 0));
        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000));
        System.out.println(Instant.ofEpochSecond(3, -1_000_000_000));
    }
}
