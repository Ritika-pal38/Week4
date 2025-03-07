package org.example.regixproblems.advancedproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class currencyValue {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        // Regular expression to match currency values
        String regex = "\\$?\\d+\\.\\d{2}";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Store matched currency values
        List<String> currencyValues = new ArrayList<>();

        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }

        // Print extracted currency values
        System.out.println(String.join(", ", currencyValues));

    }
}
