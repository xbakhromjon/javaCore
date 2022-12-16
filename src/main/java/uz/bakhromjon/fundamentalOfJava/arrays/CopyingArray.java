package uz.bakhromjon.fundamentalOfJava.arrays;

import java.util.Arrays;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 15/12/22, Thu
 **/
public class CopyingArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
//        int[] copy = Arrays.copyOf(arr, arr.length);
        int[] copy = arr;
        copy[0] = 10;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));
    }
}
