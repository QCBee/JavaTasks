package com.javatasks.task_7;

import java.util.Scanner;

/**
 *  Create new class EnvVar
 * • Add getting specific environment variable
 * • Pass this env var as command line parameter
 * • Print value of this EnvVar to command prompt
 */

public class EnvVar {
    public static void main(String[] args) {
        System.out.println("Please enter any type of environment variables and press Enter key\n" +
                "Example of environment variables in the system:\n" +
                "PATH, TEMP, JAVA_HOME, USERNAME etc.\n" +
                "Note: Entered data is case-insensitive" );
        Scanner scanner = new Scanner(System.in);
        String selectedVariable = scanner.nextLine();
        System.out.println("You selected following environment variable - " + selectedVariable);
        System.out.println("This environment variable has following parameters - " + getEnvVar(selectedVariable));

    }
    private static String getEnvVar(String selectedVariable) {
            return System.getenv(selectedVariable);
        }
    }