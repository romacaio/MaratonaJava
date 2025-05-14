package academy.devdojo.maratona.java.Exercicios;

/*
    13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da
    pessoa e se ela é maior ou menor de idade.
 */

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        if (idade < 18) {
            System.out.println(nome + ",menor de idade");
        } else {
            System.out.println(nome + ",maior de idade");
        }

        sc.close();
    }
}
