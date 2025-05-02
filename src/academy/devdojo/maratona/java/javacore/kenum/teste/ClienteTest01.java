package academy.devdojo.maratona.java.javacore.kenum.teste;

import academy.devdojo.maratona.java.javacore.kenum.dominio.Cliente;
import academy.devdojo.maratona.java.javacore.kenum.dominio.TipoCliente;
import academy.devdojo.maratona.java.javacore.kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

    }
}
