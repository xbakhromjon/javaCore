package uz.bakhromjon.fundamentalOfJava.simpleJavaApp;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public class Main2 {
    // According to the Java Language Specification, the main method must be declared public.
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

class Main3 {
    public static void main(String[] args) {
        String[] strs = new String[2];
        Main2.main(strs);
    }
}

class Main4 {

}

class Main5 {

}