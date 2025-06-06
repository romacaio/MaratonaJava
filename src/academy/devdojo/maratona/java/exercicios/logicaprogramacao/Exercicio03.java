package academy.devdojo.maratona.java.exercicios.logicaprogramacao;

// 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem
// iguais, deverá somar os dois valores,

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor A: ");
        int a = sc.nextInt();
        System.out.print("Valor B: ");
        int b = sc.nextInt();


        if (a == b) {
            int soma = a + b;
            System.out.println("Soma " + a + " + " + b + " = " + soma);
        } else {
            System.out.println(a + " e " + b + " não são iguais");
        }
        sc.close();
    }

}
