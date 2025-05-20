package academy.devdojo.maratona.java.javacore.Oexception.exception.test;

import academy.devdojo.maratona.java.javacore.Oexception.dominio.Funcionario;
import academy.devdojo.maratona.java.javacore.Oexception.dominio.LoginInvalidoException;
import academy.devdojo.maratona.java.javacore.Oexception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa Pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
        try {
            Pessoa.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
