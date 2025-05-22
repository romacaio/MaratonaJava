package academy.devdojo.maratona.java.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String language : isoLanguages) {
            System.out.print(language + " ");
        }
        System.out.println();

        for(String country : isoCountries){
            System.out.print(country + " ");
        }

    }
}
