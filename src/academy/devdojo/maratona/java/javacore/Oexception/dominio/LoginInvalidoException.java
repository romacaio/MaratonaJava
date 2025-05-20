package academy.devdojo.maratona.java.javacore.Oexception.dominio;

public class LoginInvalidoException extends Exception{

    public LoginInvalidoException(){
       super("Login Inválido");
    }

    public LoginInvalidoException(String mensagem){
        super(mensagem);
    }
}
