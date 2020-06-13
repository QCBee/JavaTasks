package com.javatasks.task_13;

import java.util.Scanner;

/**
 * +Создайте класс Animal, Dog, Cat.
 *
 * +Сделайте так что бы name, age поля были унаследованы в Dog, Cat.
 *
 * +Добавьте в Animal конструктор в котором задаются значения всех полей класса.
 *
 * +С помощью super() или подсказок Idea (как на видео с занятия) добавьте вызов конструктора
 * родителя в классы наследники Cat, Dog.
 *
 * +Добавьте метод toString() в базовый класс. Пускай выводит текст "I am animal."
 *
 * +Переопределите метод toString() в классах наследниках. Пускай выводят информацию о том,
 * кто они на самом деле и значения своих полей - "I am a Dog, with name, with age."
 */

public class ZooMarket {
    public static void main(String[] args) {
        while (true) {
            showZooMarketMenu();
            Scanner scanner = new Scanner(System.in);
            String selectedMenu = scanner.nextLine();
            if (selectedMenu.equals("0") || selectedMenu.contains("exit") ||
                    selectedMenu.contains("EXIT") || selectedMenu.contains("Exit")) {
                System.out.println("You selected exit menu item. See you later=)");
                break;
            }

            switch (selectedMenu) {
                case "1":
                    createNewCat();
                    break;
                case "2":
                    createNewDog();
                    break;
                case "3":
                    createOtherAnimal();
                    break;
                default:
                    System.out.println("You entered invalid menu item");
            }
        }
    }

    public static void showZooMarketMenu() {
        System.out.println("Please select the animal that you want to add to ZooMarket");
        System.out.println("1. Add new Cat");
        System.out.println("2. Add new Dog");
        System.out.println("3. Category of animal is another");
        System.out.println("0. Exit");
    }

    public static String getAnimalName() {
        System.out.println("Please enter the name of Animal");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getAnimalAge() {
        System.out.println("Please enter the age of Animal");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void createNewCat() {
        //Создала экземпляр класса Cat, переопределила методы - выводит что эт кот и он маякает
        Animal cat = new Cat(getAnimalAge(), getAnimalName());
        System.out.println(cat.toString());
        System.out.println(cat.speak());
        System.out.println();
    }

    public static void createNewDog() {
        //Создала экземпляр класса Dog, переопределила методы - выводит что это собака и что она гавкает
        Animal dog = new Dog(getAnimalAge(), getAnimalName());
        System.out.println(dog.toString());
        System.out.println(dog.speak());
        System.out.println();
    }

    public static void createOtherAnimal() {
        //Создала экземпляр класса Animal
        Animal someAnimal = new Animal(getAnimalAge(), getAnimalName());
        System.out.println(someAnimal.toString());
        System.out.println(someAnimal.speak());
        System.out.println();
    }
}