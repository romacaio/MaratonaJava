package academy.devdojo.maratona.java.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprimi(Estudante estudante){
        System.out.println("-----------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        estudante.nome = "Gohan";
    }
}
