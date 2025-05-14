package academy.devdojo.maratona.java.Exercicios;

/*
    22 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que
    o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade
    média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
    Fórmula: distância = tempo x velocidade.

            litros usados = distância / 12.
 */

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tempo da viagem (em horas): ");
        double horas = sc.nextDouble();

        System.out.println("Velocidade média: ");
        double velocidadeMedia = sc.nextDouble();

        double distancia = horas * velocidadeMedia;
        double litrosUsados = distancia / 12;

        System.out.println("Distância pecorrida: " + distancia);
        System.out.println("Litros de gasolina utilizado: " + litrosUsados);
        sc.close();
    }
}
