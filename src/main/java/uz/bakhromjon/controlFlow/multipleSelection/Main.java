package uz.bakhromjon.controlFlow.multipleSelection;

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
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                // bad input
                System.out.println("Bad input");
                break;
        }

        if (choice == 1) {
            System.out.println("1");
        }
        if (choice == 2) {
            System.out.println("2");
        }
        if (choice == 3) {
            System.out.println("3");
        }
        if (choice == 4) {
            System.out.println("4");
        }

        if (choice > 5 || choice < 1) {
            System.out.println("Bad input");
        }
    }
}
