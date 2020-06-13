package com.javatasks.task_15;
import java.util.Scanner;

/**
The parameter weekday is true if it is a weekday,
 and the parameter vacation is true if we are on vacation.
 We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
sleepIn(true, true) -> true
 */

public class TimeToSleep {
    public static void main(String[] args) {
        System.out.println(sleepIn(isWeekDay(),isVacatioDay()));
    }

    public static boolean isWeekDay(){
        System.out.println("Please enter the information about weekday");
        System.out.println("1. - Today is weekday");
        System.out.println("2. - Today is NOT weekday");
        Scanner scanner = new Scanner(System.in);
        int enteredWeekdayValue = scanner.nextInt();
        if (enteredWeekdayValue == 1) return true;
        else return false;
    }

    public static boolean isVacatioDay(){
        System.out.println("Please enter the information about vacation");
        System.out.println("1. - Today is vacation");
        System.out.println("2. - Today is NOT vacation");
        Scanner scanner = new Scanner(System.in);
        int enteredVacationValue = scanner.nextInt();
        if (enteredVacationValue == 1){
            return true;
        }
        return false;
    }

    public static String sleepIn(boolean weekday, boolean vacation){
        if ((vacation == true &&(weekday == true || weekday == false) ||
                (weekday == false &&(vacation == true || vacation == false))))
                         {
            return "It's time to sleep";
        } else {
            return "It's time to work!";
        }
    }
}
