package academy.devdojo.maratona.java.Exercicios;

/*
    19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
 */


public class Exercicio19 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
                if (j == 10) {
                    System.out.println("---------------");
                }
            }
        }
    }
}
