package academy.devdojo.maratona.java.javacore.Minterfaces.test;

import academy.devdojo.maratona.java.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.devdojo.maratona.java.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratona.java.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        fileLoader.load();
        dataBaseLoader.load();

        fileLoader.remove();
        dataBaseLoader.remove();

        fileLoader.checkPermission();
        dataBaseLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        FileLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();

    }
}
