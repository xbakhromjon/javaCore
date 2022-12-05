package uz.bakhromjon.operators.incAndDec;

public class Main {
    public static void main(String[] args) {
        System.out.println("Increment --------");
        int i = 1;
//        i += 1;
//        System.out.println(++i * 3);
        System.out.println(i++ * 3);

        // decrement
        System.out.println("Decrement --------");
        i = 2;
//        i -= 1;
        --i;
        System.out.println(i * 3);
        System.out.println(i * 3);
        i--;
//        i -= 1;
    }
}
