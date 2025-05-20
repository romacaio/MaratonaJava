package academy.devdojo.maratona.java.javacore.Oexception.dominio;

public class Funcionario extends Pessoa {

    @Override
    public void salvar() throws LoginInvalidoException {
        System.out.println("Salvando funcionário");
    }

}
