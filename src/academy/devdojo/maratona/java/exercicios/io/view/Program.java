package academy.devdojo.maratona.java.exercicios.io.view;

import academy.devdojo.maratona.java.exercicios.io.entities.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Produto> produtos = new ArrayList<>();

        File pastaAtvidade = new File("C:\\Users\\romac\\OneDrive\\Documentos\\files1-java");
        pastaAtvidade.mkdir();

        File fileInput = new File(pastaAtvidade, "input.csv");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileInput))) {
            bw.write("TV LED,1290.99,1\nVideo Game Chair,350.50,3\nIphone X,900.00,2\nSamsung Galaxy 9,850.00,2");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File pastaOut = new File(pastaAtvidade, "out");
        pastaOut.mkdir();

        File fileSummary = new File(pastaOut, "summary.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(fileInput))) {
            String itemCsv;
            while ((itemCsv = br.readLine()) != null) {
                String[] fields = itemCsv.split(","); // delimitador
                String nome = fields[0];
                double preco = Double.parseDouble(fields[1]);
                int quantidade = Integer.parseInt(fields[2]);
                produtos.add(new Produto(nome, preco, quantidade));
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileSummary))) {
                for (Produto produto : produtos) {
                    bw.write(produto.getNome() + "," + String.format("%.2f", produto.total()));
                    bw.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
