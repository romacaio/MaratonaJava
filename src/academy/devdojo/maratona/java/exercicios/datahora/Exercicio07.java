package academy.devdojo.maratona.java.exercicios.datahora;

/*
    Peça uma data futura ao usuário (ex: data da formatura) e:
    Calcule quantos dias faltam usando ChronoUnit.DAYS.between().
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Data da formatura dd/MM/yyyy: ");
        String dataFormatura_String = sc.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFormatura = LocalDate.parse(dataFormatura_String,dtf);
        LocalDate now = LocalDate.now();

        System.out.println("Data atual: " + dtf.format(now));
        System.out.println("Data da formatura: " + dtf.format(dataFormatura));
        System.out.println("Faltam " + ChronoUnit.DAYS.between(now, dataFormatura) + " dias para a formatura.");

        sc.close();
    }
}
