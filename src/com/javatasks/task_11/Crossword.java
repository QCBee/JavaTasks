package com.javatasks.task_11;

import java.util.Scanner;

/**
 * Your friend image some word for you. Try to find out what this word is
 * Try to find out the word using following menu options:
 * - quantity of letters in the word;
 * - find out if the selected letter exists in the secret word;
 * - try to open any letter;
 * - you know the word and are ready to write it down
 * - find out if some substring exists in the secret word

 */
public class Crossword {
    public static void main(String[] args) {
        System.out.println("Please enter the secret word or some phrase for game");
        Scanner scanner = new Scanner(System.in);
        String secretWord = scanner.nextLine();

        System.out.println();
        System.out.println("You have some secret word. Try to find out it");
        System.out.println();

        while (true) {
            showMenuItemForCrosswordGame();

            String menuItem = scanner.nextLine();
            System.out.println("You selected following menu item: " + menuItem);

            if (menuItem.contains("0") || menuItem.contains("Exit")){
                System.out.println("Exit from game");
                break;
            }

            switch (menuItem){
                case "1":
                    getLengthWord(secretWord);
                    break;
                case "2":
                    compareLetter(secretWord);
                    break;
                case "3":
                    getLetterBySelectedPosition(secretWord);
                    break;
                case "4":
                    compareWords(secretWord);
                    break;
                case "5":
                    compareSubstring(secretWord);
                    break;
                case "6":
                    getSubstring(secretWord);
                default:
                    System.out.println("You selected invalid menu item. Try again");
                    System.out.println();

            }

        }

    }

    public static void getLengthWord(String secretWord){
        //used trim() method in order to cut whitespaces
        //used length() method in order to find the length of string
        System.out.println("The length of word is: " + secretWord.trim().length());
        System.out.println();
    }

    public static void compareWords(String secretWord){
        System.out.println("Please enter you the secret word");
        Scanner scanner = new Scanner(System.in);
        String enteredWord = scanner.nextLine();
        //use trim() method in order to cut the whitespaces for entered word
        //use equalsIgnoreCase() method in order to compare both words with ignoring the case
        if (enteredWord.trim().equalsIgnoreCase(secretWord.trim())){
            System.out.println("Congrads! Your answer is correct");
        }
        else {
            System.out.println("You are wrong. Please try again");
        }
        System.out.println();
    }

    public static void getLetterBySelectedPosition(String secretWord) {
        System.out.println("Please select position where you want to open the letter");
        Scanner scanner = new Scanner(System.in);
        int selectedPosition = scanner.nextInt();
        //used length() method in order to find the length of word
        int wordLength = secretWord.length();
        if (selectedPosition <= wordLength) {
            // used charAt() method in order to get letter by its position(index)
            char result = secretWord.trim().charAt(selectedPosition - 1);
            System.out.println("Position of letter is: " + (selectedPosition));
            System.out.println("Letter is: " + result);
        } else {
            System.out.println("You entered invalid position: " + selectedPosition);
        }
        System.out.println();
    }

    public static void compareLetter(String secretWord){
        System.out.println("Please enter you letter");
        Scanner scanner = new Scanner(System.in);
        String enteredLetter = scanner.next();
        //used trim() method in order to cut the whitespaces for entered letter
        //used indexOf() method in order to find some letter in the string
        int result = secretWord.trim().indexOf(enteredLetter.trim());
        System.out.println("You selected letter: " + enteredLetter);
        // if indexOf() returns the index (from 0 to length - 1) -> suggested letter exists in the word
        if (result >=0){
            System.out.println("The secret word has this letter");
            System.out.println("It has position number: " + (result + 1));
        }
        // if indexOf() returns -1 - > suggested letter does NOT exist in the word
        else {
            System.out.println("The secret word does NOT have this letter. Please try again");
        }
        System.out.println();
        }

    public static void compareSubstring(String secretWord){
        System.out.println("Enter your substring");
        Scanner scanner = new Scanner(System.in);
        String enteredSubstring = scanner.nextLine();
        //used trim() in order to cut the whitespaces for entered sequence of letters
        //used indexOf() in order to find the entered sequence of letters in the word
        int result = secretWord.trim().indexOf(enteredSubstring);
        System.out.println("You entered substring: " +  enteredSubstring);
        // if indexOf() returns the index (from 0 to length - 1) -> suggested sequence of letter exists in the word
        if (result >=0){
            System.out.println("This substring exists in the secret word");
            System.out.println("This substring starts from [" + (result + 1) + "] position in the secret word");
        }
        // if indexOf() returns -1 - > suggested sequence of letters does NOT exist in the word
        else {
            System.out.println("This substring does NOT exist in the word");
        }
        System.out.println();
    }

    public static void getSubstring(String secretWord){
        System.out.println("Please enter start position for getting substring");
        Scanner scanner = new Scanner(System.in);
        int startPosition = scanner.nextInt();
        System.out.println("Please enter end position for getting substring");
        int endPosition = scanner.nextInt();
        //used length() method in order to find the length of word
        int length = secretWord.trim().length();
        System.out.println("You selected positions: [" + startPosition + " - " + endPosition + "]" );
        if (endPosition <= length){
            System.out.println("Find substring for this positions is:");
            //used substring(startIndex, endIndex) method in order to extract the sequence of letters
            System.out.println(secretWord.substring(startPosition - 1, endPosition));
        }
        else {
            System.out.println("Entered end position is bigger than the length of word");
        }
        System.out.println();
    }

    public static void showMenuItemForCrosswordGame(){
        System.out.println("Please select the help option");
        System.out.println("1. I want to know the length of word");
        System.out.println("2. I want to know if some letter exists in the secret word");
        System.out.println("3. I want to open some letters");
        System.out.println("4. I know the word and ready to write it down");
        System.out.println("5. I want to know if sequence of letters  exists in the secret word");
        System.out.println("6. I want to open substring from secret word");
        System.out.println("0. Exit from game");
        System.out.println();

    }
    }
