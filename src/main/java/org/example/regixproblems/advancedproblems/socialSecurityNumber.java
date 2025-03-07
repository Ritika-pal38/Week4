package org.example.regixproblems.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SSNValidator {
    public static boolean isValidSSN(String ssn) {
        // Regular expression for a valid SSN (Format: XXX-XX-XXXX)
        String regex = "^(\\d{3}-\\d{2}-\\d{4})$";

        // Compile regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ssn);

        // Return whether the SSN matches the pattern
        return matcher.matches();
    }
}

public class socialSecurityNumber {
    public static void main(String[] args) {
        String[] testSSNs = {
                "123-45-6789",  // Valid
                "123456789",    // Invalid (missing dashes)
                "123-456-789",  // Invalid (wrong format)
                "000-00-0000",  // Could be invalid depending on SSN rules
                "987-65-4321"   // Valid format
        };

        for (String ssn : testSSNs) {
            if (SSNValidator.isValidSSN(ssn)) {
                System.out.println("✅ \"" + ssn + "\" is valid");
            } else {
                System.out.println("❌ \"" + ssn + "\" is invalid");
            }
        }

    }
}
