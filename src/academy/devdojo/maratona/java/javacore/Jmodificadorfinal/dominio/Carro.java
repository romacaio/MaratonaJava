package academy.devdojo.maratona.java.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    // modificador final em atributos de referências -> a referencia que é a constante. Os valores podem ser alterados
    // modificador em atributos primitivos -> os valores são a costante.
    public static double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
