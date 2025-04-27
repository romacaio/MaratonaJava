package academy.devdojo.maratona.java.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos números pares de 0 até 1 Milhão

        for(int i = 1; i <= 1000000; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }

        }

    }
}
