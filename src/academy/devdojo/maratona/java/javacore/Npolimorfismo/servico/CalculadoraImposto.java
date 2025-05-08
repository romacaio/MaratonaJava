package academy.devdojo.maratona.java.javacore.Npolimorfismo.servico;

import academy.devdojo.maratona.java.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratona.java.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratona.java.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getPreco());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
