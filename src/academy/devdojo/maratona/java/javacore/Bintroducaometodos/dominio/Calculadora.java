package academy.devdojo.maratona.java.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somarDoisNumeros() {
        System.out.println(10 + 10);

    }

    public void subtarirDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicarDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double dividirDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void imprimirDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alterarDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro de alterarDoisNumeros");
        System.out.println(num1);
        System.out.println(num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public boolean isNumeroPrimo(int numero) {
        if (numero % 2 == 0) {
            return false;
        }
        return true;
    }

    public int[] dobroArray(int[] array) {
        int[] dobroArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            dobroArray[i] = array[i] * 2;
        }
        return dobroArray;
    }

    public void imprimirArrayDobro(int[] array) {
        int[] dobro = dobroArray(array);
        for (int num : dobro) {
            System.out.print(num + " ");
        }
    }
}



