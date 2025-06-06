package academy.devdojo.maratona.java.exercicios.logicaprogramacao;

/*
    16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e
    verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.
 */

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Lado1: ");
        int lado1 = sc.nextInt();
        System.out.println("Lado2: ");
        int lado2 = sc.nextInt();
        System.out.println("Lado3 : ");
        int lado3 = sc.nextInt();

        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("equilátero");
        } else if (lado1 == lado2 || lado2 == lado3) {
            System.out.println("isósceles");
        } else {
            System.out.println("escaleno");

        }
        sc.close();
    }
}
