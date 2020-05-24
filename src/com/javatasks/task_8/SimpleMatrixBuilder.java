package com.javatasks.task_8;

import java.util.Scanner;

/**
 * Build the following grid with STARS AND NUMBERS.
 *  * 2 3 4 5
 *  * * 3 4 5
 *  * * * 4 5
 *  * * * * 5
 *  * * * * *
 *  Size of grid can be applied according to user's decision (max size is 9)
 */

public class SimpleMatrixBuilder {
    public static void main(String[] args) {
        System.out.println("Please enter the size of grid.\n" +
                "The numbers from 1 to 9 are valid. After that tress Enter button");
        Scanner scanner = new Scanner(System.in);
        int enteredSize = scanner.nextInt();
        if (enteredSize <= 0 || enteredSize >9){
            System.out.println("You entered invalid data - " + enteredSize + "\nYour value should be between " +
                    "1 and 9");
        }
        else {
            buildGrid(enteredSize);
        }
    }

    public static void buildGrid(int enteredSize){
        for (int i = 0; i < enteredSize;i++){
            String row = "";
            for (int j = 0; j < enteredSize; j++){
                if (i < j){
                    row +=String.valueOf(j + 1);
                }
                else {
                    row +="*";
                }
            }
            System.out.println(row);
        }
    }
}