package academy.devdojo.maratona.java.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("created " + isCreated);
            System.out.println("path " + file.getPath());
            System.out.println("path absolute " + file.getAbsolutePath());
            System.out.println("is directory " + file.isDirectory());
            System.out.println("is file " + file.isFile());
            System.out.println("is hidden " + file.isHidden());
            System.out.println("is can read " + file.canRead());
            System.out.println("is can write " + file.canWrite());
            System.out.println("last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalTime());
            boolean isExists = file.exists();
            if (isExists) {
                System.out.println("Deleted " + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
