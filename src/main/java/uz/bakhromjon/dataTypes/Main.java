package uz.bakhromjon.dataTypes;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public class Main {
    public static void main(String[] args) {
        // char, boolean, long, int, short, byte, double, float
        // long 8 byte 64 bit [-2^64, 2^64 - 1]
        // int 4 byte 32 bit [-2^32, 2^32 - 1]   just over 2 billion
        // short 2 byte 16 bit [-2^16, 2^16 -1]  [-256, 255]
        // byte 1 byte 8 bit [-2^8, 2^8 - 1]  [-128, 127]

        long a = 128L;
        int b = 0xCAFE;
        byte c = 010;
        byte d = 0b1001;
        System.out.println(b);

        // 1,000,126
        long h = 1_000_126;
        System.out.println(1_000_126);

        long v = 0b1111_0100_0010_0100_0000;
    }
}
