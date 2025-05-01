package academy.devdojo.maratona.java.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro.");
        System.out.println("Digite uma pergunta e eu responderei sim ou não.");
        String pergunta = sc.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("Sim");
        }
        else{
            System.out.println("Não");
        }

    }
}
