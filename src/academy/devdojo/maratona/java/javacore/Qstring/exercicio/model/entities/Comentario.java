package academy.devdojo.maratona.java.javacore.Qstring.exercicio.model.entities;

public class Comentario {
    private String texto;

    public Comentario(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return texto;
    }
}
