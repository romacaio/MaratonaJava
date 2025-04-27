package academy.devdojo.maratona.java.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args){
        // Imprima os primeiros 25 números de um dado valor. Por exemplo, 25.

        for (int i = 0; i < 50 ; i++) {
            System.out.println(i);

            if(i == 25){
                break;
            }
        }
    }
}
