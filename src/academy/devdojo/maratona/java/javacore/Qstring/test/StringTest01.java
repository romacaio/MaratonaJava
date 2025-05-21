package academy.devdojo.maratona.java.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Caio"; // String constant pool
        String nome2 = "Caio";
        nome = nome.concat( " César"); // nome += " César"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Caio"); // dentro do heap
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern()); // dentro do String pool
    }
}
