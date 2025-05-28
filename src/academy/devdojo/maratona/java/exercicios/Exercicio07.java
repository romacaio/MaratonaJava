package academy.devdojo.maratona.java.exercicios;

// 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine
// se ambos são VERDADEIRO ou FALSO.

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor (true/false): ");
        boolean num = sc.nextBoolean();

        if (num) {
            System.out.println("É verdadeiro");
        } else {
            System.out.println("É falso");
        }

        sc.close();
    }
}
