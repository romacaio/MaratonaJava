package academy.devdojo.maratona.java.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {

        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file)) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello,Word! \n"); // nem sempre o \n é reconhecido por outros SO
            bw.newLine(); // separador de linha baseado no SO.
            bw.write("Caio Romão");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
