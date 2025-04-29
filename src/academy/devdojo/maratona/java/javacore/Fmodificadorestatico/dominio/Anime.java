package academy.devdojo.maratona.java.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialição estático e outros métodos estáticos são execultadados quando a JVM carregar a classe
    // 1 - alocado espaço de memória pro objeto
    // 2 - cada atriburo da classe é criado e inicializado com valores default ou que for passado
    // 3 - blco de incialização é execultado
    // 4 - construtor é execultado

    static {
        System.out.println("Dentro do bloco de incialização estático 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro fo bloco de incialização estático 2");
    }

    static {
        System.out.println("Dentro fo bloco de incialização estático 3");
    }

    {
        System.out.println("Bloco de inicialização não estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        for (int episodio : episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return Anime.episodios;
    }

    public void setEpisodios(int[] episodios) {
        Anime.episodios = episodios;
    }
}