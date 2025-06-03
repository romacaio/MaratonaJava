package academy.devdojo.maratona.java.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:   " + texto);
        System.out.println("Índices: 0123456789");
        System.out.println("Posições econtradas: ");

        while (matcher.find()) {   // continuar enquando encontrar...
            System.out.print(matcher.start() + " " + matcher.group() + "\n");

        }
        System.out.println();
        System.out.println("Email Válido: ");
        System.out.println("#@!zoro@mail.b".matches(regex));
    }
}
