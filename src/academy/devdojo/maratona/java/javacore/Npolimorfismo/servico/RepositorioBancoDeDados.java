package academy.devdojo.maratona.java.javacore.Npolimorfismo.servico;

import academy.devdojo.maratona.java.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em banco de dados.");
    }
}
