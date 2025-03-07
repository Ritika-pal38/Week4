package org.example.regixproblems.advancedproblems;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddress {
    public static void main(String[] args) {
        String[] testIPs = {"192.168.1.1", "255.255.255.255", "256.100.100.100", "192.168.1", "abc.def.ghi.jkl"};

        for (String ip : testIPs) {
            System.out.println(ip + " is valid: " + IPAddressValidator.isValidIP(ip));
        }

    }

}
 class IPAddressValidator {
     public static  boolean isValidIP(String ip) {
         // Regular expression for validating IPv4 address
         String regex = "^((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";

         // Compile regex pattern
         Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(ip);

         // Return whether the IP matches the pattern
         return matcher.matches();
     }
 }
