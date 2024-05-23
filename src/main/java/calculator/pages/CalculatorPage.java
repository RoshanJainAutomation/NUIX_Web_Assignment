package calculator.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

    public WebDriver driver;

    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@value='1']")
    public WebElement one;

    @FindBy(xpath = "//input[@value='2']")
    public WebElement two;

    @FindBy(xpath = "//input[@value='3']")
    public WebElement three;

    @FindBy(xpath = "//input[@value='4']")
    public WebElement four;

    @FindBy(xpath = "//input[@value='5']")
    public WebElement five;

    @FindBy(xpath = "//input[@value='6']")
    public WebElement six;

    @FindBy(xpath = "//input[@value='7']")
    public WebElement seven;

    @FindBy(xpath = "//input[@value='8']")
    public WebElement eight;

    @FindBy(xpath = "//input[@value='9']")
    public WebElement nine;

    @FindBy(xpath = "//input[@value='0']")
    public WebElement zero;

    @FindBy(id = "add")
    public WebElement add;

    @FindBy(id = "subtract")
    public WebElement subtract;

    @FindBy(id = "multiply")
    public WebElement multiply;

    @FindBy(id = "divide")
    public WebElement division;

    @FindBy(xpath = "//input[@value='=']")
    public WebElement equalsTo;

    @FindBy(id = "display")
    public WebElement result;

    @FindBy(xpath = "//input[@value='C']")
    public WebElement reset;

    @FindBy(xpath = "//input[@value='.']")
    public WebElement dot;

    /**
     * Clicks the number passed as argument
     * @param number
     * @throws Exception
     */
    public void clickNumber(Object number) throws Exception {
        String num = String.valueOf(number);
        char[] nums = num.toCharArray();
        for (char n : nums) {
            switch (n) {
                case '1':
                    one.click();
                    break;
                case '2':
                    two.click();
                    break;
                case '3':
                    three.click();
                    break;
                case '4':
                    four.click();
                    break;
                case '5':
                    five.click();
                    break;
                case '6':
                    six.click();
                    break;
                case '7':
                    seven.click();
                    break;
                case '8':
                    eight.click();
                    break;
                case '9':
                    nine.click();
                    break;
                case '0':
                    zero.click();
                    break;
                case '.':
                    dot.click();
                    break;
                case '-':
                    clickOperand("subtract");
                    break;
                default:
                    throw new Exception(n+ "digit not present");
            }
        }
    }

    /**
     * clicks the operator passed
     * @param operator
     * @throws Exception
     */
    public void clickOperand(String operator) throws Exception {

        switch (operator) {
            case "add":
                add.click();
                break;
            case "subtract":
                subtract.click();
                break;
            case "multiply":
                multiply.click();
                break;
            case "divide":
                division.click();
                break;
            case "equals":
                equalsTo.click();
                break;
            default:
                throw new Exception("operator not present");
        }
    }

    /**
     * Adds the two numbers
     * @param num1
     * @param num2
     * @throws Exception
     */
    public void add(Object num1, Object num2) throws Exception {
        operate(num1, num2, "add");
    }

    /**
     * Subtracts two arguments passed
     * @param num1
     * @param num2
     * @throws Exception
     */
    public void subtract(Object num1, Object num2) throws Exception {
        operate(num1, num2, "subtract");
    }

    /**
     * Multiplies the arguments passed
     * @param num1
     * @param num2
     * @throws Exception
     */
    public void multiply(Object num1, Object num2) throws Exception {
        operate(num1, num2, "multiply");
    }

    /**
     * Divides the two numbers passed
     * @param num1
     * @param num2
     * @throws Exception
     */
    public void divide(Object num1, Object num2) throws Exception {
        operate(num1, num2, "divide");
    }

    private void operate(Object num1, Object num2, String operator) throws Exception {
        clickNumber(num1);
        clickOperand( operator);
        clickNumber(num2);
        clickOperand("equals");

    }

    /**
     * Resets the calculator
     */
    public void clearResult(){
        reset.click();
    }

}
