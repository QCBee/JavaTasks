package com.javatasks.task_1;

/**
 * Написать программу решающую следующие уравнения.
 * Переменные x,y,z,n инициализируется перед решением уравнения.
 * Каждое решение оформить в отдельном статическом методе.
 * x - (y + 123) / z * n  		=> считаем в long
 * (x + (50 - y * z) / n) - x 	=> считаем в int
 * x / (y * (z - 1) - 564) + n 	=> считаем в float
 * -x / -y + z / (n + 15) 		=> считаем в double
 */

public class SimpleExpession {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        int z = 3;
        int n = 4;

        System.out.println("Solution for first expression is " + findFistSolution(x,y,z,n));
        System.out.println("Solution for second expression is " + findSecondSolution(x,y,z,n));
        System.out.println("Solution for third expression is " + findThirdSolution(x,y,z,n));
        System.out.println("Solution for forth expression is " + findForthSolution(x,y,z,n));

    }

    public static long findFistSolution(int x, int y, int z, int n) {
        return x - (y + 123) / z * n;
    }

    public static int findSecondSolution(int x, int y, int z, int n) {
        return (x + (50 - y * z) / n) - x;
    }

    public static float findThirdSolution(int x, int y, int z, int n) {
        return x / (y * (z - 1) - 564) + n;
    }

    public static double findForthSolution(int x, int y, int z, int n) {
        return -x / -y + z / (n + 15);
    }
}









