package calculator.testcomponent;

import calculator.pages.CalculatorPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    public WebDriver driver;
    public CalculatorPage calculatorPage;

    public WebDriver initializeDriver() throws IOException
    {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
                + "//src//main//java//calculator//resources//GlobalData.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
        driver.get(prop.getProperty("prod_url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
    }

    @BeforeMethod(alwaysRun=true)
    public void launchApplication() throws IOException
    {
        driver = initializeDriver();
        calculatorPage = new CalculatorPage(driver);
    }

    @AfterMethod(alwaysRun=true)
    public void tearDown()
    {
        driver.close();
    }

}
