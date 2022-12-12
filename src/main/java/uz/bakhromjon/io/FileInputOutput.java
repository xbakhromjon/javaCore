package uz.bakhromjon.io;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public class FileInputOutput {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(Path.of("src/main/resources/file.txt"), StandardCharsets.UTF_8);

        try (PrintWriter out = new PrintWriter("src/main/resources/file.txt", StandardCharsets.UTF_8);) {
            out.write("Java");
        }
        System.out.println(in.nextLine());


        in = new Scanner("src/main/resources/file.txt");   // ERROR
        System.out.println(in.nextLine());

        String dir = System.getProperty("user.dir");
        System.out.println(dir);


    }
}
