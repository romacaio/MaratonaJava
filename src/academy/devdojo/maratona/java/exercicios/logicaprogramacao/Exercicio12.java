package academy.devdojo.maratona.java.exercicios.logicaprogramacao;

/*
    12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago,
    conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do
    produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o
    cálculo adequado.

    Tabela de Código de Condições de Pagamento

    1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
    2 - À Vista no cartão de crédito, recebe 10% de desconto
    3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
    4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
 */

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do produto: ");
        double valor = sc.nextDouble();

        System.out.println("Escolha uma forma de pagamento: ");
        System.out.println("1. À Vista em Dinheiro ou Pix");
        System.out.println("2. À Vista no cartão de crédito");
        System.out.println("3. Parcelado no cartão em duas vezes");
        System.out.println("4. Parcelado no cartão em três vezes ou mais");

        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Valor original: " + valor + "\n");
                double desconto15 = valor * 0.15;
                System.out.printf("Total a pagar com 15%% de desconto: R$ %.2f", valor - desconto15);
                break;
            case 2:
                System.out.println("Valor original: " + valor + "\n");
                double desconto10 = valor * 0.10;
                System.out.printf("Total a pagar com 10%% de desconto: R$ %.2f", valor - desconto10);
                break;
            case 3:
                System.out.println("Valor original: " + valor + "\n");
                System.out.printf("Valor da parcela 2x sem juros: R$ %.2f", valor / 2);
                break;
            case 4:
                System.out.println("Valor original: " + valor + "\n");
                double juros10 = valor * 0.10;
                System.out.printf("Valor com juros ao parcelar 3x ou mais: R$ %.2f", valor + juros10);
                break;
            default:
                System.out.println("Digite uma opção válida");
        }
        sc.close();
    }
}
