package com.javatasks.task_2;

import java.util.Scanner;

/**
 * Створіть застосування що знаходить корені рівняння виду ax2 + bx + c = 0. Коефіцієнти задаються через змінні:
 *
 * double a;
 * double b;
 * double c;
 * Примітка: для обрахування квадратного кореня використовуйте конструкцію Math.sqrt(). Наприклад:
 *
 * double x = Math.sqrt(4);
 * після виконання х буде рівним 2
 *
 * Результат повинен мати наступний формат (за умови що корені, наприклад, 2 та 3):
 *
 * x1=2
 * x2=3
 * Якщо корінь один (наприклад 5)
 *
 * x1=5
 * x2=5
 * Якщо корені відсутні
 *
 * x1=
 * x2=
 */

public class SquareRoot {

    public static void main(String[] args) {
        //Entering the a, b and c parameters for square expression
        Scanner variablesForExpressions = new Scanner(System.in);
        System.out.println("This program is used for finding the roots of the square expresion of the following view:" +
                "Ax^2 + Bx + C = 0. Please enter any numeric value as A parameter and press Enter key");
        double a = variablesForExpressions.nextDouble();
        System.out.println("Please enter any numeric value as parameter B and press Enter key");
        double b = variablesForExpressions.nextDouble();
        System.out.println("Please enter any numeric value as C parameter and press Enter key. " +
                "After that you can see the roots of the square expression");
        double c = variablesForExpressions.nextDouble();
        double x1;
        double x2;
        String type;
        if (a != 0 & b != 0 & c != 0) {
            type = "FULL_SQUARE_EXPRESSION"; //ax^2 + bx + c = 0
        } else {
            if ((a == 0 && b != 0 && c != 0) | (b == 0 && a != 0 && c != 0) | (c == 0 && b != 0 && a != 0) | (b != 0 && a == 0 && c == 0)) {
                if ((b == 0 && a != 0 && c != 0) | (c == 0 && b != 0 && a != 0)) {
                    type = "NON_FULL_SQUARE_EXPRESSION"; //ax^2 + c = 0 OR ax^2 + bx = 0
                } else {
                    type = "SIMPLE_EXPESSION"; //bx + c = 0 OR bx = 0
                }
            } else {
                type = "ZERO_EXPRESSION"; // 0 = 0 OR 3 = 0
            }
        }

            switch (type) {
                case "FULL_SQUARE_EXPRESSION":
                    double descriminant = (b * b - 4 * (a * c));
                    if (descriminant >= 0) {
                        x1 = (-b + Math.sqrt(descriminant)) / (2 * a);
                        x2 = (-b - Math.sqrt(descriminant)) / (2 * a);
                        System.out.println("x1=" + x1);
                        System.out.println("x2=" + x2);
                    } else {
                        System.out.println("x1=");
                        System.out.println("x2=");
                    }
                    break;
                case "NON_FULL_SQUARE_EXPRESSION":
                    if (b == 0) { //ax^2 + c = 0
                        if (-(c / a) > 0) {
                            x1 = Math.sqrt(-(c / a));
                            x2 = x1;
                            System.out.println("x1=" + x1);
                            System.out.println("x2=" + x2);
                        } else {
                            System.out.println("x1=");
                            System.out.println("x2=");
                        }
                    } else {
                        x1 = 0; // ax^2 + bx = 0
                        x2 = -(b / a);
                        System.out.println("x1=" + x1);
                        System.out.println("x2" + x2);
                    }
                    break;
                case "SIMPLE_EXPESSION":
                    //bx + c = 0
                    if (c != 0) {
                        x1 = -(c / b);
                    } else { //bx=0
                        x1 = 0;
                    }
                    x2 = x1;
                    System.out.println("x1=" + x1);
                    System.out.println("x2=" + x2);
                    break;
                case "ZERO_EXPRESSION":
                    System.out.println("x1=");
                    System.out.println("x2=");
                    break;
            }
        }
    }

