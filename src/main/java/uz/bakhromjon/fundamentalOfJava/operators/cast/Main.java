package uz.bakhromjon.fundamentalOfJava.operators.cast;

public class Main {
    public static void main(String[] args) {
        byte b = 12;
        short s = b;
        int i = s;
        long l = i;
        char c = 'a';
        i = c;
        double d = i;
        float f = 1.2F;
        d = f;
        f = i;
        f = l;
        d = l;

        int n = 123456789;
        f = n;
        System.out.println(f);

        // 127 300 -> 44
        byte b1 = (byte) 128;
        System.out.println(b1);

        boolean bool = true;
        int boolNumber = (bool) ? 1 : 0;
    }
}
