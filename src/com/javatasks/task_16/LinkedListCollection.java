package com.javatasks.task_16;

import java.util.LinkedList;

/**
 *  1) +создаётся коллекция
 *  2) +добавляется 5 любых числе
 *  3) +выводится содержимое коллекции в цикле for-each
 *  4) далее удивляется 3й элемент и снова выводится содержимое коллекции
 */

public class LinkedListCollection {
    public static void main(String[] args) {
        //Create LinkedList collection
        LinkedList<Integer> numbers = new LinkedList<>();

        //Add 5 numbers to collection
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        //Show the numbers in collection after adding new elements
        System.out.println("State of LinkedList Collection after creation and adding the elements");
        System.out.println("Size of collection is: " + numbers.size() + " elements");
        for (Integer item : numbers) {
            System.out.println(item);
        }
        System.out.println();

        //Remove 3d element from collection
        numbers.remove(2);

        //Show the numbers in collection after deleting the elements
        System.out.println("State of LinkedList Collection after deleting the 3d element");
        System.out.println("Size of collection is: " + numbers.size() + " elements");
        for (Integer item : numbers) {
            System.out.println(item);
        }
        System.out.println();
    }
}







