package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OTPReaderUtil {

    // This method reads SMS from connected Android device using ADB
    // and extracts the OTP using regular expression
    public static String getOTPFromSMS() throws Exception {

        // Path of adb.exe on your system
        String adbPath = "C:\\Users\\sonia\\Downloads\\platform-tools-latest-windows\\platform-tools\\adb.exe";

        // Execute ADB command to read SMS inbox
        Process process = Runtime.getRuntime().exec(
                adbPath + " shell content query --uri content://sms/inbox --projection body"
        );

        // Read output of the ADB command
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;

        // Loop through each SMS line
        while ((line = reader.readLine()) != null) {

            // Print all SMS for debugging purpose
            System.out.println(line);

            // Regex pattern to find any 4 to 8 digit number (OTP)
            Pattern p = Pattern.compile("\\b\\d{4,8}\\b");
            Matcher m = p.matcher(line);

            // If OTP is found, return it
            if (m.find()) {
                return m.group();
            }
        }

        // Return null if no OTP is found
        return null;
    }
}
