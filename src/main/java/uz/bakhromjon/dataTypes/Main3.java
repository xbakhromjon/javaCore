package uz.bakhromjon.dataTypes;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public class Main3 {
    public static void main(String[] args) {
        // char 2 byte 16 bit [0, 2^16 - 1 = 65535]
        System.out.println((char) 8482);
        System.out.println("hello\b");
        System.out.println("hello\thi");
        System.out.println("hello \nhi");
        System.out.println("hello\rhi");
        System.out.println("hello \"hi July\"");
        System.out.println("hello 'hi 'July' what's up'");
        System.out.println("hello\\");

        System.out.println('\u0022' + "nima gap" + '\u0022');
        // \u000a //  is a newline
    }
}
