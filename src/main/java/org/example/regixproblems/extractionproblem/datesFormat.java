package org.example.regixproblems.extractionproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class datesFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String regexCode = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d{2}\\b";
        Pattern pattern = Pattern.compile(regexCode);
        Matcher matcher = pattern.matcher(text);
        List<String> Dates = new ArrayList<>();
        while (matcher.find()){
            Dates.add(matcher.group());
        }
        System.out.println(Dates);
    }

}
