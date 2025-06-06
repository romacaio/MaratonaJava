package academy.devdojo.maratona.java.exercicios.logicaprogramacao;

// 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = sc.nextDouble();
        double bonus = valor * 0.05;
        double reajuste = valor + bonus;

        System.out.println(valor + " com reajuste de 5%: " + reajuste);

        sc.close();
    }
}
