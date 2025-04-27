package academy.devdojo.maratona.java.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratona.java.javacore.Aintroducaoclasses.model.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
