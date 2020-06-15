package com.javatasks.task_17;

import java.util.ArrayList;

/**
 *  1) +создаётся коллекция
 *  2) +добавляется 5 любых числе
 *  3) +выводится содержимое коллекции в цикле for-each
 *  4) далее удивляется 3й элемент и снова выводится содержимое коллекции
 */

public class ArrayListCollection {
    public static void main(String[] args) {
        //Create ArrayList Collection
        ArrayList <Integer> numbers = new ArrayList<>();

        //Add 5 elements to collection
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        //Show the numbers in collection after adding elements
        System.out.println("State of ArrayList Collection after creation and adding the elements");
        System.out.println("Size of collection is: " + numbers.size() + " elements");
        for (Integer item:numbers) {
            System.out.println(item);
        }
        System.out.println();

        //Remove the 3d element in collection
        numbers.remove(2);

        //Show the numbers in the collection after deleting the elements
        System.out.println("State of ArrayList Collection after deleting the 3d element");
        System.out.println("Size of collection is: " + numbers.size() + " elements");
        for (Integer item:numbers) {
            System.out.println(item);
        }
        System.out.println();
    }
}
