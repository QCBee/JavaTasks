package com.javatasks.task_19;

import java.util.concurrent.ThreadLocalRandom;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Student details: name " + name + " and age " + age;
    }

    public static int generateAge(){
        return ThreadLocalRandom.current().nextInt(16,90);
    }

}
