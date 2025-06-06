package academy.devdojo.maratona.java.exercicios.logicaprogramacao;

/*
    18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros
     por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que
     Sara seja maior que Francisco.
 */

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anos = 0;
        double francisco = 1.50;
        double sara = 1.10;

        while (sara < francisco) {
            francisco += 0.02;
            sara += 0.03;
            anos++;
        }
        System.out.println("Serão necessários " + anos + " anos para que Sara seja maior que Francisco");

        sc.close();

    }
}
