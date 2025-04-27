package academy.devdojo.maratona.java.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratona.java.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        for(int episodio : anime.getEpisodios()){
            System.out.print(episodio + " ");
        }

    }
}
