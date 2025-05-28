package academy.devdojo.maratona.java.exercicios;

/*
    4 - Faça um algoritmo que receba um valor A e B, e troque o valor de A
    por B e o valor de B por A e imprima na tela os valores.
 */

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor A: ");
        int a = sc.nextInt();
        System.out.print("Valor B: ");
        int b = sc.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("Valor A: " + a );
        System.out.println("Valor B: " + b);

        sc.close();
    }
}
