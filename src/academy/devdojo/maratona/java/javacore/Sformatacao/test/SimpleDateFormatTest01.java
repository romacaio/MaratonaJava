package academy.devdojo.maratona.java.javacore.Sformatacao.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {

        String pattern = "dd/MMMM/yyyy";
        String pattern2 = "'Amsterdam' dd 'de' MMMM 'de' yyyy";  // dentro de ('') é ignorado na formatação
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
        System.out.println(sdf.format(new Date()));
        System.out.println(sdf2.format(new Date()));
        try {
            System.out.println(sdf2.parse("Amsterdam 23 de maio de 2025")); // parse retorna um Date
            System.out.println(sdf.parse("23/maio/2025"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
