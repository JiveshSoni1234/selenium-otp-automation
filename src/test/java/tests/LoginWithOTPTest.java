package tests;

import org.testng.annotations.Test;

import base.Base;
import pages.LoginPage;
import utils.OTPReaderUtil;

public class LoginWithOTPTest extends Base {

    @Test
    public void verifyLoginUsingOTP() throws Exception {

        // Create object of LoginPage and pass WebDriver from Base class
        LoginPage loginPage = new LoginPage(driver);

        // Enter mobile number and click on "Get OTP" button
        // (Use dummy number or read from config in real framework)
        loginPage.enterMobileAndRequestOTP("Enter your number here");

        // Wait for OTP to be delivered to the mobile device
        Thread.sleep(5000);

        // Fetch OTP from SMS using ADB and Regex logic
        String otp = OTPReaderUtil.getOTPFromSMS();

        // Print fetched OTP in console for verification
        System.out.println("Fetched OTP: " + otp);

        // Future enhancement:
        // 1. Locate OTP input fields on UI
        // 2. Enter OTP automatically
        // 3. Click Verify/Login button
        // 4. Assert successful login
    }
}
