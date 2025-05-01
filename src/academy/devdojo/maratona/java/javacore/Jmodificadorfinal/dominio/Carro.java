package academy.devdojo.maratona.java.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static double VELOCIDADE_LIMITE = 250;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
