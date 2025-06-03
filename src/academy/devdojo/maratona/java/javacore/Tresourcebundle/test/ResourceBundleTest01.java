package academy.devdojo.maratona.java.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {

        System.out.println(Locale.getDefault());
        System.out.println(Locale.US);

        ResourceBundle bundle = ResourceBundle.getBundle("mensagens", Locale.of("pt", "BR"));
        Boolean sasa = bundle.containsKey("sasa");  // se contém a chave
        System.out.println(sasa);

        System.out.println();

        System.out.println(bundle.getString("ola"));
        System.out.println(bundle.getString("bom.dia"));
        System.out.println(bundle.getString("hi"));

        System.out.println();

        bundle = ResourceBundle.getBundle("mensagens", Locale.of("en", "US"));
        System.out.println(bundle.getString("ola"));
        System.out.println(bundle.getString("bom.dia"));
        System.out.println(bundle.getString("hi"));

        /* Se o locale do usuário Locale("fr", "CA") e o locale padrão
        do sistema for pt-BR, o Java buscará.

        mensagens_fr_CA.properties
        mensagens_fr.properties
        mensagens_pt_BR.properties
        mensagens_pt.properties
        mensagens.properties
         */
    }
}
