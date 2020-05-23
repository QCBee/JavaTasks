package com.javatasks.task_6;

import java.util.Scanner;

/**
 *
 Given a string str, if the string starts with "f" return "Fizz".
 If the string ends with "b" return "Buzz".
 If both the "f" and "b" conditions are true, return "FizzBuzz".
 In all other cases, return the string unchanged. (See also: FizzBuzz Code)


 fizzString("fig") → "Fizz"
 fizzString("dib") → "Buzz"
 fizzString("fib") → "FizzBuzz"
 */

public class StringModification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string and press Enter key");
        String enteredString = scanner.nextLine();
        System.out.println(fizzString(enteredString));
    }

    public static String fizzString(String enteredString) {
        String firstString = "Fizz";
        String secondString = "Buzz";
        if (enteredString.startsWith("f") || enteredString.startsWith("F")) {
            if (enteredString.endsWith("b") || enteredString.endsWith("B")) {
                return firstString + secondString;
            } else {
                return firstString;
            }
        }
        else {
            if (enteredString.endsWith("b") || enteredString.endsWith("B")){
                return secondString;
            }
            else {
                return enteredString;
            }
        }
    }
}