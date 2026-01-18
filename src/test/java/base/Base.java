package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

    // WebDriver instance accessible to all test classes
    public static WebDriver driver;

    // This method runs before each @Test method
    // It initializes Chrome browser and opens the application URL
    @BeforeMethod
    public void setup() {

        // Set Chrome options to avoid remote origin issues
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--remote-allow-origins=*");

        // Automatically download and setup correct ChromeDriver version
        WebDriverManager.chromedriver().setup();

        // Launch Chrome browser
        driver = new ChromeDriver(op);

        // Navigate to the application under test
        driver.get("https://www.pw.live/");

        // Maximize browser window
        driver.manage().window().maximize();
    }

    // This method runs after each @Test method
    // It closes the browser and cleans up the WebDriver instance
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
