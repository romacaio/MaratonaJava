package academy.devdojo.maratona.java.exercicios;

/*
    11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das notas
    obtidas, imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado. Para o aluno
    ser considerado aprovado sua média final deve ser maior ou igual a 7.
 */

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Terceira nota: ");
        double nota3 = sc.nextDouble();
        System.out.print("Quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media < 7) {
            System.out.println("Aluno: " + nome + ", Reprovado");
        } else {
            System.out.println("Aluno: " + nome + ", Aprovado");
        }

        sc.close();
    }
}
