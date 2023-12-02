package org.example.Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Trebuchet {

    public static void main(String[] args) {
       // getLaunchCode("src/main/java/org/example/Day1/launchCode.txt");
       int value = getLaunchCodeV2("src/main/java/org/example/Day1/launchCodeV2.txt");
       System.out.print(value);
    }
    public static int getLaunchCode(String file) {
        int finalValue = 0;
        try {
            Scanner scan = new Scanner(new File(file));

            String regex = "(\\d)";
            Pattern pattern = Pattern.compile(regex);

            while(scan.hasNextLine()) {
                String result = "";
                String line = scan.nextLine();
                Matcher matcher = pattern.matcher(line);

                while (matcher.find()) {
                    result = result + matcher.group();
                }
                int length = result.length() - 1;
                String value = result.substring(0,1) + result.substring(length, length+1);
                finalValue = finalValue + Integer.parseInt(value);
                System.out.println(finalValue);
            }
        } catch(FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return finalValue;
    }

    public static int getLaunchCodeV2(String file) {
        int finalValue = 0;
        try {
            Scanner scan = new Scanner(new File(file));

            String regex = "\\d|one|two|three|four|five|six|seven|eight|nine";
            Pattern pattern = Pattern.compile(regex);

            while(scan.hasNextLine()) {
                String result = "";
                String line = scan.nextLine();
                Matcher matcher = pattern.matcher(line);

                while (matcher.find()) {
                    String found = matcher.group();
                    //System.out.println(found);
                    switch (found) {
                        case "one":
                            result = result + "1";
                            break;
                        case "two":
                            result = result + "2";
                            break;
                        case "three":
                            result = result + "3";
                            break;
                        case "four":
                            result = result + "4";
                            break;
                        case "five":
                            result = result + "5";
                            break;
                        case "six":
                            result = result + "6";
                            break;
                        case "seven":
                            result = result + "7";
                            break;
                        case "eight":
                            result = result + "8";
                            break;
                        case "nine":
                            result = result + "9";
                            break;
                        default:
                            result = result + found;
                    }
                    System.out.println("result: " + result);
                }
                int length = result.length() - 1;
                String value = result.substring(0,1) + result.substring(length, length+1);
                System.out.println("Value: " + value);
                finalValue = finalValue + Integer.parseInt(value);
                System.out.println("final value: " + finalValue);
            }
        } catch(FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return finalValue;
    }
}
