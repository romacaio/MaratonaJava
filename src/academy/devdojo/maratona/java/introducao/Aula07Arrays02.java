package academy.devdojo.maratona.java.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Byte, shor, int, long, float e double 0
        // Char '/u0000' ' '
        // Bollean false
        // String null

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Hinata";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
