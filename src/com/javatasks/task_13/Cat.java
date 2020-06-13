package com.javatasks.task_13;

public class Cat extends Animal {
    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString(){
        return "I am cat with name " + getName() + " and with age " + getAge();
    }

    @Override
    public String speak(){
        return "I'm meowing!";
    }
}