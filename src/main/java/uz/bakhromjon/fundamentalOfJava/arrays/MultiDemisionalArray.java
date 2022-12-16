package uz.bakhromjon.fundamentalOfJava.arrays;

import java.util.Arrays;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 15/12/22, Thu
 **/
public class MultiDemisionalArray {
    public static void main(String[] args) {
        int[][] magicSquare =
                {
                        {16, 3, 2, 13},
                        {5, 10, 11, 8},
                        {9, 6, 7, 12},
                        {4, 15, 14, 1}
                };
        System.out.println(Arrays.toString(magicSquare[0]));

        System.out.println(Arrays.deepToString(magicSquare));
    }
}
