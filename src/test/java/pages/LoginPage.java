package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    // WebDriver reference for performing UI actions
    WebDriver driver;

    // Page locators
    By loginButton = By.xpath("//button[text()='Login/Register']");
    By mobileField = By.cssSelector(".pw_auth-remove_border, .pw_auth-no_border");
    By getOtpButton = By.xpath("//button[text()='Get OTP']");

    // Constructor to initialize WebDriver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // This method performs login step until OTP is requested
    // 1. Clicks on Login/Register
    // 2. Enters mobile number
    // 3. Clicks on Get OTP button
    public void enterMobileAndRequestOTP(String mobileNumber) throws InterruptedException {

        // Wait for page to load and click Login/Register
        Thread.sleep(2000);
        driver.findElement(loginButton).click();

        // Wait for login popup and enter mobile number
        Thread.sleep(2000);
        driver.findElement(mobileField).sendKeys(mobileNumber);

        // Wait for Get OTP button to become clickable and request OTP
        Thread.sleep(5000);
        driver.findElement(getOtpButton).click();
    }
}
