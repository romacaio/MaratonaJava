package academy.devdojo.maratona.java.exercicios;

// 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima
// na tela a soma entre A e B é mostre se a soma é menor que C.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor A: ");
        int a = sc.nextInt();

        System.out.print("Valor B: ");
        int b = sc.nextInt();

        System.out.print("Valor C: ");
        int c = sc.nextInt();

        int soma = a + b;

        System.out.println("A + B = " + soma);
        if (soma < c) {
            System.out.println("C: " + c + " é maior que a soma A + B: " + soma);
        } else {
            System.out.println("A soma A + B: " + soma + " é maior que C: " + c);
        }

        sc.close();
    }
}
