package academy.devdojo.maratona.java.javacore.kenum.exercicios.exercicio02.view;

import academy.devdojo.maratona.java.javacore.kenum.exercicios.exercicio02.model.entities.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Insira os dados do cliente");
        System.out.print("Nome: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Data nascimento dd/MM/yyyy: ");
        String dataNascimento = sc.nextLine();

        Cliente cliente = new Cliente(nomeCliente, email, LocalDate.parse(dataNascimento, dtf));

        System.out.print("Status: ");
        String status = sc.nextLine();

        System.out.print("Quantos itens há neste pedido? ");
        Integer quantidadeItens = sc.nextInt();
        sc.nextLine();

        Pedido pedido = new Pedido(LocalDateTime.now(), StatusPedido.StatusPedidoPorNomeRelatorio(status), cliente);
        System.out.println();

        for (int i = 0; i < quantidadeItens; i++) {
            System.out.println("Insira os dados do item #" + (i + 1));
            System.out.print("Nome produto: ");
            String nomeProduto = sc.nextLine();

            System.out.print("Preço produto $ ");
            double precoProduto = sc.nextDouble();
            sc.nextLine();

            System.out.print("Quantidade: ");
            int quantidadeProduto = sc.nextInt();
            sc.nextLine();

            Produto produto = new Produto(nomeProduto, precoProduto);
            ItemPedido itemPedido = new ItemPedido(quantidadeProduto, precoProduto, produto);
            pedido.addItem(itemPedido);
        }

        System.out.println(pedido);
        sc.close();
    }
}
