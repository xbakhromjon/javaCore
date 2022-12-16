package uz.bakhromjon.fundamentalOfJava.operators.operatorHierarchy;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 05/12/22, Mon
 **/
public class Main {
    public static void main(String[] args) {
        // a && b || c  => (a && b) || c
        int a = 1;
        int b = 2;
        int c = 3;
        a += b += c;  // => a += (b += c);
        System.out.println(b);
        System.out.println(a);
    }
}
