package academy.devdojo.maratona.java.exercicios;

// 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.println("Sucessor: " + sucessor);
        System.out.println("Antecessor " + antecessor);

        sc.close();
    }
}
