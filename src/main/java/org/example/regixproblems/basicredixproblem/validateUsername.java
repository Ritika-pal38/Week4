package org.example.regixproblems.basicredixproblem;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateUsername {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = "^\\D\\w{5,15}";
        Pattern pattern = Pattern.compile(text);
        String username = input.next();
        Matcher matcher = pattern.matcher(username);

        if(matcher.matches()){
            System.out.println("Correctly matched Username : "+matcher.group());
        }
        else{
            System.out.println("Invalid username");
        }
    }
}
