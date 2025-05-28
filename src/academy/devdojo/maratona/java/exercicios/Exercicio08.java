package academy.devdojo.maratona.java.exercicios;

/*
    8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima
    na tela os valores em ordem decrescente.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int num3 = sc.nextInt();
        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);

        for (int i = 2; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        sc.close();
     }
}
