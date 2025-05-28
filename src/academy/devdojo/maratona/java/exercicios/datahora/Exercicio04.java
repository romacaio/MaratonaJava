package academy.devdojo.maratona.java.exercicios.datahora;

/*
    Dado um LocalDate, use um TemporalAdjuster para:
    Encontrar a próxima segunda-feira a partir da data atual.
    Calcule a Duration entre eles e imprima quantos segundos se passaram.
 */


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.util.Scanner;

class ProximaSegundaFeira implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDia;

        switch (dayOfWeek) {
            case MONDAY:
                addDia = 7;
                break;
            case TUESDAY:
                addDia = 6;
                break;
            case WEDNESDAY:
                addDia = 5;
                break;
            case THURSDAY:
                addDia = 4;
                break;
            case FRIDAY:
                addDia = 3;
                break;
            case SATURDAY:
                addDia = 2;
                break;
            default:
                addDia = 1;
        }
        return temporal.plus(addDia, ChronoUnit.DAYS);
    }

}

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma Data  dd/MM/yyyy: ");
        String data_String = sc.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate now = LocalDate.parse(data_String, dtf);
        System.out.println("Data atual: " + dtf.format(now));

        LocalDate proximaSegunda = now.with(new ProximaSegundaFeira());
        long dias = ChronoUnit.DAYS.between(now, proximaSegunda);

        System.out.println("Próxima Segunda-Feira: " + dtf.format(proximaSegunda));
        System.out.println("número de dias até essa data: " + dias);

        sc.close();
    }
}
