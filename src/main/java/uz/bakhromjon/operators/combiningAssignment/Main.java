package uz.bakhromjon.operators.combiningAssignment;

public class Main {
    public static void main(String[] args) {
        int i = 12;
//        i = i + 2;
        i += 2;
        i -= 2;
        i *= 2;
        i /= 2;
        i %= 2;
        i ^= 2;

        i += 3.5;
//        i = (int) (i + 3.5);
//        i = i + 3.5F;
        System.out.println(i);
    }
}

