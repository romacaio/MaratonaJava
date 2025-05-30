package academy.devdojo.maratona.java.javacore.Qstring.exercicio.view;

import academy.devdojo.maratona.java.javacore.Qstring.exercicio.model.entities.Comentario;
import academy.devdojo.maratona.java.javacore.Qstring.exercicio.model.entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        Comentario c1 = new Comentario("Tenha uma boa viajem");
        Comentario c2 = new Comentario("Uau, isso é incrível!");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        Post p1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", dtf), "Viajando para a Nova Zelândia",
                "vou visitar este país maravilhoso", 12);

        p1.addComentario(c1);
        p1.addComentario(c2);

        System.out.println(p1);

        Comentario c3 = new Comentario("Boa noite");
        Comentario c4 = new Comentario("Que a força esteja com você");

        Post p2 = new Post(LocalDateTime.parse("28/07/2018 23:14:19", dtf), "Boa noite pessoal",
                "Vejo você amanhã", 5);

        p2.addComentario(c3);
        p2.addComentario(c4);

        System.out.println(p2);

    }
}
