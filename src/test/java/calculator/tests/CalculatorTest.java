package calculator.tests;

import calculator.testcomponent.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest extends BaseTest {

    @Test
    public void digits_test() throws Exception {
        calculatorPage.clickNumber(1);
        Assert.assertEquals(calculatorPage.result.getText(), "1");

        calculatorPage.clearResult();
        calculatorPage.clickNumber(2);
        Assert.assertEquals(calculatorPage.result.getText(), "2");

        calculatorPage.clearResult();
        calculatorPage.clickNumber(3);
        Assert.assertEquals(calculatorPage.result.getText(), "3");

        calculatorPage.clearResult();
        calculatorPage.clickNumber(4);
        Assert.assertEquals(calculatorPage.result.getText(), "4");

        calculatorPage.clearResult();
        calculatorPage.clickNumber(5);
        Assert.assertEquals(calculatorPage.result.getText(), "5");

        calculatorPage.clearResult();
        calculatorPage.clickNumber(6);
        Assert.assertEquals(calculatorPage.result.getText(), "6");

        calculatorPage.clearResult();
        calculatorPage.clickNumber(7);
        Assert.assertEquals(calculatorPage.result.getText(), "7");

        calculatorPage.clearResult();
        calculatorPage.clickNumber(8);
        Assert.assertEquals(calculatorPage.result.getText(), "8");

        calculatorPage.clearResult();
        calculatorPage.clickNumber(9);
        Assert.assertEquals(calculatorPage.result.getText(), "9");

        calculatorPage.clearResult();
        calculatorPage.clickNumber(0);
        Assert.assertEquals(calculatorPage.result.getText(), "0");
    }

    @Test
    public void additionTest() throws Exception {
        calculatorPage.add(2, 4);
        Assert.assertEquals(calculatorPage.result.getText(), "6");
    }

    @Test
    public void additionOneNegativeNumberTest() throws Exception {
        calculatorPage.add(-4, 2);
        Assert.assertEquals(calculatorPage.result.getText(), "-2");
    }

    @Test
    public void additionDecimalNumberTest() throws Exception {
        calculatorPage.add(4.2, 2.6);
        Assert.assertEquals(calculatorPage.result.getText(), "6.8");
    }

    @Test
    public void additionDecimalNumberSumIntegerTest() throws Exception {
        calculatorPage.add(4.4, 2.6);
        Assert.assertEquals(calculatorPage.result.getText(), "7");
    }

    @Test
    public void additionMaximumNumberTest() throws Exception {
        calculatorPage.add(999999999, 1);
        Assert.assertEquals(calculatorPage.result.getText(), "1e+9");
    }

    @Test
    public void additionMinimumNumberTest() throws Exception {
        calculatorPage.add(-999999999, -999999999);
        Assert.assertEquals(calculatorPage.result.getText(), "-2e+9");
    }

    @Test
    public void additionZeroTest() throws Exception {
        calculatorPage.add(55, 0);
        Assert.assertEquals(calculatorPage.result.getText(), "55");
    }

    @Test
    public void subtractTest() throws Exception {
        calculatorPage.subtract(4, 2);
        Assert.assertEquals(calculatorPage.result.getText(), "2");
    }

    @Test
    public void subtractNegativeNumberTest() throws Exception {
        calculatorPage.subtract(-4, 2);
        Assert.assertEquals(calculatorPage.result.getText(), "-6");
    }

    @Test
    public void subtractNegativeResultNumberTest() throws Exception {
        calculatorPage.subtract(4, 6);
        Assert.assertEquals(calculatorPage.result.getText(), "-2");
    }

    @Test
    public void subtractDecimalNumberTest() throws Exception {
        calculatorPage.subtract(4.3, 2.3);
        Assert.assertEquals(calculatorPage.result.getText(), "2");
    }

    @Test
    public void subtractDecimalNumberResultIntegerTest() throws Exception {
        calculatorPage.subtract(4.4, 2.4);
        Assert.assertEquals(calculatorPage.result.getText(), "2");
    }

    @Test
    public void subtractMaximumNumberTest() throws Exception {
        calculatorPage.subtract(999999999, 1);
        Assert.assertEquals(calculatorPage.result.getText(), "999999998");
    }

    @Test
    public void subtractMinimumNumberTest() throws Exception {
        calculatorPage.subtract(-999999999, 1);
        Assert.assertEquals(calculatorPage.result.getText(), "-1e+9");
    }

    @Test
    public void subtractZeroTest() throws Exception {
        calculatorPage.subtract(55, 0);
        Assert.assertEquals(calculatorPage.result.getText(), "55");
    }

    @Test
    public void multiplyTest() throws Exception {
        calculatorPage.multiply(2, 4);
        Assert.assertEquals(calculatorPage.result.getText(), "8");
    }

    @Test
    public void multiplyNegativeNumberTest() throws Exception {
        calculatorPage.multiply(-4, 2);
        Assert.assertEquals(calculatorPage.result.getText(), "-8");
    }

    @Test
    @Ignore
    public void multiplyNegativeNumbersTest() throws Exception {
        calculatorPage.multiply(-4, -6);
        Assert.assertEquals(calculatorPage.result.getText(), "24");
    }

    @Test
    public void multiplyDecimalNumberTest() throws Exception {
        calculatorPage.multiply(1.2, 3.7);
        Assert.assertEquals(calculatorPage.result.getText(), "4.44");
    }

    @Test
    public void multiplyDecimalNumberResultIntegerTest() throws Exception {
        calculatorPage.multiply(3.6, 2.5);
        Assert.assertEquals(calculatorPage.result.getText(), "9");
    }

    @Test
    public void multiplyMaximumNumberTest() throws Exception {
        calculatorPage.multiply(999999999, 2);
        Assert.assertEquals(calculatorPage.result.getText(),"2e+9");
    }

    @Test
    public void multiplyMinimumNumberTest() throws Exception {
        calculatorPage.multiply(-999999999, 1);
        Assert.assertEquals(calculatorPage.result.getText(),"-999999999");
    }

    @Test
    public void multiplyZeroTest() throws Exception {
        calculatorPage.multiply(55, 0);
        Assert.assertEquals(calculatorPage.result.getText(),"0");
    }

    @Test
    public void divide_test() throws Exception {
        calculatorPage.divide(6, 2);
        Assert.assertEquals(calculatorPage.result.getText(),"3");
    }

    @Test
    public void divideNegativeNumberTest() throws Exception {
        calculatorPage.divide(-4, 2);
        Assert.assertEquals(calculatorPage.result.getText(),"-2");
    }

    @Test
    @Ignore
    public void divideNegativeNumbersTest() throws Exception {
        calculatorPage.divide(-4, -2);
        Assert.assertEquals(calculatorPage.result.getText(),"2");
    }

    @Test
    public void divideDecimalNumberTest() throws Exception {
        calculatorPage.divide(1.2, 0.5);
        Assert.assertEquals(calculatorPage.result.getText(),"2.4");
    }

    @Test
    public void divideDecimalNumberResultIntegerTest() throws Exception {
        calculatorPage.divide(1.2, 0.2);
        Assert.assertEquals(calculatorPage.result.getText(),"6");
    }

    @Test
    public void divideMaximumNumberTest() throws Exception {
        calculatorPage.divide(999999999, 0.5);
        Assert.assertEquals(calculatorPage.result.getText(),"2e+9");
    }

    @Test
    public void divideMinimumNumberTest() throws Exception {
        calculatorPage.divide(-999999999, 1);
        Assert.assertEquals(calculatorPage.result.getText(),"-999999999");
    }

    @Test
    public void divideZeroTest() throws Exception {
        calculatorPage.divide(55, 0);
        Assert.assertEquals(calculatorPage.result.getText(),"Error");
    }

    @Test
    public void multipleOperationTest() throws Exception {
        calculatorPage.add(1, 2);
        calculatorPage.clickOperand("subtract");
        calculatorPage.clickNumber(1);
        calculatorPage.clickOperand("multiply");
        calculatorPage.clickNumber(4);
        calculatorPage.clickOperand("divide");
        calculatorPage.clickNumber(2);
        calculatorPage.clickOperand("equals");
        Assert.assertEquals(calculatorPage.result.getText(), "4");
    }
}
