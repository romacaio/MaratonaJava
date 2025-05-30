package academy.devdojo.maratona.java.javacore.kenum.exercicios.exercicio02.model.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime momento;
    private StatusPedido status;
    private List<ItemPedido> itens = new ArrayList<>();
    private Cliente cliente;

    public Pedido(LocalDateTime momento, StatusPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public void addItem(ItemPedido item) {
        itens.add(item);
    }

    public void removeItem(ItemPedido item) {
        itens.remove(item);
    }

    public double total() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Resumo do pedido: " + "\n");
        sb.append("Momento do pedido: ");
        sb.append(dtf.format(momento) + "\n");
        sb.append("Status Pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Itens produto: " + "\n");
        for (ItemPedido item : itens) {
            sb.append(item + "\n");
        }
        sb.append("Preço total: ");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
