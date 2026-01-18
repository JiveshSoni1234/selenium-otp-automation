# Selenium OTP Automation using ADB

This project demonstrates end-to-end automation of an OTP-based login flow using:

- Selenium WebDriver (UI Automation)
- Java
- TestNG
- ADB (Android Debug Bridge)
- Regular Expressions (for OTP extraction)

## Project Overview

The framework automates:
1. Launching the website.
2. Entering mobile number.
3. Triggering OTP.
4. Reading OTP directly from Android SMS using ADB.
5. Extracting the OTP dynamically using Regex.

This approach is useful for test environments where OTP bypass APIs are not available and mobile device integration is required.

## Tech Stack

- Java 17
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager
- Android ADB
- Regex

## Framework Structure

- base → Browser setup and teardown
- pages → Page Object Model (LoginPage)
- utils → OTP reading logic via ADB
- tests → TestNG test cases

## How to Run

1. Enable USB Debugging on Android device.
2. Connect mobile to laptop.
3. Ensure ADB is installed and `adb devices` shows your phone.
4. Run the TestNG test class: `LoginWithOTPTest`.

## Key Highlight

OTP is fetched automatically from real SMS inbox using ADB and parsed using Regex without any manual input.

## Disclaimer

This implementation is for automation practice and test environment only.  
In production, OTP should be handled via secure APIs or stubs.
