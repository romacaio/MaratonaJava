package academy.devdojo.maratona.java.javacore.Rdatas.test;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

class ObterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch (dayOfWeek) {
            case THURSDAY:
                addDays = 4;
                break;
            case FRIDAY:
                addDays = 3;
                break;
            case SATURDAY:
                addDays = 2;
                break;
            default:
                addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();
        now = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();
        now = LocalDate.now().withDayOfMonth(15).with(new ObterProximoDiaUtil()); // quinta
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();
        now = LocalDate.now().withDayOfMonth(16).with(new ObterProximoDiaUtil()); // sexta
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();
        now = LocalDate.now().withDayOfMonth(17).with(new ObterProximoDiaUtil()); // sábado
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println();
        now = LocalDate.now().withDayOfMonth(18).with(new ObterProximoDiaUtil()); // domingo
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
