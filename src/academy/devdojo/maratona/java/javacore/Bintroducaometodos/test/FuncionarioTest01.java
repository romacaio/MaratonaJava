package academy.devdojo.maratona.java.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.java.javacore.Bintroducaometodos.dominio.Funcionario;

import java.util.Locale;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sanji");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprimir();
        System.out.println("Media: " + funcionario.getMedia());

    }
}
