package academy.devdojo.maratona.java.javacore.Oexception.runTime.test;

public class RunTimeExceptionTest05 {
    public static void main(String[] args) {

        /*
            Não pode conter Exceptions de mesma linha de herança. ex: IndexOutOfBoundsException e
            ArrayIndexOutOfBoundsException
         */

        try {
            throw new IllegalArgumentException();
        } catch (IndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do Mútiplo catch");
        } catch (RuntimeException e) {
            System.out.println("Dentro de RuntimeException");

        }
    }
}
