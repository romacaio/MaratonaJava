package academy.devdojo.maratona.java.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {

        /*
        \d = todos os dígitos
        \D = tudo que não for dígito
        \s = espaçoes em branco \t \n /f \r
        \S = todos os caracteres excluindo os em branco
        \w = a-z A-Z, dítitos, _
        \W = tudo que não for incluso no \w
        [] = apenas os carcteres dentro desse range.
        . = Caracter "coringa" -> 1.3 = 123,133,1@3...

        */

        /*
        Quantificadores: Ocorrências

        ? = zero ou uma
        * = zero ou mais
        + = uma ou mais
        {n,m} = de n até m
        () = agrupamento
        | = ou o(c|v)o -> ovo | oco
        $ = fim da linha
         */

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:   " + texto);
        System.out.println("Índices: 0123456789");
        System.out.println("Posições econtradas: ");

        while (matcher.find()) {   // continuar enquando encontrar...
            System.out.print(matcher.start() + " " + matcher.group() + "\n");

        }
        System.out.println();
        int hexDecimal = 0x59F864; // 0x representa um número hexadecimal
        System.out.println(hexDecimal);
    }
}
