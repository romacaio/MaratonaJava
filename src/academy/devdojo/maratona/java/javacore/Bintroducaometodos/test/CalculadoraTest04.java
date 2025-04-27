package academy.devdojo.maratona.java.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.java.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;

        calculadora.alterarDoisNumeros(num1, num2);
        System.out.println("Dentro de CalculadoraTest04");
        System.out.println(num1);
        System.out.println(num2);

    }
}
