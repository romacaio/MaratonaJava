package academy.devdojo.maratona.java.javacore.Jmodificadorfinal.dominio;

public class Carro {

    // modificador final em atributos de referências -> a referencia que é a constante. Os valores podem ser alterados
    // modificador em atributos primitivos -> os valores são a costante

    // Classes final não podem ser extendidas

    private String nome;
    public static double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    // Métodos final não podem ser sobrescritos
    public final void imprimi(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
