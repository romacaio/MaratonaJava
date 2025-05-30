package academy.devdojo.maratona.java.javacore.kenum.exercicios.exercicio02.model.entities;

public class ItemPedido {
    private Integer quantidade;
    private double preco;
    private Produto produto;

    public ItemPedido(Integer quantidade, double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public double subTotal() {
        return preco * quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return getProduto().getNome()
                + ", $"
                + String.format("%.2f", preco)
                + ", quantidade: "
                + quantidade
                + ", Subtotal $ "
                + String.format("%.2f", subTotal());
    }
}
