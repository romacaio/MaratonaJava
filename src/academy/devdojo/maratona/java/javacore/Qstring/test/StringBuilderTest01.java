package academy.devdojo.maratona.java.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" DevDojo");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("William Suane"); // padrão 16
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb.toString());
    }
}
