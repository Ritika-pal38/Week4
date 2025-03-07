package org.example.regixproblems.basicredixproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateLicensePlateNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = "^[A-Z]{2}\\d{4}$";
        String licenseNumber = input.next();
        Pattern pattern = Pattern.compile(text);
        Matcher matcher = pattern.matcher(licenseNumber);
        if(matcher.matches()){
            System.out.println("License Plate Number "+licenseNumber+" is a valid number.");
        }
        else{
            System.out.println("Invalid Number");
        }
    }
}
