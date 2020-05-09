package com.javatasks.task_4;

import java.util.Scanner;

/**
 * Напишите программу, которая для 3-х координат вектора x, y, и z,
 * с основанием у начала координат вычисляет единичный
 * вектор и выводит его на консоль.
 *
 * Для нахождения единичного вектора, нужно посчитать длину исходного
 * вектора и разделить каждую из координат на его длину.
 *
 * Длина вектора - Math.sqrt(X  X + Y  Y + Z * Z)
 *
 * Пример:
 * Единичный вектор для вектора (5, 0, 0) => (1, 0, 0)
 *
 */

public class Vector {
    public static void main(String [] args){
        System.out.println("Please enter X coordinate for vector and press Enter");
        Scanner enteredCoordinates = new Scanner(System.in);
        int x = enteredCoordinates.nextInt();
        System.out.println("Please enter Y coordinate for vector and press Enter");
        int y = enteredCoordinates.nextInt();
        System.out.println("Please enter Z coordinate for vector and press Enter");
        int z = enteredCoordinates.nextInt();
        String text = "Единичный векторя для вектора ";
        double d = findVectorLength(x, y, z);
        int x1 = (int) findXCoordinate(x, d);
        int y1 = (int) findYCoordinate(y, d);
        int z1 = (int) findZCoordinate(z, d);
        System.out.println(text + "(" + x + ", " + y + ", " + z + ") => (" + x1 + ", " + y1 +", " + z1 + ")");

    }

    private static double findVectorLength(int x, int y, int z){
        return Math.sqrt(x * x + y * y + z * z);
    }

    private static double findXCoordinate(int x, double d) {
        return x / d;
    }

    private static double findYCoordinate(int y, double d) {
        return y / d;
    }

    private static double findZCoordinate(int z, double d) {
        return z / d;
    }
}
