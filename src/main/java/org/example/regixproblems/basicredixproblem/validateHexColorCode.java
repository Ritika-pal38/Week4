package org.example.regixproblems.basicredixproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateHexColorCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String regexCode = "^[#]\\[A-Za-z0-9]{6}";
        String colorCode = input.next();
        Pattern pattern = Pattern.compile(regexCode);
        Matcher matcher = pattern.matcher(colorCode);

        if(matcher.matches()){
            System.out.println("HexColor Code "+colorCode+" is a valid code.");
        }
        else{
            System.out.println("HexColor Code "+colorCode+" is an invalid code.");
        }
    }
}
