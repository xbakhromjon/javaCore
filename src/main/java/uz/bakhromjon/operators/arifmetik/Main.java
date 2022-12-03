package uz.bakhromjon.operators.arifmetik;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public class Main {
    public strictfp static void main(String[] args) {
        System.out.println(15.0 / 2);
        System.out.println(1.0 / 0);

        ScientificCalculator calculator = new ScientificCalculator();
        double result = calculator.sum(23e10, 98e17);
        if (result == 9.800000230000001E18) {
            System.out.println("true");
        }
        System.out.println(Double.MAX_VALUE - 1.56);
        System.out.println(1.7976931348623157E308);
        result = calculator.diff(Double.MAX_VALUE, 1.56);
        if (result == 1.7976931348623157E308) {
            System.out.println("True");
        }
    }
}

class ScientificCalculator {

    public double sum(double value1, double value2) {
        return value1 + value2;
    }

    public double diff(double value1, double value2) {
        return value1 - value2;
    }

    public void calculateMarksPercentage() {
    }

    public interface Circle {
        double computeArea(double radius);
    }
}