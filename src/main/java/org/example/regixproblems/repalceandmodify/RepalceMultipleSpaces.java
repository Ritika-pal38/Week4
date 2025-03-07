package org.example.regixproblems.repalceandmodify;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RepalceMultipleSpaces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String regixCode = "\\s+";
        String text = input.nextLine();
        Pattern pattern = Pattern.compile(regixCode);
        Matcher matcher = pattern.matcher(text);

        String repalcedText = text.replaceAll(regixCode," ");
        System.out.println("Replaced Text: "+repalcedText);

    }
}
