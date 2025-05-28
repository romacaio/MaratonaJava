package academy.devdojo.maratona.java.exercicios;

import java.util.Scanner;

/*
    22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o
    quociente e o resto da divisão inteira entre eles.
 */

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor1 : ");
        int valor1 = sc.nextInt();
        System.out.print("Valor2: ");
        int valor2 = sc.nextInt();

        int resto = valor1 % valor2;

        System.out.println("Resto da divisão entre " + valor1 + " / " + valor2 + " = " + resto);

        sc.close();
    }
}
