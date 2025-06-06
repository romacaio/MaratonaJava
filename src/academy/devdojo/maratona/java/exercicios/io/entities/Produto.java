package academy.devdojo.maratona.java.exercicios.io.entities;

public class Produto {
    private String nome;
    private double preco;
    private Integer quantidade;

    public Produto(String name, double preco, Integer quantidade) {
        this.nome = name;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double total() {
        return preco * quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
