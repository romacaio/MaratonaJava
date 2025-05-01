package academy.devdojo.maratona.java.javacore.Hheranca.test;

import academy.devdojo.maratona.java.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratona.java.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratona.java.javacore.Hheranca.dominio.Pessoa;

public class pessoaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyohisa Shimazu");
        pessoa.setCpf("111111");
        pessoa.setEndereco(endereco);
        pessoa.iprimir();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda Nobunaga");
        funcionario.setCpf("22222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.iprimir();
    }
}
