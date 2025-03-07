package org.example.regixproblems.advancedproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class languageName {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // List of popular programming languages
        String regex = "\\b(JavaScript|Java|Python|Go|C\\+\\+|C|Ruby|Swift|Kotlin|Rust|PHP)\\b";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Store matched programming languages
        List<String> languages = new ArrayList<>();

        while (matcher.find()) {
            languages.add(matcher.group());
        }

        // Print extracted languages
        System.out.println(String.join(", ", languages));
    }
}










