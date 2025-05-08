package academy.devdojo.maratona.java.javacore.Npolimorfismo.test;

import academy.devdojo.maratona.java.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratona.java.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratona.java.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratona.java.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {

        Produto produto = new Computador("Ryzen 5", 3000);

        Tomate tomate = new Tomate("Tomate Americano", 20);
        tomate.setDataValidade("08/05/2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------------------");
        CalculadoraImposto.calcularImposto(produto);

    }
}
