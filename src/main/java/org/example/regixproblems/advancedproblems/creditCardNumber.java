package org.example.regixproblems.advancedproblems;

import java.util.regex.Pattern;

class CreditCardValidator {
    public static boolean isValidCard(String cardNumber) {
        // Regular expressions for Visa and MasterCard
        String visaRegex = "^4[0-9]{15}$";  // Starts with 4 and has 16 digits
        String masterCardRegex = "^5[1-5][0-9]{14}$"; // Starts with 51-55 and has 16 digits

        // Compile patterns
        Pattern visaPattern = Pattern.compile(visaRegex);
        Pattern masterCardPattern = Pattern.compile(masterCardRegex);

        // Check if the card matches Visa or MasterCard format
        return visaPattern.matcher(cardNumber).matches() || masterCardPattern.matcher(cardNumber).matches();
    }
}

     public class creditCardNumber {
        public static void main(String[] args) {


            String[] testCards = {
                    "4111111111111111", // Valid Visa
                    "5105105105105100", // Valid MasterCard
                    "1234567812345678", // Invalid
                    "4111111111111",    // Invalid (too short)
                    "5111111111111111"  // Valid MasterCard
            };

            for (String card : testCards) {
                System.out.println(card + " is valid: " + CreditCardValidator.isValidCard(card));
            }
        }
    }



