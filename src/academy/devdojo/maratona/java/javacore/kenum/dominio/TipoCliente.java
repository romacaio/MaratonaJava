package academy.devdojo.maratona.java.javacore.kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    public final int VALOR;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente TipoClientePorNomeRelatorio(String nomeRelatorio) {
       for(TipoCliente tipoCliente : values()){
           if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
               return tipoCliente;
           }
       }
       return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
