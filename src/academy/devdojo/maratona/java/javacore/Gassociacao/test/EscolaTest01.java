package academy.devdojo.maratona.java.javacore.Gassociacao.test;

import academy.devdojo.maratona.java.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratona.java.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores );

        escola.imprime();
    }
}
