package uz.bakhromjon.fundamentalOfJava.arrays;

import java.util.Arrays;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 15/12/22, Thu
 **/
public class SortingArray {
    public static void main(String[] args) {
        int[] arr = {12, 1, 13, 4};
        // Arrays.sort() uses tuned QuickSort algorithm
        Arrays.sort(arr, 0, 2);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 12));
    }
}
