# 🔐 Selenium OTP Automation using ADB

This project demonstrates end-to-end automation of an OTP-based login flow by combining web automation with mobile SMS reading.

---

## 🛠 Tools & Technologies Used

* 🌐 **Selenium WebDriver** – Automates browser actions (open site, click login, enter mobile number).
* ☕ **Java** – Programming language used to build the framework.
* 🧪 **TestNG** – Test execution and reporting framework.
* 📱 **ADB (Android Debug Bridge)** – Connects the Android device to the system and reads SMS.
* 🔍 **Regular Expressions (Regex)** – Extracts the OTP from the SMS text.

---

## 📋 Project Overview

The framework automates the complete OTP login flow:

1. 🚀 **Launch the Website** – Opens the application in Chrome using Selenium.
2. 📞 **Enter Mobile Number** – Automatically types the mobile number in the login field.
3. 🔘 **Trigger OTP** – Clicks on the “Get OTP” button.
4. 📨 **Read OTP from SMS** – Uses ADB to read incoming SMS directly from the connected Android phone.
5. 🔢 **Extract OTP Using Regex** – Parses the SMS and extracts the 4–8 digit OTP dynamically.

This approach is useful in test environments where:

* ❌ OTP bypass APIs are not available.
* 📱 Real device integration is required.

---

## 🧰 Tech Stack

* ☕ Java 17
* 🌐 Selenium WebDriver
* 🧪 TestNG
* 📦 Maven
* 🚗 WebDriverManager
* 📱 Android ADB
* 🔍 Regex

---

## 🏗 Framework Structure (POM)

* 🧱 **base** → Browser setup and teardown
* 📄 **pages** → Page Object Model (LoginPage and locators)
* 🛠 **utils** → OTP reading logic using ADB and Regex
* 🧪 **tests** → TestNG test classes

---

## ▶ How to Run

1. 📱 Enable **USB Debugging** on your Android device.
2. 🔌 Connect the mobile phone to the laptop using USB.
3. 💻 Verify connection using `adb devices`.
4. ▶ Run the TestNG class: `LoginWithOTPTest`.

---

## 🌟 Key Highlight

✨ OTP is fetched automatically from the real SMS inbox.
✨ No manual OTP entry is required.
✨ Real-time extraction using Regex.
✨ Integration of Selenium with Mobile using ADB.

---

## ⚠ Disclaimer

This implementation is intended for:

* 🧪 Automation practice
* 🧑‍💻 Test environments only

In production systems:
🔐 OTP verification should be handled using secure backend APIs or mocked/stubbed services.
