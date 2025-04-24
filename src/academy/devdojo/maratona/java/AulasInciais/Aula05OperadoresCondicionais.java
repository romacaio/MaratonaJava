package academy.devdojo.maratona.java.AulasInciais;

public class Aula05OperadoresCondicionais {
    public static void main(String[] args) {

        // && (AND) || (OR) ! (NEGATION)

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 4612;

        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystation5Compravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystation5Compravel: " + isPlaystation5Compravel);

        // = += -= *= /= %= (Atribuição)

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1;     // contador = contador + 1
        contador ++;
        contador --;

        ++ contador;          // ordem da implementação ++... (ANTES) ...++ (DEPOIS)
        -- contador;
        int contador2 = 0;

        System.out.println(contador2++);
        System.out.println(contador2);

    }

}


