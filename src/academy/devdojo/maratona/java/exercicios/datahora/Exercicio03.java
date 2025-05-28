package academy.devdojo.maratona.java.exercicios.datahora;

/*
    Pegue dois instantes (Instant) separados por um Thread.sleep(2000).
    Calcule a Duration entre eles e imprima quantos segundos se passaram.
 */

import java.time.Duration;
import java.time.Instant;

public class Exercicio03 {
    public static void main(String[] args) throws InterruptedException {
        Instant incio = Instant.now();
        Thread.sleep(2000);
        Instant fim = Instant.now();

        Duration duracao = Duration.between(incio,fim);
        System.out.println("Duração: " + duracao.getSeconds() + " segundos");
    }
}
