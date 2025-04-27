package academy.devdojo.maratona.java.aulasinciais;

public class Aula04OperadoresAritimeticos {
    public static void main(String[] args) {

        // + - * /
        int numero1 = 10;
        int numero2 = 20;
        int soma = numero1 + numero2;
        System.out.println("Valor" + numero2 + numero1);
        System.out.println(numero1 + numero2);
        System.out.println(numero1 + numero2 + " valor" + numero1 + numero2);
        System.out.println(soma);

        // % (Resto de Divisão)
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == != return boolean
        boolean isDezMaiorIgalVinte = 10 >= 20;
        boolean isDezMenorVinte = 10 < 20;
        boolean isIgualVinte = 10 == 20;
        boolean isDiferenteVinte = 10 != 20;

        System.out.println("isDezMaiorIgualVinte " + isDezMaiorIgalVinte);
        System.out.println("isDezMenorVinte " + isDezMenorVinte);
        System.out.println("isDEzIgualIgualVinte " + isIgualVinte);
        System.out.println("isDezDiferenteVinte " + isDiferenteVinte);

    }
}