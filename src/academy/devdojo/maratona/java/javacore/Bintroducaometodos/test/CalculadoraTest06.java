package academy.devdojo.maratona.java.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.java.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest06 {
    public static void main(String[] args) {

        // Desafio1: Criar uma calculadora que valida se um número é primo ou não
        // Retornar True se for, false se não for

        // Desafio2 : Criar uma calculadora que receba um array
        // Retorna seus valores x2

        Calculadora calculadora = new Calculadora();
        boolean isNumParcal = calculadora.isNumeroPrimo(5);
        System.out.println(isNumParcal);

        int[] numeros = {2,3,4,5,6,7};
        calculadora.imprimirArrayDobro(numeros);

        }

    }

