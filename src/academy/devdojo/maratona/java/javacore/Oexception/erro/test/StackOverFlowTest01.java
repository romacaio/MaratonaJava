package academy.devdojo.maratona.java.javacore.Oexception.erro.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }

}
