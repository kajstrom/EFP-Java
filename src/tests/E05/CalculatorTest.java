package tests.E05;

import EFP.E05.Calculator;
import org.junit.Assert;


public class CalculatorTest {
    public Calculator makeCalculator() {
        return new Calculator();
    }

    public void add_WhenCalled_ReturnsSum() {
        Calculator calculator = makeCalculator();

        Integer expected = 15;
        Integer sum = calculator.add(10, 5);

        Assert.assertEquals(expected, sum);
    }

    public void subtract_WhenCalled_ReturnsDifference() {
        Calculator calculator = makeCalculator();

        Integer expected = 5;
        Integer difference = calculator.subtract(10, 5);

        Assert.assertEquals(expected, difference);
    }

    public void multiply_WhenCalled_ReturnsProduct() {
        Calculator calculator = makeCalculator();

        Integer expected = 50;
        Integer product = calculator.multiply(10, 5);

        Assert.assertEquals(expected, product);
    }

    public void divide_WhenCalled_ReturnsQuotient() {
        Calculator calculator = makeCalculator();

        Integer expected = 2;
        Integer product = calculator.divide(10, 5);

        Assert.assertEquals(expected, product);
    }
}