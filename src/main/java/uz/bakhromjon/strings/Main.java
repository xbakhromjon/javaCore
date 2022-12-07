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


        // code point and code units
        System.out.println("----------------------");
        String greeting = "Hello";
        int l = greeting.length();
        System.out.println(l);
        System.out.println(greeting.codePointCount(0, l));
        System.out.println(greeting.codePointAt(0));
        System.out.println('H' + 0);
        char h = greeting.charAt(0);

        str = "\uD835\uDD46 is the set of octonions.";
        int i = str.codePointAt(1);
        System.out.println(i);
        System.out.println(Character.isSupplementaryCodePoint(i));
        System.out.println(Character.isSurrogate(str.charAt(1)));
        System.out.println(str.substring(0, 2));
        for (int j = 0; j < str.length(); j++) {
            if (Character.isSupplementaryCodePoint(str.codePointAt(j))) {
                j++;
                continue;
            }
            System.out.println(str.charAt(j));
        }
    }

}
