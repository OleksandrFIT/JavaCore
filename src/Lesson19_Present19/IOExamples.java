package Lesson19_Present19;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOExamples {
    private static final String FILE_NAME = "examples.txt";

    public static void main(String[] args) throws IOException {
        deleteFile(FILE_NAME);
        createFile(FILE_NAME);
        writeTextIntoTheFile("some new text", FILE_NAME);
        readTextFromTheFile();
    }

    public static boolean createFile(String fileName) {
        Path newFilePath = Paths.get(fileName);
        try {
            Files.createFile(newFilePath);
        } catch (IOException e) {
            System.out.printf("Could not create file due to %s", e.getMessage());
        }
        return newFilePath.toFile().exists();
    }

    public static boolean deleteFile(String fileName) {
        try {
            return Files.deleteIfExists(Paths.get(fileName));
        } catch (IOException e) {
            System.out.printf("Could not delete file due to %s", e.getMessage());
        }
        return false;
    }

    public static void writeTextIntoTheFile(String textToWrite, String fileName) throws IOException {
        byte[] array = textToWrite.getBytes(StandardCharsets.UTF_8);
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.printf("Could not find file due to %s", e.getMessage());
            return;
        }
        for (byte b : array) {
            try {
                fileOutputStream.write(b);
            } catch (IOException e) {
                System.out.printf("Could not write text to the file due to %s", e.getMessage());
                fileOutputStream.flush();
                fileOutputStream.close();
            }
        }

    }

    public static void readTextFromTheFile() throws IOException {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(FILE_NAME);
        } catch (FileNotFoundException e) {
            System.out.printf("Could not find file due to %s", e.getMessage());
            return;
        }
        int i;
        while ((i = fileInputStream.read()) != -1) {
            System.out.print((char) i);
        }
        fileInputStream.close();
    }
}
