package uz.bakhromjon.fundamentalOfJava.io;

import java.io.Console;
import java.util.Scanner;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 09/12/22, Fri
 **/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("What is your name? ");
//        String name = in.nextLine();
//        System.out.println(name);
//        String firstName = in.next();
//        System.out.println("firstName " + firstName);

//        System.out.print("How old are you? ");
//        int age = in.nextInt();
//        System.out.println(age);

        Console cons = System.console();
        String username = cons.readLine("User name: ");
        char[] passwd = cons.readPassword("Password: ");
    }
}
