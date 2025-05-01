package academy.devdojo.maratona.java.javacore.Gassociacao.test;

import academy.devdojo.maratona.java.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratona.java.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratona.java.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratona.java.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {

        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Aluno aluno2 = new Aluno("Naruto", 17);
        Aluno[] alunos = {aluno, aluno2};

        Seminario seminario = new Seminario("Onde encontrar o one piece", local, alunos);
        Seminario seminario2 = new Seminario("Estrutura de dados", local, alunos);

        Seminario[] seminariosDisponiveis = {seminario, seminario2};
        Professor professor = new Professor("Barba Negra", "Pirataria");

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
