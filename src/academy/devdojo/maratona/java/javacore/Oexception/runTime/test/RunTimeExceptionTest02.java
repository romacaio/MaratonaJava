package academy.devdojo.maratona.java.javacore.Oexception.runTime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            dividir(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Código finalizado");
    }

    /**
     * @param a
     * @param b não pode ser 0
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */

    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a / b;
    }
}
