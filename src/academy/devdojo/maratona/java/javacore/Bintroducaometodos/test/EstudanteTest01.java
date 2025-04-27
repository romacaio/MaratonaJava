package academy.devdojo.maratona.java.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.java.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratona.java.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midorya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressora.imprimi(estudante01);
        impressora.imprimi(estudante02);

        impressora.imprimi(estudante01);
        impressora.imprimi(estudante02);


    }
}
