package com.javatasks.task_10;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 * - предложить на выбор пункты меню
 * - должен уметь (создавать пустой файл,
 * удалять файл,
 * список файлов,
 * переименовывать файл,
 * показывать путь к текущей директории,
 * завершать работу)
 */

public class FileManager {
    public static void main(String[] args) throws IOException {
        while (true) {
            showMenuItemsForFiles();
            Scanner scanner = new Scanner(System.in);
            String selectedFileMenuItem = scanner.nextLine();
            System.out.println("You selected following menu item: " + selectedFileMenuItem);
            if (selectedFileMenuItem.equals("0") || selectedFileMenuItem.contains("exit") ||
                    selectedFileMenuItem.contains("EXIT") || selectedFileMenuItem.contains("Exit")) {
                System.out.println("You selected exit menu item. See you later=)");
                break;
            }
            switch (selectedFileMenuItem) {
                case "1":
                    createEmptyFile(getFilePath(), getFileName());
                    break;
                case "2":
                    renameFileName(getFilePath(), getFileName(), getNewFileName());
                    break;
                case "3":
                    showCurrentPathToDirectory();
                    break;
                case "4":
                    showInfoAboutFile(getFilePath(), getFileName());
                    break;
                case "5":
                    doFileExist(getFilePath(), getFileName());
                    break;
                case "6":
                    showListOfFiles(getFilePath());
                    break;
                case "7":
                    deleteFile(getFilePath(), getFileName());
                    break;
                default:
                    System.out.println("You selected invalid menu item: " + selectedFileMenuItem);
            }

        }
    }

    //Methods for working with files
    public static String getFileName() {
        System.out.println("Please enter the file name with needed type");
        System.out.println("Example: File_name.type");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        return fileName;
    }

    public static String getFilePath() {
        System.out.println("Please enter the path for file according to your OS");
        System.out.println("Example: c:\\directory\\");
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        return filePath;
    }

    public static String getNewFileName() {
        System.out.println("Please enter new file name");
        Scanner scanner = new Scanner(System.in);
        String newFileName = scanner.nextLine();
        return newFileName;
    }

    public static void createEmptyFile(String filePath, String fileName) throws IOException {
        File file = new File(filePath, fileName);
        System.out.println("You selected following path for file: " + filePath);
        System.out.println("You selected following name and type for file: " + fileName);
        if (file.exists()) {
            System.out.println("This file already exists in system");
        } else {
            file.createNewFile();
            System.out.println("File was created");
        }
        System.out.println();
    }

    public static void doFileExist(String filePath, String fileName) {
        File file = new File(filePath, fileName);
        System.out.println("You're searching following file: " + fileName);
        System.out.println("You're searching by following path: " + filePath);
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does NOT exist with such path and name");
        }
        System.out.println();
    }

    public static void deleteFile(String filePath, String fileName) {
        File file = new File(filePath, fileName);
        System.out.println("You selected following file to delete: " + fileName);
        System.out.println("You selected following path for file: " + filePath);
        if (file.exists()) {
            file.delete();
            System.out.println("Your file was deleted successfully");
        } else {
            System.out.println("Such file does NOT exist in system");
        }
        System.out.println();
    }

    public static void showListOfFiles(String filePath) {
        File file = new File(filePath);
        String[] fileNames = file.list();
        int quantityOfFiles = fileNames.length;
        System.out.println();
        System.out.println("Quantity of files in selected directory: " + quantityOfFiles);
        if (quantityOfFiles > 0) {
            System.out.println("List of files exit by selected path: " + Arrays.toString(fileNames));
        } else {
            System.out.println("There are NOT any files in the selected directory");
        }
        System.out.println();
    }

    public static void renameFileName(String filePath, String fileName, String fileNewName) {
        File file = new File(filePath, fileName);
        if (file.exists()) {
            file.renameTo(new File(filePath, fileNewName));
            System.out.println("Old file name is: " + fileName);
            System.out.println("New file name is: " + fileNewName);
            System.out.println("File was successfully renamed");
        } else {
            System.out.println("Such file does NOT exist in the system: " + fileName);
        }
        System.out.println();
    }

    public static void showInfoAboutFile(String filePath, String fileName) {
        File file = new File(filePath, fileName);
        if (file.exists()) {
            Date convertedEpoch = new Date(file.lastModified());
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh-MM-ss");
            String formattedDate = dateFormat.format(convertedEpoch);
            System.out.println();
            System.out.println("Name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Size of file: " + file.length() + " bytes");
            System.out.println("Last modified date: " + formattedDate);
            if (file.isHidden()) {
                System.out.println("File is hidden");
            } else {
                System.out.println("File is NOT hidden");
            }
        } else {
            System.out.println("Selected file does NOT exist in system: " + fileName);
        }
        System.out.println();
    }

    public static void showCurrentPathToDirectory() {
        System.out.println("Working Directory: " + System.getProperty("user.dir"));
    }

    //Methods for work with menu items
    public static void showMenuItemsForFiles() {
        System.out.println();
        System.out.println("Select the menu item");
        System.out.println("1 Create empty file");
        System.out.println("2 Rename selected file");
        System.out.println("3 Show the path to current directory");
        System.out.println("4 Show the details about file");
        System.out.println("5 Search the file");
        System.out.println("6 Show the list of all files in the directory");
        System.out.println("7 Delete file");
        System.out.println("0 Exit from file manager");
        System.out.println();
    }
}