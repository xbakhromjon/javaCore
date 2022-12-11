package uz.bakhromjon.io;

import java.util.Date;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 11/12/22, Sun
 **/
public class FormattingOutput {
    public static void main(String[] args) {
        double x = 10000.0 / 3.0;
        System.out.printf("(%.2f)", x);
        System.out.println();
        String name = "123";
        int age = 12;
        System.out.printf("Hello, %d Next %1$s year, you'll be %d", 1, 2);
        System.out.println();
        System.out.printf("%tT", new Date());
        System.out.println();
        System.out.printf("%1$s %2$tB %2$te, %2$tY", "Due date:", new Date());
        System.out.println();
        System.out.printf("%s %tB %<te, %<tY", "Due date:", new Date());
    }
}
