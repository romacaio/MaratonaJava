package academy.devdojo.maratona.java.javacore.kenum.exercicios.exercicio02.model.entities;


public enum StatusPedido {
    PAGAMENTO_PENDENTE(0, "pagamento pendente"),
    PROCESSANDO(1, "processando"),
    ENVIADO(2, "enviado"),
    ENTREGUE(3, "entregue");
    public final int VALOR;
    public final String NOME_RELATORIO;

    StatusPedido(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.NOME_RELATORIO = nomeRelatorio;
    }

    public static StatusPedido StatusPedidoPorNomeRelatorio(String statusString) {
        statusString = statusString.toLowerCase();
        for (StatusPedido status : values()) {
            if (status.getNomeRelatorio().equals(statusString)) {
                return status;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return NOME_RELATORIO;
    }
}
