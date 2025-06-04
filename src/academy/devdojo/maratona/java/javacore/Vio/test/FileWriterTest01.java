package academy.devdojo.maratona.java.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Hello,Word!\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
