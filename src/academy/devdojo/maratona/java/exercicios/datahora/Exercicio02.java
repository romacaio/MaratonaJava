package academy.devdojo.maratona.java.exercicios.datahora;

/*
    Peça para o usuário informar sua data de nascimento e:
    Informe quantos anos, meses e dias ele tem até a data atual usando Period.
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Data de nascimento dd/MM/yyyy: ");
        String dataNascimento_String = sc.nextLine();

        LocalDate now = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimento_String, format);
        Period p1 = Period.between(dataNascimento, now);
        System.out.println("Dias: " + p1.getDays());
        System.out.println("Anos: " + p1.getYears());
        System.out.println("Meses: " + p1.getMonths());

        sc.close();
    }
}
