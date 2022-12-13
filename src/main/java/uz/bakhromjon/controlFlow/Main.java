package uz.bakhromjon.controlFlow;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 13/12/22, Tue
 **/
public class Main {
    public static void main(String[] args) {
        {
            int a = 12;
        }
        int a = 12;
        int x = 10;
        if (x < 11) {
            if (a == 12) {
                System.out.println("a = " + a);
            } else {
                System.out.println("Else block");
            }
        }


        if (a == 12) {
            System.out.println("If block");
        } else if (a > 0) {
            System.out.println("Else if block");
        } else {
            System.out.println("Else block");
        }

    }
}
