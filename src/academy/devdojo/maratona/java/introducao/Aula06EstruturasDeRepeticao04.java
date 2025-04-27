package academy.devdojo.maratona.java.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado um valor de um carro, descubra em quantas vezes pode ser parcelado
        // Condição valoParcela >= 1000

        double valorTotal = 30000;

        for(int parcela = 1 ; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }

    }
}
