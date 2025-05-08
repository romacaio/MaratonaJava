package academy.devdojo.maratona.java.javacore.Npolimorfismo.test;

import academy.devdojo.maratona.java.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratona.java.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratona.java.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {

        Produto produto = new Computador("Ryzen 5", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.calcularImposto());


        System.out.println("-----------------------------");

        Produto produto2 = new Tomate("Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getPreco());
        System.out.println(produto2.calcularImposto());

    }
}
