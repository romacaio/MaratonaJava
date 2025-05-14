package academy.devdojo.maratona.java.Exercicios;

/*
    15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e
    dias essa pessoa ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.
    (Ex: 5 anos, 2 meses e 15 dias de vida).
 */

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiaExercio15 objdata = new DiaExercio15(2025, 5, 14);

        System.out.print("Ano que nasceu: ");
        int anoNascimento = sc.nextInt();
        System.out.print("Mês que nasceu: ");
        int mesNascimento = sc.nextInt();
        System.out.print("Dia que nasceu: ");
        int diaNascimento = sc.nextInt();

        int ano = objdata.ano - anoNascimento;
        int mes = objdata.mes - mesNascimento;
        int dia = objdata.dia - diaNascimento;

        if (mes < 0) {
            ano -= 1;
            mes += 12;
        }
        if (dia < 0) {
            mes -= 1;
            dia += 30;
        }

        System.out.println("Essa pessoa viveu: " + ano + " anos, " + mes + " meses, e " + dia + " dias de vida.");

        sc.close();

    }
}
