package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("мяу мяу", 12, true);
        System.out.println(cat.getSound());


        Cow cow = new Cow("муууу муууу",23,true);
        System.out.println(cow.getSound());

        Dog dog = new Dog("gav gav",10,true);
        System.out.println(dog.getSound());
    }
}