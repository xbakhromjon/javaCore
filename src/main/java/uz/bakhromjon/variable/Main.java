package uz.bakhromjon.variable;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public class Main {
    double salary = 1;
    int vacationDays;
    long earthPopulation;
    boolean done;
    final static int MY_AGE = 20;

    public static void main(String[] args) {
        double degree = Math.pow(5, 5);
        System.out.println(degree);
        // ...
        System.out.println(degree + 1);

        // name requariments
        // A letter is defined as 'A'–'Z', 'a'–'z', '_', '$', or any
        //Unicode character that denotes a letter in a language
        /*A letter is defined as 'A'–'Z', 'a'–'z', '_', '$', or any
Unicode character that denotes a letter in a language. For example, German
users can use umlauts such as 'ä' in variable names; Greek speakers could use
a π. Similarly, digits are '0'–'9' and any Unicode characters that denote a
digit in a language. Symbols like '+' or '©' cannot be used inside variable
names, nor can spaces.*/
        int ä = 12;

        System.out.println(Character.isJavaIdentifierPart('='));

//        int _ = 12;

//        int i, j;
        int i;
        int j;

        // dont recommend
        long hireday = 12L;
        long hireDay = 13L;

        long aLong;


        int aInt = 12;
        var vacationDays = 12;

        System.out.println(MY_AGE);
        Size size = Size.M;
        size = null;
        int sizeCode = 1; // 2, 3, 4
    }

    enum Size {
        S, M, L, X
    }

    class Bakhromjon {

    }
}
