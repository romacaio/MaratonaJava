package academy.devdojo.maratona.java.aulasinciais;

public class Aula02TiposPrimitvos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
       long numeroGrande = 100000;
        int idade = (int)10000000000L;  //casting (Forçar a entrada do valor)
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        System.out.println("A idade é: " + idade + " anos");
        System.out.println(verdadeiro);
        System.out.println("Char: " + caractere );

        String nome = "Goku";

        System.out.println("oi, meu nome é : " + nome);

    }
}
