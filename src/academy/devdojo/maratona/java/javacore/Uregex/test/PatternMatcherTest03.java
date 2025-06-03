package academy.devdojo.maratona.java.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
       /*
        \d = todos os dígitos
        \D = tudo que não for dígito
        \s = espaçoes em branco \t \n /f \r
        \S = todos os caracteres excluindo os em branco
        \w = a-z A-Z, dítitos, _
        \W = tudo que não for incluso no \w
        [] = apenas os carcteres dentro desse range.

        */

//        String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
//        String texto = "abaaba";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:   " + texto2);
        System.out.println("Índices: 0123456789");
        System.out.println("Posições econtradas: ");
        while (matcher.find()) {   // continuar enquando encontrar...
            System.out.print(matcher.start() + " " + matcher.group() + "\n");

        }
        int hexDecimal = 0x59F864;
        System.out.println(hexDecimal);
    }
}
