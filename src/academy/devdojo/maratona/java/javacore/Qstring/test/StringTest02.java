package academy.devdojo.maratona.java.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {

        String nome = "      Luffy       ";
        String numeros = "012345";
        System.out.println(nome.charAt(0));  // retorna o char por índice
        System.out.println(nome.length()); // retorna o tamanho do array.
        System.out.println(nome.replace("f", "l"));
        System.out.println(nome.toLowerCase()); // Minúsculo
        System.out.println(nome.toUpperCase()); // Maiúsculo
        System.out.println(numeros.substring(0, 4)); // retorna uma substring por índices
        System.out.println(numeros.substring(0));
        System.out.println(nome.trim()); // remove os espaços vazios do começo e do fim
    }
}
