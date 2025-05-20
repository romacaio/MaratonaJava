package academy.devdojo.maratona.java.javacore.Oexception.exception.test;

import academy.devdojo.maratona.java.javacore.Oexception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    public static void login() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usarname: ");
        String usernameDigitado = sc.nextLine();
        System.out.println("Senha: ");
        String senhaDigatada = sc.nextLine();
        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigatada)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }
        System.out.println("Usuário logado com sucesso!");
    }

}

