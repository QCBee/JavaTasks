package com.javatasks.task_18;

import java.util.HashSet;

/**
 *  1) +создаётся коллекция
 *  2) +добавляется 5 любых числе
 *  3) +выводится содержимое коллекции в цикле for-each
 *  4) далее удивляется 3й элемент и снова выводится содержимое коллекции
 */

public class HashSetCollection {
    public static void main(String[] args) {
        //Create HashSet Collection
        HashSet <Integer> numbers = new HashSet<>();

        //Add 5 elements in the collection
        for (int i = 1; i <= 5 ; i++) {
            numbers.add(i);
        }

        //Show elements in the HashSet Collection after adding new elements
        System.out.println("State of HashSet Collection after creation and adding the elements");
        System.out.println("Size of collection is: " + numbers.size() + " elements");
        for (Integer item:numbers) {
            System.out.println(item);
        }
        System.out.println();


    }
}
