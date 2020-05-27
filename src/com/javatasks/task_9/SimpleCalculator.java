package com.javatasks.task_9;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose menu item: ");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("0. Exit from the program");

            Scanner myObj = new Scanner(System.in);
            String menuItem = myObj.nextLine();
            System.out.println("Menu item is: " + menuItem);

            if (menuItem.contains("0") || menuItem.contains("exit") ||
                    menuItem.contains("EXIT") || menuItem.contains("Exit")) {
                System.out.println("You selected exit menu item. See you later=)");
                break;
            }

            switch (menuItem) {
                case "1":
                    System.out.println("Result of addition is: "
                            + findAddition(readFirstNumber(), readSecondNumber()));
                    break;
                case "2":
                    System.out.println("Result of subtraction is: "
                            + findSubtraction(readFirstNumber(), readSecondNumber()));
                    break;
                case "3":
                    System.out.println("Result of multiplication is: "
                            + findMultiplication(readFirstNumber(), readSecondNumber()));
                    break;
                case "4":
                    System.out.println("Result of division is: "
                            + findDivision(readFirstNumber(), readSecondNumber()));
                    break;
                default:
                    System.out.println("You selected not existed menu item. Please try again");
            }
        }
    }
    public static int readFirstNumber() {
        System.out.println("Please enter first number: ");
        Scanner myObj = new Scanner(System.in);
        int firstNumber = myObj.nextInt();
        System.out.println("Your selected first number is: " + firstNumber);
        return firstNumber;
    }

    public static int readSecondNumber() {
        System.out.println("Please enter second number: ");
        Scanner myObj = new Scanner(System.in);
        int secondNumber = myObj.nextInt();
        System.out.println("Your selected second number is: " + secondNumber);
        return secondNumber;
    }

    public static int findAddition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int findSubtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int findMultiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static int findDivision(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

}





