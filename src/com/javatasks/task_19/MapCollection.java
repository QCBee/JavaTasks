package com.javatasks.task_19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * +Создать Map
 * +Наполнить его объектами Student("номер паспорта", "Имя")
 * +Выведите на экран содержимое коллекции
 */

public class MapCollection {
    public static void main(String[] args) {
        Map <String, Student> students = new HashMap<>();

        students.put("OT74562222", new Student("Test Student_1", Student.generateAge()));
        students.put("UT45454545", new Student("Test Student_2", Student.generateAge()));
        students.put("UR45454545", new Student("Test Student_3", Student.generateAge()));

        Set<Map.Entry<String,Student>> entries = students.entrySet();
        for (Map.Entry <String, Student> items:entries) {
            System.out.println();
            System.out.println("Passport Code is: " + items.getKey());
            System.out.println(items.getValue().toString());
            System.out.println();
        }
    }
}