package uz.bakhromjon.fundamentalOfJava.operators.mathematics;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public class Main {
    public static void main(String[] args) {
        double x = 4;
        System.out.println(Math.sqrt(x));
        System.out.println(Math.pow(x, 2));
        System.out.println(Math.floorMod(-12, 5));

        System.out.println(-12 % 5);

        // Math for performance
        // StrictMath for clear result
        System.out.println(StrictMath.abs(-123));

        try {
//            int a = Math.multiplyExact(1000000000, 3);
            int i = Math.addExact(2000000000, 1000000000);
        } catch (ArithmeticException e) {
            System.out.println("Katta son");
        }
        System.out.println(1_000_000_000 * 3);
    }
}
