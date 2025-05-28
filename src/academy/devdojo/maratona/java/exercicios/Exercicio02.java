package academy.devdojo.maratona.java.exercicios;

// 2 - Faça um algoritmo para receber um número qualquer e imprimir na
// tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            if (num > 0) {
                System.out.println(num + " é par e positivo");
            } else {
                System.out.println(num + " é par e negativo");
            }
        } else {
            if (num > 0) {
                System.out.println(num + " é ímpar e positivo");
            } else {
                System.out.println(num + " é impar e negativo");
            }
        }
        sc.close();
    }
}
