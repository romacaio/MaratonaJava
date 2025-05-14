package academy.devdojo.maratona.java.Exercicios;

/*
    21 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
    As informações fornecidas serão: valor da hora aula, número de aulas lecionadas
    no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
 */

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da hora aula: ");
        double valorHoraAula = sc.nextDouble();

        System.out.print("N° aulas lecionadas no mês: ");
        int numAulas = sc.nextInt();

        System.out.println("Percentual de desconto do INSS: ");
        double percentual = sc.nextDouble();

        double salarioBruto = valorHoraAula * numAulas;
        double desconto = salarioBruto * (percentual / 100);
        double salarioLiquido = (salarioBruto - desconto);

        System.out.println("Salário líquido final: " + salarioLiquido);
        System.out.println("Valor do Desconto do INSS no salário (" + salarioBruto + ") : " + desconto);

        sc.close();
    }
}
