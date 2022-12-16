package uz.bakhromjon.fundamentalOfJava.controlFlow.multipleSelection;

import java.util.Scanner;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 13/12/22, Tue
 **/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Select an option (1, 2, 3, 4) ");
        int choice = in.nextInt();


        switch (choice) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
            default:
                // bad input
                System.out.println("Bad input");
        }


        switch (choice) {
            case 1 ->
                System.out.println("1");
            case 2 ->
                System.out.println("2");
            case 3 ->
                System.out.println("3");
            case 4 ->
                System.out.println("4");
            default ->
                System.out.println("Bad input");
        }


        if (choice == 1) {
            System.out.println("1");
        } else if (choice == 2) {
            System.out.println("2");
        } else if (choice == 3) {
            System.out.println("3");
        } else if (choice == 4) {
            System.out.println("4");
        } else {
            System.out.println("Bad input");
        }


//        switchStatement();

//        float f = 1.2F;
//        switch (f) {
//
//        }
        String s = "123";
        switch (s) {
            case "123" ->
                System.out.println("case 1");
            case "12" ->
                System.out.println("case 2");
        }

        enum Size {
            SMALL,
            MEDIUM,
            LARGE
        }

        Size sz = Size.LARGE;
        switch (sz) {
            case LARGE -> System.out.println("large");
            case MEDIUM -> System.out.println("medium");
            case SMALL -> System.out.println("small");
        }


    }
    @SuppressWarnings("fallthrough")
    public static void switchStatement() {
        Scanner in = new Scanner(System.in);
        System.out.print("Select an option (1, 2, 3, 4) ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
            default:
                // bad input
                System.out.println("Bad input");
        }

    }
}
