package com.javatasks.task_13;

public class Dog extends Animal {
    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString(){
        return "I am dog with name " + getName() + " and age " + getAge();
    }

    @Override
    public String speak(){
        return "I'm barking!";
    }
}