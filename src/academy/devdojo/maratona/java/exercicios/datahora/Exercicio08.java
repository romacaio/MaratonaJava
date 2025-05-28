package academy.devdojo.maratona.java.exercicios.datahora;

/*
    Dado um mês e ano (ex: Maio de 2025), liste todas as segundas-feiras do mês.
    Dica: use um loop com LocalDate e getDayOfWeek() para testar cada dia do mês.
 */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o mês: ");
        int mes = sc.nextInt();
        System.out.println("Digite o ano: ");
        int ano = sc.nextInt();

        YearMonth anoMes = YearMonth.of(ano, mes);
        LocalDate ultimoDiaMes = anoMes.atEndOfMonth();
        LocalDate date = anoMes.atDay(1);

        System.out.println("Segundas feiras de " + anoMes.getMonth() + " de " + anoMes.getYear() + ":");
        while (!date.isAfter(ultimoDiaMes)) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(date);
            }
            date = date.plusDays(1);
        }
        sc.close();
    }
}


