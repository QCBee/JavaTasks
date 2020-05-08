package com.javatasks.task_3;

import java.util.Scanner;

/**
 * Составить программу, которая будет разлаживать 5-ти значное число на отдельные цифры данного числа, слева-направо. Число задается в параметре статического метода.
 * Каждую цифру вывести в отдельной строке.
 * 45685
 * 4
 * 5
 * 6
 * 8
 * 5
 */

public class NumberSeparator {
    public static void main(String [] args) {
        System.out.println("Please enter any number in order to make modifications");
        Scanner enteredValue = new Scanner(System.in);
        int value = enteredValue.nextInt();
        separateValue(value);
    }

    public static void separateValue(int value){
        if (value > 0) {
            separateValue(value / 10);
            System.out.println(value % 10);
        }
    }


}
