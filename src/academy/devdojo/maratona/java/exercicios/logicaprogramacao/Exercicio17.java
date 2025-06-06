package academy.devdojo.maratona.java.exercicios.logicaprogramacao;

/*
    17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau
    Celsius. Imprima na tela as duas temperaturas. Fórmula: C = (5 * ( F-32) / 9)
 */

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura em Fahrenheit: ");
        double tempFahrenheit = sc.nextDouble();

        double tempCelsius = (5 * (tempFahrenheit - 32) / 9);

        System.out.println("Em Fahrenheit: " + tempFahrenheit);
        System.out.println("Conversão para Celsius: " + String.format("%.2f", tempCelsius));

        sc.close();
    }
}
