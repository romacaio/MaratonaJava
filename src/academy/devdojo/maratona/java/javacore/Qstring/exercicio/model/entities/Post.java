package academy.devdojo.maratona.java.javacore.Qstring.exercicio.model.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime momento;
    private String titulo;
    private String conteudo;
    private Integer like;
    private List<Comentario> comentarios = new ArrayList<>();

    public Post() {

    }

    public Post(LocalDateTime momento, String titulo, String conteudo, Integer like) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.like = like;

    }

    public void addComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public void removeComentario(Comentario comentario) {
        comentarios.remove(comentario);
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo).append("\n");
        sb.append(like).append(" Likes - ");
        sb.append(dtf.format(momento) + "\n");
        sb.append(conteudo).append("\n");
        sb.append("Comentários").append("\n");
        for (Comentario comentario : comentarios) {
            sb.append(comentario).append("\n");
        }
        return sb.toString();
    }
}
