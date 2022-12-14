package uz.bakhromjon.controlFlow.breakControlFlow;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 14/12/22, Wed
 **/
public class Main {
    public static void main(String[] args) {
        int a = 10;
        while (a > 5) {
            if (a == 7) {
                break;
            }
            System.out.println("a = " + a);
            a--;
        }

        System.out.println("------------------");
        a = 10;
        loop:
        while (a > 5) {
            if (a == 7) {
                a--;
                continue loop;
            }
            System.out.println("a = " + a);
            a--;
        }


        a = 10;
        loop:
        while (a > 5) {
            forloop:
            for (int i = 0; i < 10; i++) {
                System.out.println("i = " + i);
                for (int j = 0; j < 10; j++) {
                    if (j == 7) {
                        break forloop;
                    }
                }
                if (i == 7) {
                    break loop;
                }
            }
            a--;
        }


    }
}
