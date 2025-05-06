package academy.devdojo.maratona.java.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do arquivo.");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do arquivo.");
    }

    @Override

    public void checkPermission() {
        System.out.println("Checando permissões no arquivo.");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na classe FileLoader");
    }
}
