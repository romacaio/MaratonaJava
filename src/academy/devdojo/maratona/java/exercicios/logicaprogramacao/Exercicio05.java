package academy.devdojo.maratona.java.exercicios.logicaprogramacao;

// 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
// calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado.
// (Base para o Salário mínimo R$ 1.293,20).

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor salário mínimo: R$ ");
        double salarioMin = sc.nextDouble();

        System.out.print("Valor do seu salário: R$ ");
        double salarioUsuario = sc.nextDouble();

        double calculo = salarioUsuario / salarioMin;

        System.out.println("Você ganha " + calculo + " salários mínimos");

        sc.close();
    }
}
