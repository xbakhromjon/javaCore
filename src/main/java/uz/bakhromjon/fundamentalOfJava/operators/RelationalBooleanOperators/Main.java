package uz.bakhromjon.fundamentalOfJava.operators.RelationalBooleanOperators;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 05/12/22, Mon
 **/

public class Main {
    public static void main(String[] args) {
        int i1 = 12;
        int i2 = 12;
        System.out.println(i1 == i2);
        System.out.println(i1 != i2);
        System.out.println(i1 > i2);
        System.out.println(i1 >= i2);
        System.out.println(i1 < i2);
        System.out.println(i1 <= i2);

        System.out.println((i1 != 12) && (1 / 0 > 10));

        System.out.println(i1 == 12 || 1 / 0 == 0);

        // ternary operator
        // condition ? exp1 : exp2;
        System.out.println(i1 != 12 ? 1 : 2);
    }
}
