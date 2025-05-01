package academy.devdojo.maratona.java.javacore.Hheranca.test;

import academy.devdojo.maratona.java.javacore.Hheranca.dominio.Funcionario;

public class PessoaTest02 {
    public static void main(String[] args) {

        // 0 - Bloco de inicialição estático da super classe é execultadado quando a JVM carregar super classe
        // 1 - Bloco de inicialição estático da sub classe é execultadado quando a JVM carregar sub classe
        // 2 - alocado espaço de memória pro objeto da super classe
        // 3 - cada atriburo da super classe é criado e inicializado com valores default ou que for passado
        // 4 - bloco de incialização da super classe é execultado, seguindo a ordem em que aparece
        // 5 - construtor da super classe é execultado
        // 6 - alocado espaço de memória pro objeto da sub classe
        // 7 - cada atriburo da sub classe é criado e inicializado com valores default ou que for passado
        // 8 - bloco de incialização da sub classe é execultado, seguindo a ordem em que aparece
        // 9 - construtor da sub classe é execultado

        Funcionario funcionario = new Funcionario("Jiraya");

    }
}
