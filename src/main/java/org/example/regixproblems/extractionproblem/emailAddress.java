package org.example.regixproblems.extractionproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String regixCode = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}";
        Pattern pattern = Pattern.compile(regixCode);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println("Matched : "+matcher.group());
        }

    }
}
