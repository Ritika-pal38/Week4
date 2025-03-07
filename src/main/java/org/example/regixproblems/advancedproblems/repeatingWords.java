package org.example.regixproblems.advancedproblems;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class repeatingWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        // Regular expression to find repeated words
        String regex = "\\b(\\w+)\\b(?:\\s+\\1\\b)";

        // Compile regex pattern
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        // Set to store unique repeated words
        Set<String> repeatedWords = new HashSet<>();

        while (matcher.find()) {
            repeatedWords.add(matcher.group(1)); // Capture the repeating word
        }

        // Print repeated words
        System.out.println(String.join(", ", repeatedWords));
    }
}
