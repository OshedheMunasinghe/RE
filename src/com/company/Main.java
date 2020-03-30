package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the zipcode: ");
        String zipCode = scanner.nextLine();
        if (zipCode.matches("\\d{5}(-\\d{4})?$")) {
            System.out.println(zipCode + " is a valid code.");
        } else {
            System.out.println(zipCode + " is not a valid code.");
        }
        String script = "Procratination is surely not the destination, should we talk about shiny things?";
        Pattern pattern = Pattern.compile("(\\w*(sh|ti|su)\\w*)");
        Matcher matcher = pattern.matcher(script);
        while (matcher.find()){
            System.out.println(matcher.group(1) + " is a shushy word because of " + matcher.group(2));
        }//end while

    }//end main
}
