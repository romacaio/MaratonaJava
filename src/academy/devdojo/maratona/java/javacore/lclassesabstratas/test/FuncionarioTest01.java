package academy.devdojo.maratona.java.javacore.lclassesabstratas.test;

import academy.devdojo.maratona.java.javacore.lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratona.java.javacore.lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Lucas", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Caio", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);

        desenvolvedor.imprime();
        gerente.imprime();

    }
}
