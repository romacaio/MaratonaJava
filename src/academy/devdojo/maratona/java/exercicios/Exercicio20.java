package academy.devdojo.maratona.java.exercicios;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrada: ");
        int numero = sc.nextInt();

        for (int i = numero; i <= numero; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }
        sc.close();
    }
}
