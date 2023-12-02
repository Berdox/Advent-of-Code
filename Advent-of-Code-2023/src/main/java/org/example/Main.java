package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String inputText = "cdo12bob3";

        // Define a regex pattern to match the first number in the text
        String regex = "\\d";
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object and apply the pattern to the input text
        Matcher matcher = pattern.matcher(inputText);

        // Check if a match is found
        if (matcher.find()) {
            // Get the matched number
            String matchedNumber = matcher.group();

            // Convert the matched string to an integer
            int firstNumber = Integer.parseInt(matchedNumber);

            // Print the result
            System.out.println("First number in the text: " + firstNumber);
        } else {
            System.out.println("No number found in the text.");
        }
    }
}