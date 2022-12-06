package uz.bakhromjon.strings;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 06/12/22, Tue
 **/
public class Main {
    public static void main(String[] args) {
        String str = "Java Python";
        System.out.println(str);

        String substring = str.substring(0, 4);
        System.out.println(substring);

        String concat = str + " " + substring;
        System.out.println(concat);
        Test test = new Test();
        System.out.println("Test is " + test);
        System.out.println(test.hashCode());

        String join = String.join(" $ ", "A", "B", "C", "D");
        System.out.println(join);

        System.out.println("Java".repeat(5));

        String s = "123 ";
        String s1 = s + "1";

        s1 = "A23";
        String s2 = "a23";
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = null;
        System.out.println(s3 != null && s3.length() != 0);
    }
}
