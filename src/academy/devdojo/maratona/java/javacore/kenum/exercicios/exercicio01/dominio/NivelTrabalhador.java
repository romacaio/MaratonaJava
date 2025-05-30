package academy.devdojo.maratona.java.javacore.kenum.exercicios.exercicio01.dominio;

public enum NivelTrabalhador {
    JUNIOR("Junior"),
    MID_LEVEL("Mid Level"),
    SENIOR("Senior");

    private final String NomeRelatorio;

    NivelTrabalhador(String nomeRelatorio) {
        this.NomeRelatorio = nomeRelatorio;
    }

    public static NivelTrabalhador nivelPorNomeRelatorio(String nomeRelatorio) {
        for (NivelTrabalhador nivel : values()) {  // values() retornar uma array com todas as constantes do enum
            if (nivel.getNomeRelatorio().equals(nomeRelatorio)) {
                return nivel;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return this.NomeRelatorio;
    }

}

