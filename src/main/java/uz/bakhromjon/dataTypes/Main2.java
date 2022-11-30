package uz.bakhromjon.dataTypes;

import java.math.BigDecimal;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public class Main2 {
    public static void main(String[] args) {
        // float 4 byte 32 bit 6 - 7 significant decimal numbers
        // float 8 byte 64 bit 15 significant decimal numbers

        float f1 = 3.14F;
        double d1 = 3.14;

        float f2 = 0x1.0p-3F;
        System.out.println(f2);

        System.out.println(Double.isNaN(0.0 / 0.0));
        System.out.println(0.0 / 0.0);

        System.out.println( -1.0 / 0.0);

        System.out.println(2.8 + 1.1);

        System.out.println(new BigDecimal(2.0).subtract(new BigDecimal(1.1)));
    }
}
