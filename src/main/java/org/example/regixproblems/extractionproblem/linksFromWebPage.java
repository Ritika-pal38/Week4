package org.example.regixproblems.extractionproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class linksFromWebPage {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String regixCode = "https?://(?:www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b(?:[-a-zA-Z0-9()@:%_\\+.~#?&//=]*)?";
        Pattern pattern = Pattern.compile(regixCode);
        Matcher matcher = pattern.matcher(text);

        List<String> links = new ArrayList<>();
        while (matcher.find()) {
            links.add(matcher.group());
        }
        System.out.print(links);


    }
}
