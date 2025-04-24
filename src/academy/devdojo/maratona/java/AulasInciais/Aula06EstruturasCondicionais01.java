package academy.devdojo.maratona.java.AulasInciais;

public class Aula06EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBedida = idade >= 18;
        // IF (SE)
        if(isAutorizadoComprarBedida){
            System.out.println("Autorizado a comprar bebida alcólica.");
        }
        else {
            System.out.println(" Não autorizado a comprar bebida alcólica.");
        }
        System.out.println("Fora do if");
    }
}

