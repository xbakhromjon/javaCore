package uz.bakhromjon.fundamentalOfJava.arrays;

import java.util.Arrays;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 14/12/22, Wed
 **/
public class Main {
    public static void main(String[] args) {
        int i0 = 12;
        int i1 = 13;
        int i2 = 13;
        int i3 = 13;

        int[] arr = {12, 13, 13, 13};
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        String[] strings = new String[10];

        int[] arr1 = new int[]{12, 13, 13, 13};

        // do not have => don't have

        // for (variable : collection) statement

        for (int a : arr) {
            System.out.println(a);
        }

        System.out.println("-------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}
