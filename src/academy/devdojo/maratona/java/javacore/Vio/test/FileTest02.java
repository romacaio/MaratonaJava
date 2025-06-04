package academy.devdojo.maratona.java.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {

        File fileDiretorio = new File("pasta");
        Boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println("Diretorio criado: " + isDiretorioCriado);

        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt"); // ou com o absolute path
        Boolean isArquivoCriado = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo criado: " + isArquivoCriado);

        File fileRenomeado = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isAequivoRenomeado = fileArquivoDiretorio.renameTo(fileRenomeado);
        System.out.println("Arquivo renomeado: " + isAequivoRenomeado);

        File diretorioRenomeado = new File("pasta2");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenomeado);
        System.out.println("Diretório renomeado: " + isDiretorioRenomeado);
    }
}
