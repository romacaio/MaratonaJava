package academy.devdojo.maratona.java.javacore.kenum.dominio;

// Enumerações podem ser criadas dentro de outras classes. Porém não é recomendado (organização)

public enum TipoPagamento {
    DEBITO {
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor);

}