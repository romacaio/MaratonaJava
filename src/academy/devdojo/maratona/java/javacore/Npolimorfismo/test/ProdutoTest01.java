package academy.devdojo.maratona.java.javacore.Npolimorfismo.test;

import academy.devdojo.maratona.java.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratona.java.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratona.java.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
