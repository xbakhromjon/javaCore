package uz.bakhromjon.fundamentalOfJava.bigNumbers;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 14/12/22, Wed
 **/
public class Main {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(100);
        BigInteger reallyBig
                = new BigInteger("222232244629420445529739893461909967206666939096499764990979600");
        BigInteger zero = BigInteger.ZERO;

        BigInteger one = new BigInteger("1");
        BigInteger three = new BigInteger("3");
        BigInteger multiply = one.multiply(three);

        BigDecimal bigDecimal = new BigDecimal("1.2");
    }
}
