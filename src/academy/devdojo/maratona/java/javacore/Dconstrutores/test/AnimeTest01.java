package academy.devdojo.maratona.java.javacore.Dconstrutores.test;
import academy.devdojo.maratona.java.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação");
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();


    }
}
