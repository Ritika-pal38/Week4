package org.example.regixproblems.extractionproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class capitalizedWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String regexCode = "[A-Z]{1}[A-Za-z]{1,}";
        Pattern pattern = Pattern.compile(regexCode);
        Matcher matcher = pattern.matcher(text);
        List<String> words = new ArrayList<>();
        while (matcher.find()){
            words.add(matcher.group());
        }
        System.out.println("Capitalized words extracted are : "+words);

    }
}
