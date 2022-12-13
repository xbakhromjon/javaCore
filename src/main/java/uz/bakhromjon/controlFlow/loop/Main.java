package uz.bakhromjon.controlFlow.loop;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 13/12/22, Tue
 **/
public class Main {
    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        int a = 12;
        while (a > 1) {
            System.out.println("Loop is working");
            a--;
        }

        a = 13;
        do {
            System.out.println("Do block");
        } while (a < 10);

        int i = 0;
        for (; i < 10; ) {
            System.out.println("i = " + i);
            i++;
        }

        int j = 0;
        while (j < 10) {
            System.out.println("j = " + j);
            j++;
        }


        // roundoff error
        for (double x = 0; Math.round(x) != 10; x += 0.1) {
            System.out.println("Work");
        }

        for (int k = 0; k < 12; k++)
            System.out.println("k = " + k);

        if ("123".contains("+"))
            System.out.println("IF work");
        System.out.println("IF work");
        System.out.println("IF work");
    }
}
